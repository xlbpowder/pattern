package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-14 16:19
 */
public class SingletonTest {

    public static void main(String[] args) throws Exception {
        /**
         SingletonDemo01 s1 = SingletonDemo01.getInstance();
         SingletonDemo01 s2 = SingletonDemo01.getInstance();
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(SingletonDemo04.INSTANCE);
         System.out.println(SingletonDemo04.INSTANCE);
         */
        // 测试反射反序列化破解
        /**
        // 通过反射直接调用私有构造器
        Class<SingletonDemo05> clazz = (Class<SingletonDemo05>) Class.forName("singleton.SingletonDemo05");
        Constructor<SingletonDemo05> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        SingletonDemo05 s1 = c.newInstance();
        SingletonDemo05 s2 = c.newInstance();

        System.out.println(s1);
        System.out.println(s2);
         */

        /**
        // 通过反序列化的方式构造多个对象
        SingletonDemo05 s11 = SingletonDemo05.getInstance();
        SingletonDemo05 s22 = SingletonDemo05.getInstance();
        System.out.println(s11);
        System.out.println(s22);


        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s11);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
        s22 = (SingletonDemo05)ois.readObject();
        System.out.println(s11);
        System.out.println(s22);
         */

    new Thread(()->
    {
        System.out.println();
        System.out.println();
    }
    ).start();


    }


}
