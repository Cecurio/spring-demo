package cn.cecurio.frame.spring.instance.factory;

/**
 * Created by Cecurio on 8/10/2017.
 */
public class MyBean3Factory {
    public MyBean3Factory() {
        System.out.println("bean3工厂实例化中");
    }

    public Bean3 createBean() {
        return new Bean3();
    }
}
