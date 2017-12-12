package com.usst.dao;

import com.usst.mapper.UserMapper;
import com.usst.pojo.*;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by 包杨 on 2017/12/5.
 */
public class UserDao {
    public User SelectByCount(String count) throws Exception {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        UserMapper userMapper=session.getMapper(UserMapper.class);
        User user=userMapper.SelectByCount(count);
        return user;
    }
    public void Updateby2(String password,String credit,String count) throws Exception {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        UserMapper userMapper=session.getMapper(UserMapper.class);
        userMapper.Updateby2( password,credit,count);
        session.commit();
        session.close();

    }
    public User SelectById(int id) throws Exception {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        UserMapper userMapper=session.getMapper(UserMapper.class);
        User user=userMapper.SelectById(id);
        return user;
    }
    public  void InsertUser(String count,String name,String password,String src) throws Exception {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        UserMapper userMapper=session.getMapper(UserMapper.class);
        userMapper.InsertUser(count,name,password,src);
        session.commit();
        session.close();
    }
}
