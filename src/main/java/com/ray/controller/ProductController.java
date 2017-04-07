package com.ray.controller;

import com.ray.model.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rui on 2017/4/4.
 */
@Controller
public class ProductController {
    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public String products(Model model){
        List nameList = new ArrayList();
        nameList.add("shirt");
        nameList.add("pants");
        model.addAttribute("products",nameList);
        return "products";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("userInfo",new UserInfo());
        return "register";
    }

    @RequestMapping(value = "/doRegister",method = RequestMethod.POST)
    public String doRegister(RedirectAttributesModelMap redirect,@Valid UserInfo userInfo,Errors errors){
        if(errors.hasErrors()){
            return "/register";
        }
        redirect.addAttribute("userName",userInfo.getUserName());
        return "redirect:/success";
    }

    @RequestMapping(value = "/success",method = RequestMethod.GET)
    public String success(@ModelAttribute("userName") String userName){
        return "/success";
    }
}
