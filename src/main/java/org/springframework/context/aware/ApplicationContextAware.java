package org.springframework.context.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.aware.Aware;

/**
 * 实现该接口，能感知所属ApplicationContext
 *
 * @author derekyi
 * @date 2020/12/1
 */
public interface ApplicationContextAware extends Aware {

	void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
