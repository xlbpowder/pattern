package factory.simplefactory;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-15 11:35
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        Car audi = CarFactory.createCar("audi");
        Car byd = CarFactory.createCar("byd");
        audi.run();
        byd.run();

    }

}

