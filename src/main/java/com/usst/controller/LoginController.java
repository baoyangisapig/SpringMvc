package com.usst.controller;

import com.usst.dao.UserDao;
import com.usst.pojo.User;
import com.usst.service.ValidateAndDispatcher.ValidateCount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 包杨 on 2017/12/5.
 */
@Controller
@RequestMapping(value="Login")
@SessionAttributes(value={"user","count","credit","name"})
public class LoginController {
    @RequestMapping(value="Validate")
    public ModelAndView Login(ModelAndView mv, @RequestParam(value="password") String password,@RequestParam(value="count") String count) throws Exception {
        User user = new User();
        user.setPassword(password);
        user.setCount(count);

        UserDao userdao=new UserDao();
        User newuser=userdao.SelectByCount(user.getCount());

        mv.addObject("user",newuser);
        mv.addObject("count",count);
        if(newuser.getCredit()!=null)
        mv.addObject("credit",newuser.getCredit());
        mv.addObject("name",newuser.getName());
        mv=new ValidateCount().Validate(mv,newuser);

        return mv;
    }
    @RequestMapping(value="Validate1")
    public ModelAndView Login1(ModelAndView mv)
    {
        mv.setViewName("firstpage/CostumerPlus");
        return mv;
    }

}
