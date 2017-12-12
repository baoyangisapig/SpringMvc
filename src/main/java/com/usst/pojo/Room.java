package com.usst.pojo;

import java.util.Date;

/**
 * Created by 包杨 on 2017/12/8.
 */
public class Room {
    private int id;
    private String roomnumber;
    private String roomtype;
    private int price;
    private String direction;
    private int status;
    private String costumer;
    private Date in_data;
    private Date out_data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCostumer() {
        return costumer;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public Date getIn_data() {
        return in_data;
    }

    public void setIn_data(Date in_data) {
        this.in_data = in_data;
    }

    public Date getOut_data() {
        return out_data;
    }

    public void setOut_data(Date out_data) {
        this.out_data = out_data;
    }
}
