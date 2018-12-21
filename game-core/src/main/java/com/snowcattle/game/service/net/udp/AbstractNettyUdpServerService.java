package com.snowcattle.game.service.net.udp;

import com.snowcattle.game.common.ThreadNameFactory;
import com.snowcattle.game.common.constant.Loggers;
import com.snowcattle.game.service.net.AbstractNettyServerService;

import org.slf4j.Logger;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * Created by jwp on 2017/2/4.
 */
public abstract class AbstractNettyUdpServerService extends AbstractNettyServerService {

	private final Logger logger = Loggers.serverLogger;
	private final ThreadNameFactory eventThreadNameFactory;
	private final ChannelInitializer channelInitializer;
	private EventLoopGroup eventLoopGroup;
	private ChannelFuture serverChannelFuture;

	public AbstractNettyUdpServerService(String serviceId, int serverPort, String threadNameFactoryName, ChannelInitializer channelInitializer) {
		super(serviceId, serverPort);
		this.eventThreadNameFactory = new ThreadNameFactory(threadNameFactoryName);
		this.channelInitializer = channelInitializer;
	}

	@Override
	public boolean startService() throws Exception {
		boolean serviceFlag = super.startService();
		Bootstrap b = new Bootstrap();
		eventLoopGroup = new NioEventLoopGroup();
		try {
			b.group(eventLoopGroup)
					.channel(NioDatagramChannel.class)
					.option(ChannelOption.SO_BROADCAST, false)
//                .option(ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION,true)
					.option(ChannelOption.SO_REUSEADDR, true) //重用地址
					.option(ChannelOption.SO_RCVBUF, 65536)
					.option(ChannelOption.SO_SNDBUF, 65536)
					.option(ChannelOption.ALLOCATOR, new PooledByteBufAllocator(false))  // heap buf 's better
					.handler(new LoggingHandler(LogLevel.DEBUG))
					.handler(channelInitializer);
//                    .handler(new GameNetProtoMessageUdpServerChannelInitializer());

			// 服务端监听在9999端口
			serverChannelFuture = b.bind(serverPort).sync();

//            serverChannelFuture.channel().closeFuture().sync();
			serverChannelFuture.channel().closeFuture().addListener(ChannelFutureListener.CLOSE);
		} catch (Exception e) {
			logger.error(e.toString(), e);
			serviceFlag = false;
		}
		return serviceFlag;
	}

	@Override
	public boolean stopService() throws Exception {
		boolean flag = super.stopService();
		if (eventLoopGroup != null) {
			eventLoopGroup.shutdownGracefully();
		}
		return flag;
	}

	public void finish() throws Exception {
//        serverChannelFuture.channel().closeFuture().sync();
	}

}
