package builer;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-16 10:30
 */
public class BuilderTest {

    public static void main(String[] args) {
        AirShipDirector director = new DirectorImpl(new BuilderImpl());
        director.directAirShip();

    }
}
