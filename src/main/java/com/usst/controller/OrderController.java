package com.usst.controller;

import com.usst.service.ValidateAndDispatcher.ValidateCredit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by 包杨 on 2017/12/10.
 */
@Controller
@RequestMapping("order")
@SessionAttributes(value={"id","roomnumber","roomtype","price","direction","SearchPrice"})
public class OrderController {
    @RequestMapping("new")
    public ModelAndView Order(ModelAndView mv)
    {
        mv.setViewName("orderpage/OrderPage");


        return mv;
    }

    @RequestMapping("mid")
    public  ModelAndView Order1(ModelAndView mv, HttpSession session, @RequestParam(value="id")String id,@RequestParam(value="roomnumber")String roomnumber,@RequestParam(value="roomtype")String roomtype,@RequestParam(value="direction")String direction,@RequestParam(value="price")String price) throws Exception {
        String count=(String)session.getAttribute("count");

        ValidateCredit vc=new ValidateCredit();

        mv=vc.Credit1(mv,count);
        mv.addObject("id",id);
        mv.addObject("roomnumber",roomnumber);
        mv.addObject("roomtype",new String(roomtype.getBytes("iso-8859-1"),"utf-8"));
        mv.addObject("direction",new String(direction.getBytes("iso-8859-1"),"utf-8"));
        mv.addObject("price",price);
        return mv;
    }
    @RequestMapping("old")
    public  ModelAndView Order2(ModelAndView mv,HttpSession session)
    {
        mv.setViewName("orderpage/OrderRoom");
        return mv;


    }
    @RequestMapping("price")
    public  ModelAndView Order3(ModelAndView mv,@RequestParam("price") String price ) throws Exception {

        mv.addObject("SearchPrice",price);
        mv.setViewName("orderpage/OrderPrice");
        return mv;

    }
}
