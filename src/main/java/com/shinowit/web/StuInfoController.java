package com.shinowit.web;

import com.shinowit.entity.Stuinfo;
import com.shinowit.framework.dao.BaseDao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/16.
 */
@Controller
@RequestMapping("/stuinfo")
public class StuInfoController {

    @Resource
    private BaseDao<Stuinfo> stuinfoDao;

    @RequestMapping("/test")
    public ModelAndView displayall(){
        List<Stuinfo> stulist = stuinfoDao.listAll(Stuinfo.class);
        ModelAndView result = new ModelAndView();
        result.addObject("stu_list",stulist);
        result.setViewName("stuinfo/dispall");
        return result;
    }

    @RequestMapping("/testjson")
    @ResponseBody
    public List<Stuinfo> test(){
        return stuinfoDao.listAll(Stuinfo.class);
    }


}
