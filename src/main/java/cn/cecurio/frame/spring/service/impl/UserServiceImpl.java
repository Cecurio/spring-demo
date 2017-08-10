package cn.cecurio.frame.spring.service.impl;

import cn.cecurio.frame.spring.dao.UserDao;
import cn.cecurio.frame.spring.service.UserService;

/**
 * Created by Cecurio on 8/10/2017.
 */
public class UserServiceImpl implements UserService {
    private UserDao _userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDaoConstructor) {
        this._userDao = userDaoConstructor;
        System.out.println("constructor function");
    }

    /**
     * 注入的时候,跟setXXX有关,跟属性无关
     * XXX是大驼峰写法,在applicationContext.xml中配置属性时,是小驼峰的写法
     * @param userDao
     */
    public void setUserDaoPrefix(UserDao userDao) {
        this._userDao = userDao;
        System.out.println("setter");
    }

    public void addUser() {
        _userDao.save();
        System.out.println("spring: hello user service");
    }
}
