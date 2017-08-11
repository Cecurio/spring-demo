package cn.cecurio.frame.spring.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Cecurio on 8/11/2017.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    public void save() {
        this.userService.save();
        System.out.println("usercontroller...save()...");
    }
}
