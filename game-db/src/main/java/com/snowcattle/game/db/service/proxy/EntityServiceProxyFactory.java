package com.snowcattle.game.db.service.proxy;

import com.snowcattle.game.db.service.entity.EntityService;
import com.snowcattle.game.db.service.redis.RedisService;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.stereotype.Service;

/**
 * Created by jwp on 2017/3/23. 实体存储服务代理服务
 */
@Service
public class EntityServiceProxyFactory {

	@Autowired(required = false)
	private final boolean useRedisFlag = true;
	@Autowired
	private RedisService redisService;

	private static <T extends EntityService> T createProxyService(T entityService, EntityServiceProxy entityServiceProxy) {
		Enhancer enhancer = new Enhancer();
		//设置需要创建子类的类
		enhancer.setSuperclass(entityService.getClass());
		enhancer.setCallback(entityServiceProxy);
		//通过字节码技术动态创建子类实例
		return (T) enhancer.create();
	}

	private EntityServiceProxy createProxy(EntityService EntityService) {
		return new EntityServiceProxy<>(redisService, useRedisFlag);
	}

	public <T extends EntityService> T createProxyService(T entityService) throws Exception {
		T proxyEntityService = createProxyService(entityService, createProxy(entityService));
		BeanUtils.copyProperties(proxyEntityService, entityService);
		return proxyEntityService;
	}

	public RedisService getRedisService() {
		return redisService;
	}

	public void setRedisService(RedisService redisService) {
		this.redisService = redisService;
	}
}
