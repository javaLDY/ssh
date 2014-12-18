package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2014/12/18.
 */
@Controller
@RequestMapping("/stuinfo")
public class Test1Controller {

//    @RequestMapping("/stuinfo/test1")
//    public ModelAndView test(String name){
//        ModelAndView model = new ModelAndView();
//        model.addObject("name",name);
//        return model;
//    }

//    @RequestMapping("/aaa")
//    public String test1(String name){
//        ModelAndView model = new ModelAndView();
//        model.addObject("name",name);
//        return "/stuinfo/test1";
//    }

//    @RequestMapping("/test1")
//    public String test2(String name){
//        return name;
//    }
}
