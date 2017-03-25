package edu.jyu.config;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 * 测试读取配置文件类ConfigurationManager
 * 
 * @author Jason
 */
public class TestConfigurationManager {

	/**
	 * 测试读取constant标签信息
	 */
	@Test
	public void testGetConstant() {
		String extension = ConfigurationManager.getConstant("struts.action.extension");
		String encoding = ConfigurationManager.getConstant("struts.i18n.encoding");
		System.out.println("struts.action.extension = " + extension);
		System.out.println("struts.i18n.encoding = " + encoding);
	}

	/**
	 * 测试读取拦截器信息
	 */
	@Test
	public void testGetInterceptors() {
		List<String> interceptors = ConfigurationManager.getInterceptors();
		for (String str : interceptors) {
			System.out.println(str);
		}
	}

	/**
	 * 测试读取action信息
	 */
	@Test
	public void testGetActions() {
		Map<String, ActionConfig> actions = ConfigurationManager.getActions();
		Set<Entry<String, ActionConfig>> entrySet = actions.entrySet();
		for (Entry<String, ActionConfig> entry : entrySet) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
