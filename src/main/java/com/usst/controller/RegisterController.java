package com.usst.controller;

import com.usst.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 包杨 on 2017/12/12.
 */
@Controller
@RequestMapping("Register")
public class RegisterController {
    @RequestMapping("Return")
    public ModelAndView Register(ModelAndView mv, @RequestParam("count") String count,@RequestParam("name") String name,@RequestParam("password")String password,@RequestParam("src")String src) throws Exception {
        UserDao userDao=new UserDao();
        String desrc=new String(src.getBytes("iso-8859-1"),"utf-8");
        userDao.InsertUser(count,name,password,desrc);
        mv.setViewName("welcomepage/hello");
        return mv;
    }
}
