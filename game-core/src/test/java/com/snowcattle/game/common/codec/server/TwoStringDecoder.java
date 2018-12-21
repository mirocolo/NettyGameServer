package com.snowcattle.game.common.codec.server;

import java.util.List;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

/**
 * Created by jiangwenping on 2017/11/14.
 */
public class TwoStringDecoder extends MessageToMessageDecoder<String> {

	@Override
	protected void decode(ChannelHandlerContext ctx, String msg, List<Object> out) throws Exception {
		out.add("二次编码" + msg);
	}
}
