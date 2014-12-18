package com.shinowit.web;

import com.shinowit.entity.Stuinfo;
import com.shinowit.framework.dao.BaseDao;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/16.
 */
@Controller
@RequestMapping("/stuinfo")
public class ExtjsTestController {


    @Resource
    private BaseDao<Stuinfo> baseDao;

    @RequestMapping("/newlogin")
    public String newlogintest(){
        return "/stuinfo/newlogin";
    }

    @RequestMapping("/logintijiao")
    @ResponseBody
    public ModelAndView stuinfoinsert(Stuinfo stuinfo){
        ModelAndView map = new ModelAndView();
        Object a = baseDao.insert(stuinfo);
        boolean success;
        String message;
        if(a!=null){
            success=true;
            message="插入成功";
            map.addObject("success",success);
            map.addObject("message",message);
            return map;
        }else{
            success=false;
            message="插入失败";
            map.addObject("success",success);
            map.addObject("message",message);
        }
        return map;
    }

//    @RequestMapping("/logintijiao")
//    @ResponseBody
//    public Map<String,Object>  stuinfoinsert(Stuinfo stuinfo){
//        Object a = baseDao.insert(stuinfo);
//        Map<String,Object> listvalue = new HashMap<String, Object>();
//        boolean success;
//        String message;
//        if(a!=null){
//            success=true;
//            message="插入成功";
//            listvalue.put("success",success);
//            listvalue.put("message", message);
//            return listvalue;
//        }else{
//            success=false;
//            message="插入失败";
//            listvalue.put("success", success);
//            listvalue.put("message", message);
//        }
//        return listvalue;
//    }

//    @RequestMapping("/logintijiao1")
//    @ResponseBody
//    public Stuinfo stuinfoinsert1(Stuinfo stuinfo){
//        Object a = baseDao.insert(stuinfo);
//        Stuinfo stu = new Stuinfo();
//        if(a!=null){
//            stu.setSuccess(true);
//            stu.setMessage("插入成功");
//            return stu;
//        }else{
//            stu.setSuccess(false);
//            stu.setMessage("插入失败");
//        }
//        return stu;
//    }

}
