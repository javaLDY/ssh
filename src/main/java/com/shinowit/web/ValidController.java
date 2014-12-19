package com.shinowit.web;

import com.shinowit.entity.Stuinfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * Created by Administrator on 2014/12/19.
 */
@Controller
@RequestMapping("/b")
public class ValidController {

    @RequestMapping(value = "/b1",method = RequestMethod.GET)
    public String logintest(@ModelAttribute("stu") Stuinfo stuinfo){
        return "/stuinfo/login1";
    }
    @RequestMapping(value = "/b1",method = RequestMethod.POST)
    public String testlogin(@Valid @ModelAttribute("stu") Stuinfo stuinfo,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "/stuinfo/login1";
        }
        return "/stuinfo/login1";
    }
}
