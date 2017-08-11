package cn.cecurio.frame.spring.instance.constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Cecurio on 8/10/2017.
 */
public class Bean1Test {
    @Test
    public void test1() {
        String xmlPath = "beans1.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("bean1"));
        System.out.println(applicationContext.getBean("bean1"));
        System.out.println(applicationContext.getBean("bean1"));
    }
}
