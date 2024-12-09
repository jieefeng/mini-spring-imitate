package org.springframework.beans.factory.support.factoryBean;

/**
 * @author derekyi
 * @date 2020/12/2
 */
public interface FactoryBean<T> {

	T getObject() throws Exception;

	boolean isSingleton();
}
