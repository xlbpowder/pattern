package factory.abstractfactory;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-16 09:12
 */
public class LowCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
