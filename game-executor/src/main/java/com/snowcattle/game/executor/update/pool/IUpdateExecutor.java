package com.snowcattle.game.executor.update.pool;

import com.snowcattle.game.executor.update.entity.IUpdate;
import com.snowcattle.game.executor.update.thread.dispatch.DispatchThread;

/**
 * Created by jwp on 2017/2/23. 执行一个update
 */
public interface IUpdateExecutor {
	public void executorUpdate(DispatchThread dispatchThread, IUpdate iUpdate, boolean firstFlag, int updateExcutorIndex);

	public void startup();

	public void shutdown();
}
