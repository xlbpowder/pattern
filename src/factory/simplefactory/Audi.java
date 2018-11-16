package factory.simplefactory;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-15 11:34
 */
public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("audi run");
    }
}
