package cn.cecurio.frame.spring.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Cecurio on 8/11/2017.
 */
public class AnnotationAssembleTest {
    @Test
    public void test1() {
        String xmlPath = "beans6.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserController userController = (UserController)applicationContext.getBean("userController");
        System.out.println(userController);
        userController.save();
    }
}
