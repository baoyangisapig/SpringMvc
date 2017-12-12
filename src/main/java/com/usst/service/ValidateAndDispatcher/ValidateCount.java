package com.usst.service.ValidateAndDispatcher;

import com.usst.pojo.User;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 包杨 on 2017/12/5.
 */

public class ValidateCount {
        public ModelAndView Validate(ModelAndView mv,User user){

            if(user.getType()==-1)
            {
                mv.setViewName("firstpage/Error");
            }
            else if(user.getType()==0)
            {
                mv.setViewName("firstpage/Manager");
            }
            else if(user.getType()==1)
            {
                mv.setViewName("firstpage/Waiter");
            }
            else{
                mv.setViewName("firstpage/CostumerPlus");
            }
            return mv;
        }
}
