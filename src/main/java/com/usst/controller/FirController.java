package com.usst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 包杨 on 2017/11/30.
 */
@Controller
@RequestMapping(value="/demo")

@SessionAttributes(value="code")
public class FirController {
    @RequestMapping(value="/facebook")
    public ModelAndView MavenDemo(ModelAndView mv)
    {
        String code="code";
        mv.addObject("code",code);
        mv.setViewName("welcomepage/hello");
        return mv;
    }
    @RequestMapping("register")
    public  ModelAndView Register(ModelAndView mv)
    {
        mv.setViewName("welcomepage/register");
        return  mv;
    }


}
