package com.yunsu.service.Imp;

import com.yunsu.dao.RegisterUserDao;
import com.yunsu.domain.Register;
import com.yunsu.domain.User;
import com.yunsu.service.RegisterUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RegisterUserServiceImp implements RegisterUserService{

    @Resource
    private RegisterUserDao registerUserDao;

    public void setRegisterUserDao(RegisterUserDao registerUserDao) {
        this.registerUserDao = registerUserDao;
    }

    @Override
    public void insertUser(Register reg) {
        registerUserDao.insertRegisterUser(reg);
    }

    @Override
    public Register findUserByName(String name) {
        return registerUserDao.findUserByName(name);
    }

    @Override
    public void insertAddUser(User user) {
        registerUserDao.insertAddUser(user);
    }

    @Override
    public List<User> findAll() {
        return registerUserDao.findAll();
    }

    @Override
    public User findByName(String name) {
        return registerUserDao.findByName(name);
    }

    @Override
    public void updateUser(User user) {
        registerUserDao.updateUser(user);
    }
}
