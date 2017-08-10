package cn.cecurio.frame.spring.dao.impl;

import cn.cecurio.frame.spring.dao.UserDao;

/**
 * Created by Cecurio on 8/10/2017.
 */
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("spring: hello user dao");
    }
}
