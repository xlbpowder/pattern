package factory.abstractfactory;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-16 09:08
 */
public interface Seat {

    void message();

}

class LuxurySeat implements Seat {

    @Override
    public void message() {
        System.out.println("Luxury Seat");
    }
}

class LowSeat implements Seat {

    @Override
    public void message() {
        System.out.println("Low Seat");
    }
}
