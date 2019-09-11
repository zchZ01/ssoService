package com.share.sso.dao;

import com.share.sso.interfaces.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserdao {
    public UserModel findById(Long id);
    public List<UserModel> listUser();
}
