package com.shinowit.web;

import com.shinowit.entity.Stuinfo;
import com.shinowit.framework.dao.BaseDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2014/12/18.
 */
@Controller
@RequestMapping("/stuinfo")
public class Test1Controller {

    @Resource
    private BaseDao<Stuinfo> baseDao;
//    @RequestMapping("/stuinfo/test1")
//    public ModelAndView test(String name){
//        ModelAndView model = new ModelAndView("/stuinfo/test1");
//        model.setViewName("/stuinfo/test1");
//        model.addObject("name",name);
//        return model;
//    }


//    @RequestMapping("/a1")
//    public String test2(String name,Model model){
//        model.addAttribute("name",name);
//        return "/stuinfo/test1";
//    }


    @ModelAttribute
    public Stuinfo test3(){
        Stuinfo stu = new Stuinfo();
        stu.setStuname("水电费");
        return stu;
    }

//    @RequestMapping("/accept")
//    public void test4(@ModelAttribute("stuinfo") Stuinfo stu,HttpServletResponse request){
//        request.setCharacterEncoding("utf-8");
//        request.setContentType("text/html;charset=utf-8");
//        PrintWriter out = null;
//        try {
//            out = request.getWriter();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        out.println(stu.getStuname());
//    }
    @RequestMapping("/accept")
    public String test4(@ModelAttribute("stuinfo") Stuinfo stu,Model model){
       model.addAttribute("name",stu.getStuname());

       return "/stuinfo/accept";
    }
//    @ModelAttribute
//    public void tset5(Model model){
//        List<Stuinfo> stulist = baseDao.listAll(Stuinfo.class);
//        System.out.println(String.valueOf(stulist.size()));
//        model.addAttribute("stu_list",stulist);
//    }
//    @RequestMapping("/accept")
//    @ResponseBody
//    public String stuselect(@ModelAttribute("stu_list") List<Stuinfo> stulist){
//
//        return String.valueOf(stulist.size());
//    }
}
