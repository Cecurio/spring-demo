package cn.cecurio.frame.spring.service.impl;

import cn.cecurio.frame.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Cecurio on 8/10/2017.
 */
public class UserServiceImplTest {

    @Test
    public void testAddUser() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.addUser();
    }
}
