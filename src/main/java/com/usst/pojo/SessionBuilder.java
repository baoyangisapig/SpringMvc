package com.usst.pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SessionBuilder {
   public SqlSession SessionProducer() throws  Exception
   {
       InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
       // 初始化mybatis，创建SqlSessionFactory类的实例
       SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
       // 创建Session实例
       SqlSession session = sqlSessionFactory.openSession();
       return session;

   }
}
