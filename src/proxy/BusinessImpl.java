package proxy;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-12-05 10:38
 */
public class BusinessImpl implements IBusiness {

    @Override
    public void doSomething() {
        System.out.println("do something ...");
    }

    public void doSomethingA(){
        System.out.println("do something A ...");
    }
    public void doSomethingB(){
        System.out.println("do something B ...");
    }
}
