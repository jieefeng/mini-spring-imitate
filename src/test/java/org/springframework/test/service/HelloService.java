package org.springframework.test.service;


/**
 * @author derekyi
 * @date 2020/11/22
 */
public class HelloService {
//		implements ApplicationContextAware, BeanFactoryAware {

//	private ApplicationContext applicationContext;
//
//	private BeanFactory beanFactory;

	public String sayHello() {
		System.out.println("hello");
		return "hello";
	}
//
//	@Override
//	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//		this.beanFactory = beanFactory;
//	}
//
//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		this.applicationContext = applicationContext;
//	}
//
//	public ApplicationContext getApplicationContext() {
//		return applicationContext;
//	}
//
//	public BeanFactory getBeanFactory() {
//		return beanFactory;
//	}
}
