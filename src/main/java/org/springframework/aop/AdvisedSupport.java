package org.springframework.aop;

import org.aopalliance.intercept.MethodInterceptor;

//相当与包装了代理需要的元素
public class AdvisedSupport {

	//是否使用cglib代理
	private boolean proxyTargetClass = false;
	private TargetSource targetSource;

	private MethodInterceptor methodInterceptor;

	private MethodMatcher methodMatcher;

	public TargetSource getTargetSource() {
		return targetSource;
	}
	public boolean isProxyTargetClass() {
		return proxyTargetClass;
	}

	public void setProxyTargetClass(boolean proxyTargetClass) {
		this.proxyTargetClass = proxyTargetClass;
	}

	public void setTargetSource(TargetSource targetSource) {
		this.targetSource = targetSource;
	}

	public MethodInterceptor getMethodInterceptor() {
		return methodInterceptor;
	}

	public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
		this.methodInterceptor = methodInterceptor;
	}

	public MethodMatcher getMethodMatcher() {
		return methodMatcher;
	}

	public void setMethodMatcher(MethodMatcher methodMatcher) {
		this.methodMatcher = methodMatcher;
	}
}
