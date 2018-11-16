package singleton;

/**
 * 枚举单例
 * 枚举本身就是单例模式，避免通过反射、反序列化得到对象的漏洞
 * 无懒加载
 * @Author: liu.bo
 * @CreateTime: 2018-11-14 16:03
 */
public enum SingletonDemo04 {

    /**
     * SingletonDemo04.INSTANCE
     * 这个枚举元素本身就是单例的
     * 需要的行为和动作可以单独添加
     */
    INSTANCE;
    public void singletonOperation(){

    }

}
