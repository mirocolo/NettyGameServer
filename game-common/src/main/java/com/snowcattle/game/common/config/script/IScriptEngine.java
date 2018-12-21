package com.snowcattle.game.common.config.script;

import java.util.Map;

/**
 * 脚本管理器
 */
public interface IScriptEngine {
	/**
	 * 运行脚本
	 *
	 * @param binding    脚本的参数
	 * @param scriptFile 脚本路径
	 * @param charset    脚本的编码
	 */
	public Object runScript(Map<String, Object> binding, String scriptFile, String charset);

	/**
	 * 运行脚本
	 */
	public Object runScript(Map<String, Object> binding, String scriptContent);

	/**
	 * 执行逻辑表达式,返回结果
	 */
	public boolean doLogicEval(Map<String, Object> binding, String exp);

	/**
	 * 执行数学表达式,返回执行结果
	 */
	double doMathEval(Map<String, Object> binding, String exp);


	/**
	 * 获得脚本的内容
	 */
	public String getScriptContent(String scriptFile, String charset);
}