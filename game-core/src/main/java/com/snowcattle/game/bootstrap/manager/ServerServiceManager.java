package com.snowcattle.game.bootstrap.manager;

import com.snowcattle.game.service.IServerService;

import java.util.HashMap;
import java.util.Map;

/**
 * 服务器启动管理类
 */
public class ServerServiceManager {

	public static final String SERVICE_ID_ROOT = "SERVICE_ROOT";
	private static ServerServiceManager instance;
	private final Map<String, IServerService> serviceMap = new HashMap<String, IServerService>();

	public static ServerServiceManager getInstance() {
		if (instance == null) {
			instance = new ServerServiceManager();
		}
		return instance;
	}

	public final void registerService(String serviceId, IServerService service) {
		serviceMap.put(serviceId, service);
	}

	public final IServerService getService(String serviceId) {
		return serviceMap.get(serviceId);
	}

	public final IServerService removeService(String serviceId) {
		return serviceMap.remove(serviceId);
	}
}
