package com.example.demo.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserPage;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(UserEntity user) {
        int i = 0;
        if (!"".equals(user.getName()) && user.getName() != null &&
                !"".equals(user.getPassword()) && user.getPassword() != null) {
           i = userDao.insert(user);
        }
        return i;
    }

    public int delUser(int id) {
        int i = 0;
        if (!"".equals(id)) {
            QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("id",id);
            i = userDao.delete(queryWrapper);
        }
        return i;
    }

    public int updateUser(UserEntity user) {
        int i = 0;
        if ( user != null ) {
            i = userDao.updateById(user);
        }
        return i;
    }

    public UserEntity selectUserById(UserEntity user) {
        UserEntity userEntity = null;
        if (!"".equals(user.getId())) {
            userEntity = userDao.selectById(user.getId());
        }
        return userEntity;
    }

    public List<UserEntity>  selectUserAll() {
        List<UserEntity> list;
        list = userDao.selectList(null);
        return list;
    }

    public UserPage getUserIPage(int current, int size) {
        QueryWrapper<UserEntity> queryWrapper =  new QueryWrapper<>();
        //queryWrapper.orderByDesc("id");
        Page<UserEntity> page = new Page<>(current,size);
        IPage<UserEntity> iPage = userDao.selectPage(page,null);
        UserPage userPage = new UserPage();
        userPage.setCurrent(iPage.getCurrent());
        userPage.setPages(iPage.getPages());
        userPage.setSize(iPage.getSize());
        userPage.setTotal(iPage.getTotal());
        userPage.setRecords(iPage.getRecords());
        return userPage;
    }

    public List<UserEntity> selectByNameLike(String str) {
        List<UserEntity> list = new ArrayList<>();
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","");
        list = userDao.selectList(queryWrapper);
        System.out.println(list.toString());
        return list;
    }
}
