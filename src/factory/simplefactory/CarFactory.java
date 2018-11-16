package factory.simplefactory;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-15 11:35
 */
public class CarFactory {

    public static Car createCar(String type){
        if("audi".equals(type)){
            return new Audi();
        } else if("byd".equals(type)){
            return new Byd();
        }
        return null;
    }
}
