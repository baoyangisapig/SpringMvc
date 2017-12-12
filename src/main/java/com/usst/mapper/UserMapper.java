package com.usst.mapper;

import com.usst.pojo.User;

/**
 * Created by 包杨 on 2017/12/5.
 */
public interface UserMapper {
    public User SelectByCount(String Count);
    public void  Updateby2(String password,String credit,String count);
    public User SelectById(int id);
    public void InsertUser(String count,String name,String password,String src);
}
