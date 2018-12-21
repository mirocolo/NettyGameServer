package com.snowcattle.game.common.socket.server;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.util.CharsetUtil;

/**
 * Created by jwp on 2017/1/24.
 */
public class LengthStringDecoder extends StringDecoder {
	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
		out.add(msg.toString(CharsetUtil.UTF_8));
	}
}
