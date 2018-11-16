package factory.abstractfactory;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-16 09:11
 */
public class LuxuryCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
