package com.shinowit.web;

import com.shinowit.entity.Stuinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Administrator on 2014/12/16.
 */
@Controller
@RequestMapping("/stuinfo")
public class StuInfoLoginController {
    @RequestMapping("/falselogin")
    public ModelAndView falselogin() {
        ModelAndView model = new ModelAndView();
        model.setViewName("/stuinfo/login");
        return model;
    }

    @RequestMapping("/testlogin")
    public String logintest(Stuinfo stuinfo, Map result) {
        if (("admin".equals(stuinfo.getStuname())) && (stuinfo.getStuid()==123) ){
            result.put("name", "登陆成功");
        } else {
            result.put("name", "登录失败");
        }
        return "/stuinfo/accept";
    }

}