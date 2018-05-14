package com.usst.controller;

import com.usst.dao.CountDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 包杨 on 2017/11/30.
 */
@Controller
@RequestMapping(value="/demo")

@SessionAttributes(value={"username"})
public class FirController {



    @RequestMapping("logindemo")
    public  ModelAndView LoginDemo(ModelAndView mv)
    {
        mv.setViewName("welcomepage/page");
        return mv;
    }
    @RequestMapping("search")
    public ModelAndView SearchDemo(ModelAndView mv, @RequestParam(value="id")int id) throws Exception
    {
        mv.setViewName("welcomepage/out");
        CountDao countDao=new CountDao();
        String username=countDao.SelectById(id);
        mv.addObject("username",username);
        return mv;
    }



}
