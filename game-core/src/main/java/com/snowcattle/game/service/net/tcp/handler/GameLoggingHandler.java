package com.snowcattle.game.service.net.tcp.handler;

import com.snowcattle.game.common.constant.Loggers;

import org.slf4j.Logger;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * Created by jwp on 2017/6/3.
 */
public class GameLoggingHandler extends LoggingHandler {

	private static final Logger errorLogger = Loggers.errorLogger;
	private final ChannelFutureListener exceptionListener = new ChannelFutureListener() {
		@Override
		public void operationComplete(ChannelFuture future) throws Exception {
			if (!future.isSuccess()) {
				Throwable throwable = future.cause();
				if (throwable != null) {
					errorLogger.error(throwable.toString(), throwable);
				}
			}
		}
	};

	public GameLoggingHandler(LogLevel level) {
		super(level);
	}

	@Override
	public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
		if (logger.isEnabled(internalLevel)) {
			logger.log(internalLevel, format(ctx, "WRITE", msg));
		}
		ChannelPromise unvoid = promise.unvoid();
		unvoid.addListener(exceptionListener);
		ctx.write(msg, promise);
	}
}
