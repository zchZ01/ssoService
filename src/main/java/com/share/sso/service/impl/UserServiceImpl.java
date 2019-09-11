package com.share.sso.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.share.sso.dao.IUserdao;
import com.share.sso.interfaces.model.UserModel;
import com.share.sso.interfaces.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    IUserdao userdao;
    @Override
    public UserModel findById(Long id) {
        return userdao.findById(id);
    }

    @Override
    public List<UserModel> listUser() {
        return userdao.listUser();
    }
}
