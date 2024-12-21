package org.springframework.context.event;

/**
 * 事件发布者接口
 *
 * @author derekyi
 * @date 2020/12/5
 */
public interface ApplicationEventPublisher {

	/**
	 * 发布事件
	 *
	 * @param event
	 */
	void publishEvent(ApplicationEvent event);
}
