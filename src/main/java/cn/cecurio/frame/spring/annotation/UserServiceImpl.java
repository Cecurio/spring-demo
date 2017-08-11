package cn.cecurio.frame.spring.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Cecurio on 8/11/2017.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource//(name = "userDaoAlias")
    private UserDao userDao;

    public void save() {
        this.userDao.save();
        System.out.println("userservice...save()...");
    }
}
