package cn.cecurio.frame.spring.instance.staticfactory;

/**
 * Created by Cecurio on 8/10/2017.
 * 工厂模式应用
 */
public class MyBean2Factory {
    public static Bean2 createBean() {
        return new Bean2();
    }
}
