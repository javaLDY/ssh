package com.shinowit.web;

import com.shinowit.entity.Stuinfo;
import com.shinowit.framework.dao.BaseDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/21.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @Resource
    private BaseDao<Stuinfo> basedao;
    @RequestMapping("/show")
    public String stuinfoselect(Model model){
        List<Stuinfo> stulist = basedao.listAll(Stuinfo.class);
        model.addAttribute("stu_list",stulist);
        return "/stuinfo/index";
    }
}
