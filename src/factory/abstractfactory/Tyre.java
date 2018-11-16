package factory.abstractfactory;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-16 09:09
 */
public interface Tyre {

    void revolve();

}

class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("Luxury Tyre");

    }
}

class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("Low Tyre");

    }
}
