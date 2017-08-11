package cn.cecurio.frame.spring.instance.staticfactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Cecurio on 8/10/2017.
 */
public class Bean2Test {
    @Test
    public void test1() {
        String xmlPath = "beans2.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("bean2"));
        System.out.println(applicationContext.getBean("bean2"));
        System.out.println(applicationContext.getBean("bean2"));
    }
}
