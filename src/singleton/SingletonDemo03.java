package singleton;

/**
 * 静态内部类实现延迟加载 单例模式
 *
 * 外部类没有static属性，则不会立即加载对象
 * 只有真正调用getInstance()才会加载静态内部类
 * 加载类的时候是线程安全的，instance是static final类型的，保证了只有一个实例存在。
 * 兼备并发高效调用和延迟加载的优势
 *
 * @Author: liu.bo
 * @CreateTime: 2018-11-14 15:55
 */
public class SingletonDemo03 {

    private static class SingletonClassInstance{
        private static final SingletonDemo03 instance = new SingletonDemo03();
    }

    public static SingletonDemo03 getInstance(){
        return SingletonClassInstance.instance;
    }

    private SingletonDemo03(){}

}
