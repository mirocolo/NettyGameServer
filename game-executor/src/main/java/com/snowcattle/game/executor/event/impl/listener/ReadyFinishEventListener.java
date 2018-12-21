package com.snowcattle.game.executor.event.impl.listener;

import com.snowcattle.game.executor.common.utils.Constants;
import com.snowcattle.game.executor.event.AbstractEventListener;

/**
 * Created by jiangwenping on 17/1/16.
 */
public class ReadyFinishEventListener extends AbstractEventListener {
	@Override
	public void initEventType() {
		register(Constants.EventTypeConstans.readyFinishEventType);
	}
}
