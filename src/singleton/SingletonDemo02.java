package singleton;

/**
 * lazy load
 * 延迟加载单例模式
 * 资源利用率高，但由于加入了synchronized，并发效率较低
 *
 * @Author: liu.bo
 * @CreateTime: 2018-11-14 15:16
 */
public class SingletonDemo02 {

    private static SingletonDemo02 instance;

    private SingletonDemo02() {
    }

    public static synchronized SingletonDemo02 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo02();
        }
        return instance;
    }

}
