package com.usst.service.ValidateAndDispatcher;

import com.usst.dao.UserDao;
import com.usst.pojo.User;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 包杨 on 2017/12/10.
 */
public class ValidateCredit {
    public ModelAndView Credit1(ModelAndView mv,String count) throws Exception {
        UserDao userDao= new UserDao();
        User user=userDao.SelectByCount(count);
        if(user.getCredit().equals("")){
            mv.setViewName("manupage/ManuInfo");
        }
        else{
            mv.setViewName("orderpage/OrderTable");
        }
        return mv;
    }
}
