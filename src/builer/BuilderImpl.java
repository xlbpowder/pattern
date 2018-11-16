package builer;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-16 10:26
 */
public class BuilderImpl implements AirShipBuilder {

    @Override
    public Engine buildEngine() {
        return new Engine("发动机");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        return new OrbitalModule("轨道舱");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        return new EscapeTower("逃逸塔");
    }
}
