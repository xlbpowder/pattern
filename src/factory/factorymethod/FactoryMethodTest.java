package factory.factorymethod;

import factory.simplefactory.Car;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-15 11:42
 */
public class FactoryMethodTest {


    public static void main(String[] args) {

        Car audi = new AudiFactory().createCar();
        Car benz = new BenzFactory().createCar();
        Car byd = new BydFactory().createCar();
        audi.run();
        benz.run();
        byd.run();

    }
}
