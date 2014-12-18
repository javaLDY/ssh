package com.shinowit.web;

import com.shinowit.entity.Stuinfo;
import com.shinowit.entity.Teacher;
import com.shinowit.framework.dao.BaseDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/17.
 */
@Controller
public class TestController {

    @Resource
    private BaseDao<Stuinfo> baseDao;

    @RequestMapping("/test/method/{name}")
    @ResponseBody
    public String test1(@PathVariable String name){
        return name;
    }


    @RequestMapping("/test/method1")
    @ResponseBody
    public String test2(@RequestParam(required = false) String name){
        return name;
    }

    @RequestMapping("/test/method2")
    @ResponseBody
    public Stuinfo test3(){
        Stuinfo stu = new Stuinfo();
        stu.setMessage("aaasfsdf");
        return stu;
    }

    @RequestMapping("/test/method3")
    public String test4(@RequestParam("name") String name,RedirectAttributes redirectAttributes){
        if(!name.equals("admin")){
            redirectAttributes.addFlashAttribute("啊有错误");
            return "redirect:/test/method2";
        }
        name="成功";
        return name;
    }

    @RequestMapping("/test/method4")
    public String listselect(Model model){
        List<Stuinfo> result = new ArrayList<Stuinfo>();
        Stuinfo stu = new Stuinfo();
        result = baseDao.listAll(Stuinfo.class);
        model.addAttribute("users",result);
        return "/stuinfo/show";
    }
}
