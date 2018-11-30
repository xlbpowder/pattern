package singleton;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-11-30 09:36
 */
public class SingletonDemo06 {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                Singleton.getInstance().doSomething();
            }, "线程" + i).start();
        }
    }

}

class Singleton {

    private Singleton() {
        System.out.println("********* " + Thread.currentThread().getName() + " 构造函数 *********");
    }

    private volatile static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("*** doSomething ***");
    }

}
