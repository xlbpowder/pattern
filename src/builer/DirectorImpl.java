package builer;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-16 10:28
 */
public class DirectorImpl implements AirShipDirector {

    private AirShipBuilder builder;

    public DirectorImpl(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        AirShip airShip = new AirShip();
        airShip.setEngine(builder.buildEngine());
        airShip.setEscapeTower(builder.buildEscapeTower());
        airShip.setOrbitalModule(builder.buildOrbitalModule());
        return airShip;
    }
}
