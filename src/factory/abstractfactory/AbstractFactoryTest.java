package factory.abstractfactory;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-16 09:13
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        LuxuryCarFactory luxuryCarFactory = new LuxuryCarFactory();
        Engine luxuryEngine = luxuryCarFactory.createEngine();
        luxuryEngine.run();
        luxuryEngine.start();

        LowCarFactory lowCarFactory = new LowCarFactory();
        Engine lowEngine = lowCarFactory.createEngine();
        lowEngine.run();
        lowEngine.start();

    }

}
