package factory.abstractfactory;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-16 09:06
 */
public interface Engine {
    void run();
    void start();


}
class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("luxury run");
    }

    @Override
    public void start() {
        System.out.println("luxury start");
    }
}
class LowEngine implements Engine{

    @Override
    public void run() {
        System.out.println("low run");
    }

    @Override
    public void start() {
        System.out.println("low start");
    }
}
