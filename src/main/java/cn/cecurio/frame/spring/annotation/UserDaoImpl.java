package cn.cecurio.frame.spring.annotation;

import org.springframework.stereotype.Repository;

/**
 * Created by Cecurio on 8/11/2017.
 */
@Repository
public class UserDaoImpl implements UserDao{
    public void save() {
        System.out.println("userdao...save()...");
    }
}
