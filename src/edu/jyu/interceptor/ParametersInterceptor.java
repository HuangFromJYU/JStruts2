package edu.jyu.interceptor;

import org.apache.commons.beanutils.BeanUtils;

import edu.jyu.context.ActionContext;
import edu.jyu.invocation.ActionInvocation;
import edu.jyu.stack.ValueStack;

/**
 * 参数拦截器，将请求参数封装到action属性中
 * 
 * @author Jason
 */
public class ParametersInterceptor implements Interceptor {

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invocation) {
		ActionContext ac = invocation.getInvocationContext();
		ValueStack valueStack = ac.getValueStack();
		// 获取action对象
		Object action = valueStack.peek();
		try {
			// 将请求参数数据填充到action对象中
			BeanUtils.populate(action, ac.getRequest().getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return invocation.invoke(invocation);
	}

	@Override
	public void destory() {
	}

}
