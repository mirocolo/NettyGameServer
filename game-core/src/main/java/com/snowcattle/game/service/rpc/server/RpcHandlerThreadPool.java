package com.snowcattle.game.service.rpc.server;

import com.snowcattle.game.common.ThreadNameFactory;
import com.snowcattle.game.common.annotation.BlockingQueueType;
import com.snowcattle.game.common.constant.GlobalConstants;
import com.snowcattle.game.common.constant.Loggers;
import com.snowcattle.game.thread.policy.AbortPolicy;
import com.snowcattle.game.thread.policy.BlockingPolicy;
import com.snowcattle.game.thread.policy.CallerRunsPolicy;
import com.snowcattle.game.thread.policy.DiscardOldestPolicy;
import com.snowcattle.game.thread.policy.DiscardPolicy;
import com.snowcattle.game.thread.policy.RejectedPolicyType;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by jwp on 2017/3/8.
 */
@Service
public class RpcHandlerThreadPool {

	private final Logger logger = Loggers.threadLogger;
	private ExecutorService executor;

	private static RejectedExecutionHandler createPolicy() {
		RejectedPolicyType rejectedPolicyType = RejectedPolicyType.fromString(System.getProperty(RpcSystemConfig.SystemPropertyThreadPoolRejectedPolicyAttr, "CallerRunsPolicy"));

		switch (rejectedPolicyType) {
			case BLOCKING_POLICY:
				return new BlockingPolicy();
			case CALLER_RUNS_POLICY:
				return new CallerRunsPolicy();
			case ABORT_POLICY:
				return new AbortPolicy();
			case DISCARD_OLDEST_POLICY:
				return new DiscardOldestPolicy();
			case DISCARD_POLICY:
				return new DiscardPolicy();
		}

		return null;
	}

	private static BlockingQueue<Runnable> createBlockingQueue(int queues) {
		BlockingQueueType queueType = BlockingQueueType.fromString(System.getProperty(RpcSystemConfig.SystemPropertyThreadPoolQueueNameAttr, "LinkedBlockingQueue"));

		switch (queueType) {
			case LINKED_BLOCKING_QUEUE:
				return new LinkedBlockingQueue<Runnable>();
			case ARRAY_BLOCKING_QUEUE:
				return new ArrayBlockingQueue<Runnable>(RpcSystemConfig.PARALLEL * queues);
			case SYNCHRONOUS_QUEUE:
				return new SynchronousQueue<Runnable>();
		}

		return null;
	}

	public Executor createExecutor(int threads, int queues) {
		String name = GlobalConstants.Thread.RPC_HANDLER;
		ThreadPoolExecutor executor = new ThreadPoolExecutor(threads, threads, 0, TimeUnit.MILLISECONDS, createBlockingQueue(queues), new ThreadNameFactory(name, false), createPolicy());
		this.executor = executor;
		return executor;
	}

	public ExecutorService getExecutor() {
		return executor;
	}

	public void setExecutor(ExecutorService executor) {
		this.executor = executor;
	}
}

