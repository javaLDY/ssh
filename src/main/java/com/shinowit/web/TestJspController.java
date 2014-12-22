package com.shinowit.web;

import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2014/12/22.
 */
@Controller
@RequestMapping("/stuinfo")
public class TestJspController {

    @RequestMapping(value = "/uploadpost",method = RequestMethod.POST)
    public String uploaddown(@RequestParam("touxiang") MultipartFile name,HttpServletRequest request){

        if(name.isEmpty()==true){
            return "redirect:/stuinfo/upload";
        }

        System.out.println(name.getName());
        System.out.println(name.getOriginalFilename());
        System.out.println(name.getSize());
        System.out.println(name.getContentType());

        try {
            String realpath = request.getSession().getServletContext().getRealPath("/upload")+"/"+name.getOriginalFilename();
            FileUtils.copyInputStreamToFile(name.getInputStream(), new File(realpath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "stuinfo/index";
    }

}
