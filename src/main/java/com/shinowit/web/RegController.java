package com.shinowit.web;

import com.shinowit.entity.SexCode;
import com.shinowit.entity.Stuinfo;
import com.shinowit.framework.dao.BaseDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.swing.plaf.basic.BasicEditorPaneUI;
import javax.validation.Valid;

import java.util.List;

/**
 * Created by Administrator on 2014/12/19.
 */
@Controller
@RequestMapping("/reg")
public class RegController {

    @Resource
    private BaseDao<SexCode> baseDao;

    @Resource
    private BaseDao<Stuinfo> stubasedao;

    @ModelAttribute
    public void sextypeselect(Model model){
        List<SexCode> sexlist = baseDao.listAll(SexCode.class);
        model.addAttribute("sex_list",sexlist);
    }


    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String stuinfoshow(@ModelAttribute("stu") Stuinfo stuinfo){
        return "/stuinfo/reg";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@Valid @ModelAttribute("stu") Stuinfo stuinfo,BindingResult bindingResult,RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            //return "/stuinfo/reg";
            redirectAttributes.addFlashAttribute("stuname","用户名不能为空");
            return "redirect:/reg/show";//有问题想问为什么直接跳这个访问路径就不行呢//并且这么写是行了但是我的错误消息怎么什么也没有出难道非得是返回真正的jsp的路径
            //return "reg/show";//这里到底反的是什么，还有刚刚我就是这么写的为什么各种尝试都不行然后我就把数据库数据删了一把就什么都行了
        }else{
            List<Stuinfo> stuinfolist = stubasedao.listAll(Stuinfo.class);
            for(Stuinfo stu : stuinfolist){
                if(stu.getStuname().equals(stuinfo.getStuname())){
                    bindingResult.rejectValue("stuname",null,"用户名已存在");
                    //bindingResult.rejectValue("stuname","用户名已存在",null);这种形式只是适合用国际化的消息吗？
                    return "/stuinfo/reg";
                }
            }
//            if((stuinfo.getSexCode().getSexCode()==null)||(stuinfo.getSexCode().getSexCode().trim().length()<1)){
//                bindingResult.rejectValue("SexCode",null,"性别不能为空");
//            }
            Object a = stubasedao.insert(stuinfo);
            if(a!=null) {
                return "/stuinfo/login2";
            }
        }
        return "/stuinfo/reg";
    }

}
