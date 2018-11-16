package singleton;

/**
 * 饿汉式单例模式
 *
 * 类初始化时 类加载时立即初始化单例对象
 *
 *
 * @Author: liu.bo
 * @CreateTime: 2018-11-14 15:11
 */
public class SingletonDemo01 {

    private static SingletonDemo01 instance = new SingletonDemo01();

    private SingletonDemo01(){}

    /**
     * 类加载天然线程安全
     * 方法不需要加synchronized
     * @return
     */
    public static SingletonDemo01 getInstance(){
        return instance;
    }

}
