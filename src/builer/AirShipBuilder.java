package builer;

/**
 * 构建者
 *
 * @Author: liu.bo
 * @CreateTime: 2018-11-16 10:22
 */
public interface AirShipBuilder {

    Engine buildEngine();

    OrbitalModule buildOrbitalModule();

    EscapeTower buildEscapeTower();
}
