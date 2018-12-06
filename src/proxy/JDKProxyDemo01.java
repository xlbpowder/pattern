package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK proxy动态代理示例
 *
 * @Author: liu.bo
 * @CreateTime: 2018-12-05 10:36
 */
public class JDKProxyDemo01 {

    public static void main(String[] args) {

        BusinessImpl impl = new BusinessImpl();
        BusinessProxy proxy = new BusinessProxy();
        IBusiness iBusiness = (IBusiness) proxy.blind(impl);
        iBusiness.doSomething();

    }

}

class BusinessProxy implements InvocationHandler {
    private Object obj;

    public Object blind(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("before ...");
        result = method.invoke(obj, args);
        System.out.println("after ...");
        return result;
    }
}