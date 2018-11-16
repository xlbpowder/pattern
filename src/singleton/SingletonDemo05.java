package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试如何防止反射和反序列化漏洞
 *
 * @Author: liu.bo
 * @CreateTime: 2018-11-14 15:16
 */
public class SingletonDemo05 implements Serializable {

    private static SingletonDemo05 instance;

    private SingletonDemo05() {
        if(instance != null){
            throw new RuntimeException("该类只能存在一个实例");

        }
    }

    public static synchronized SingletonDemo05 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo05();
        }
        return instance;
    }

    // 反序列化时，如果定义了readResolve()，则返回此方法指定的对象，而不需要单独再创建对象。基于反序列化回调的方式防止通过反序列化生成该类的其他实例
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }

}
