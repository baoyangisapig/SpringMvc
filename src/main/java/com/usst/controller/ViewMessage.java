package com.usst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 包杨 on 2017/12/8.
 */
@Controller
@RequestMapping("ViewMessage")
public class ViewMessage {
    @RequestMapping("ViewRoom")
    public ModelAndView ViewRoom(ModelAndView mv)
    {
        mv.setViewName("ViewRoom/Roommessage");
        return mv;
    }
}
