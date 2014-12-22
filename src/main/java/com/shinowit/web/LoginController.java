package com.shinowit.web;

import com.shinowit.entity.Stuinfo;
import com.shinowit.framework.dao.BaseDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2014/12/21.
 */
@Controller
@RequestMapping("/fuck")//验证码的问题问什么在点击换验证码的时候会带上着个呢？带上这个要怎么去处理呢？
public class LoginController {

    @Resource
    private BaseDao<Stuinfo> baseDao;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String show(@ModelAttribute("stu") Stuinfo stuinfo,String checknum){
        return "/stuinfo/login2";
    }
    @RequestMapping(value = "/wojiucaole",method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute("stu") Stuinfo stuinfo,BindingResult bindingResult,HttpServletRequest request,String checknum){
        if(bindingResult.hasErrors()){
            return "/stuinfo/login2";
        }else{
            String realchecknum = (String)request.getSession().getAttribute("rand");
            if((checknum==null)||(!checknum.equals(realchecknum))){
               request.setAttribute("checknum","验证码输入有误，请重新输入！");
                return "/stuinfo/login2";
            }
            List<Stuinfo> stulist = baseDao.myfindByHql("from Stuinfo where stuname=? and stucode=?",stuinfo.getStuname(),stuinfo.getStucode());
                if(stulist.size()>0){
                    request.getSession().setAttribute("msg","登陆成功");
                    request.getSession().setAttribute("msgname",stuinfo.getStuname());
                    return "forward:/index/show";
                }else{
                    bindingResult.rejectValue("stuname",null,"用户名或者密码有错误!");
                    return "/stuinfo/login2";
                }
        }

    }
}
