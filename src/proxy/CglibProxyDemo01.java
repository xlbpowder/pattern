package proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-12-05 09:40
 */
public class CglibProxyDemo01 {
    public static void main(String[] args) {
        BusinessImpl impl = new BusinessImpl();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(impl.getClass());
        enhancer.setCallback(new CglibProxy(impl));
        BusinessImpl business = (BusinessImpl) enhancer.create();
        business.doSomething();
    }

}

class CglibProxy implements MethodInterceptor {
    private Object obj;

    public CglibProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object returnObj = null;
        System.out.println("after...");
        returnObj = method.invoke(this.obj, args);
        System.out.println("before...");
        return returnObj;
    }
}
