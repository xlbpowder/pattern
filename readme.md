**GOF23设计模式学习笔记**

# 设计模式

## 创建型模式：
* 单例模式、工厂模式、抽象工厂模式、建造者模式、原型模式

## 结构型模式：
* 适配器模式、桥接模式、装饰模式、组合模式、外观模式、享元模式、代理模式

## 行为型模式：
* 模板模式、命令模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式、状态模式、策略模式、职责链模式、访问者模式


---
## 单例模式Singleton
该类只有一个实例存在，要考虑的问题
* 懒加载
* 线程同步
* 防止返序列化

---
## 工厂模式Factory
实现了创建者和调用者的分离
* 简单工厂模式
* 工厂方法模式
* 抽象工厂模式

### 简单工厂模式
    用来生产同一等级结构中的任意产产品（对于新增的产品，需要修改已有代码）
    不满足OCP
    
### 工厂方法模式
    有一组实现了相同接口的工厂类

### 抽象工厂模式
    用来生产不同产品族的全部产品。（对于增加新的产品乏力，支持增加产品族

---
## 建造者模式Builder
* 分离了对象子组件的单独构造（Builder）和装配（Director），从而可以构造出复杂的对象
* 该模式适用于复杂对象的构建过程使用

* 由于实现了构建和装配的解耦，不同的构建器，相同的装配，也可以构建出不同的对象。同理，相同的构建器，不同的装配顺序也可以构建出不同的对象
* 实现了构建算法、装配算法的解耦，提高了复用性

---
## 原型模式Prototype



---
## 代理模式proxy

* JAVA动态代理示意图：

    ![proxy-photo](./src/image/proxy.png)