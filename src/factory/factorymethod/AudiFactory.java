package factory.factorymethod;

import factory.simplefactory.Audi;
import factory.simplefactory.Car;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-15 11:39
 */
public class AudiFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Audi();
    }
}
