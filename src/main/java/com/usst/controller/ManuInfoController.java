package com.usst.controller;

import com.usst.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by 包杨 on 2017/12/7.
 */
@Controller
@RequestMapping("ManuData")
@SessionAttributes(value="credit")
public class ManuInfoController {
    @RequestMapping("ManuInfo")
    public ModelAndView ManuInfo(ModelAndView mv)
    {
        mv.setViewName("manupage/ManuInfo");
        return mv;
    }
    @RequestMapping("ManuInfo1")
    public  ModelAndView ManuInfo1(HttpSession session,ModelAndView mv, @RequestParam(value="password") String password,@RequestParam(value="credit")String credit) throws Exception {
        UserDao userDao=new UserDao();
        String count=(String)session.getAttribute("count");
        userDao.Updateby2(password,credit,count);
        mv.setViewName("firstpage/CostumerPlus");
        mv.addObject("credit",credit);
        return mv;
    }

}

