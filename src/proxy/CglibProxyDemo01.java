package proxy;

import net.sf.cglib.proxy.*;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: liu.bo
 * @CreateTime: 2018-12-05 09:40
 */
public class CglibProxyDemo01 {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(BusinessImpl.class);
        Callback callBack_0 = NoOp.INSTANCE;
        Callback callBack_1 = new CglibProxy(new BusinessImpl());
        Callback[] callbacks = new Callback[]{callBack_0, callBack_1 };
        enhancer.setCallbackFilter(new DemoCallbackFilter());
        enhancer.setCallbacks(callbacks);
        BusinessImpl business = (BusinessImpl) enhancer.create();
        business.doSomething();
        business.doSomethingA();
        business.doSomethingB();
    }

}

class DemoCallbackFilter implements net.sf.cglib.proxy.CallbackFilter{
    @Override
    public int accept(Method method) {
        if(method.getName().equals("doSomethingA") || method.getName().equals("doSomethingB")){
            return 1;
        }
        return 0;
    }
}

class CglibProxy implements MethodInterceptor {
    private Object obj;

    public CglibProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("methodName:" + method);
        System.out.println("methodProxy:" + methodProxy);
        Object returnObj = null;
        System.out.println("after...");
        returnObj = methodProxy.invoke(this.obj, args);
        System.out.println("before...");
        return returnObj;
    }
}
