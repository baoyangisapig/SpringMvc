package com.usst.dao;

import com.usst.mapper.RoomMapper;
import com.usst.pojo.Room;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.ArrayList;

/**
 * Created by 包杨 on 2017/12/8.
 */
public class RoomDao {
    public ArrayList<Room> SelectAll() throws Exception {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        RoomMapper roomMapper =session.getMapper(RoomMapper.class);
        ArrayList<Room> list= new ArrayList<Room>();
        list=roomMapper.SelectAll();
        return list;
    }

    public ArrayList<Room> SelectByStatus() throws  Exception
    {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        RoomMapper roomMapper =session.getMapper(RoomMapper.class);
        ArrayList<Room> list= new ArrayList<Room>();
        list=roomMapper.SelectByStatus();
        return  list;


    }
    public  void UpdateByDate (Date indate, Date outdate, String costumer,int id) throws Exception {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        RoomMapper roomMapper=session.getMapper(RoomMapper.class);
        roomMapper.UpdateByDate(indate,outdate,costumer,id);
        session.commit();
        session.close();

    }
    public ArrayList<Room> SelectByPrice(int price) throws Exception {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        RoomMapper roomMapper =session.getMapper(RoomMapper.class);
        ArrayList<Room> list= new ArrayList<Room>();
        list=roomMapper.SelectByPrice(price);
        return list;
    }
}
