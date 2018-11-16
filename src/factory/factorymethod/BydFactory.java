package factory.factorymethod;

import factory.simplefactory.Byd;
import factory.simplefactory.Car;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-15 11:40
 */
public class BydFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Byd();
    }
}
