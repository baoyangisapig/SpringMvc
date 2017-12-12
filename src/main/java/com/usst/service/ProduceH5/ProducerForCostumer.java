package com.usst.service.ProduceH5;

import com.usst.dao.RoomDao;
import com.usst.pojo.Room;

import java.util.ArrayList;

/**
 * Created by 包杨 on 2017/12/8.
 */
public class ProducerForCostumer {

    public String ProTable() throws Exception {

        String html="";
        RoomDao roomDao= new RoomDao();
        ArrayList<Room> list=roomDao.SelectAll();
        int size=list.size();
        html+="<table class=\"table table-hover\" style><caption>信息一览表</caption><thead><tr><th>房间类型</th><th>房号</th><th>朝向</th><th>价格</th><th>状态</th></tr></thead><tbody>";
        for (int i=0;i<=size-1;i++) {
            html+="<tr>";
            {
                String roomtype = list.get(i).getRoomtype();
                String roomnumber = list.get(i).getRoomnumber();
                String direction = list.get(i).getDirection();
                int price = list.get(i).getPrice();
                int status0 = list.get(i).getStatus();
                String status = "";
                if (status0 == 2) {
                    status = "已被预定";
                } else {
                    status = "未被预定";
                }
                html+=" <td style=\"color:red;\">"+roomtype+"</td> <td style=\"color:red;\">"+roomnumber+"</td> <td style=\"color:red;\">"+direction+"</td><td style=\"color:red;\">"+price+"</td> <td style=\"color:red;\">"+status+"</td>";


            }
            html+="</tr>";
        }
        html+="</tbody></table>";
        return html;
    }
    public String ProTable1() throws  Exception
    {
        String html="";
        RoomDao roomDao= new RoomDao();
        ArrayList<Room> list=roomDao.SelectByStatus();
        int size=list.size();
        html+="<table class=\"table table-hover\" style><caption>可预订房间信息一览表</caption><thead><tr><th>房间类型</th><th>房号</th><th>朝向</th><th>价格</th><th>立即订购</th></tr></thead><tbody>";
        for (int i=0;i<=size-1;i++) {
            html+="<tr>";
            {
                String roomtype = list.get(i).getRoomtype();

                String roomnumber = list.get(i).getRoomnumber();
                String direction = list.get(i).getDirection();

                int price = list.get(i).getPrice();
                int id=list.get(i).getId();


                html+=" <td style=\"color:red;\">"+roomtype+"</td> <td style=\"color:red;\">"+roomnumber+"</td> <td style=\"color:red;\">"+direction+"</td><td style=\"color:red;\">"+price+"</td><td><button class=\"btn-success\"  onclick= \"window.location.href='../../order/mid?id="+id+"&roomnumber="+roomnumber+"&direction="+direction+"&price="+price+"&roomtype="+roomtype+"'\">订购</button></td>";


            }
            html+="</tr>";
        }
        html+="</tbody></table>";
        return html;
    }

    public String ProTable2(int Price) throws  Exception
    {
        String html="";
        RoomDao roomDao= new RoomDao();
        ArrayList<Room> list=roomDao.SelectByPrice(Price);
        int size=list.size();
        html+="<table class=\"table table-hover\" style><caption>可预订房间信息一览表</caption><thead><tr><th>房间类型</th><th>房号</th><th>朝向</th><th>价格</th><th>立即订购</th></tr></thead><tbody>";
        for (int i=0;i<=size-1;i++) {
            html+="<tr>";
            {


                String roomnumber = list.get(i).getRoomnumber();
                String roomtype=list.get(i).getRoomtype();
                String direction = list.get(i).getDirection();

                int price = list.get(i).getPrice();
                int id=list.get(i).getId();


                html+=" <td style=\"color:red;\">"+roomtype+"</td> <td style=\"color:red;\">"+roomnumber+"</td> <td style=\"color:red;\">"+direction+"</td><td style=\"color:red;\">"+price+"</td><td><button class=\"btn-success\"  onclick= \"window.location.href='../../order/mid?id="+id+"&roomnumber="+roomnumber+"&direction="+direction+"&price="+price+"&roomtype="+roomtype+"'\">订购</button></td>";


            }
            html+="</tr>";
        }
        html+="</tbody></table>";
        return html;
    }
}
