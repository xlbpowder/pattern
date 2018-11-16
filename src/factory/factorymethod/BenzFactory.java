package factory.factorymethod;

import factory.simplefactory.Benz;
import factory.simplefactory.Car;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-15 11:42
 */
public class BenzFactory implements CarFactory{
    @Override
    public Car createCar() {

        return new Benz();
    }
}
