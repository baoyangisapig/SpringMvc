package com.usst.mapper;

import com.usst.pojo.Room;

import java.util.Date;
import java.util.ArrayList;

/**
 * Created by 包杨 on 2017/12/8.
 */
public interface RoomMapper {
    public ArrayList<Room> SelectAll();
    public ArrayList<Room> SelectByStatus();
    public void UpdateByDate(Date indate,Date outdate,String costumer,int id);
    public  ArrayList<Room> SelectByPrice(int price);
}
