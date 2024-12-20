package org.springframework.test.ioc.factoryBean;

import org.springframework.beans.factory.support.factoryBean.FactoryBean;
import org.springframework.test.ioc.bean.Car;

/**
 * @author derekyi
 * @date 2020/12/2
 */
public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setBrand(brand);
		return car;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
