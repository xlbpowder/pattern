package factory.abstractfactory;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-16 09:10
 */
public interface CarFactory {

    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();


}
