package cn.cecurio.frame.spring.assemble;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Cecurio on 8/11/2017.
 */
public class XmlBeanAssembleTest {
    @Test
    public void test1() {
        String xmlPath = "beans5.xml";

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        System.out.println(applicationContext.getBean("user1"));
        System.out.println(applicationContext.getBean("user2"));
    }
}
