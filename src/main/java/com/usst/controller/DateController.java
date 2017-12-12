package com.usst.controller;

import com.usst.dao.RoomDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 包杨 on 2017/12/10.
 */
@Controller
@RequestMapping("Date")
public class DateController {
    @RequestMapping("UpdateDate")
    public ModelAndView ManuDate(HttpSession session,ModelAndView mv, @RequestParam(value="indate") String indate, @RequestParam(value="outdate")String outdate) throws Exception {
        SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
        Date date1=new Date(format.parse(indate).getTime());
        Date date2=new Date(format.parse(outdate).getTime());
        String id=(String)session.getAttribute("id");
        String costumer=(String)session.getAttribute("name");
        int id1=Integer.parseInt(id);
        RoomDao roomDao=new RoomDao();
        roomDao.UpdateByDate(date1,date2,costumer,id1);
        System.out.println(indate);
        System.out.println(outdate);
        mv.setViewName("firstpage/CostumerPlus");
        return mv;
    }
}
