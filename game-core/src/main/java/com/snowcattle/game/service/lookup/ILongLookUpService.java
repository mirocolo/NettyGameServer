package com.snowcattle.game.service.lookup;

/**
 * Created by jwp on 2017/2/10. 提供查询服务
 */
public interface ILongLookUpService<T extends ILongId> {

	/**
	 * 查找
	 */
	T lookup(long id);

	/**
	 * 增加
	 */
	void addT(T t);

	/**
	 * 移除
	 */
	boolean removeT(T t);

	/**
	 * 清除所有
	 */
	void clear();
}
