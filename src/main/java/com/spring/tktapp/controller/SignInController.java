package com.spring.tktapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignInController {

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public ModelAndView signin(ModelAndView mav){
        mav.setViewName("signin");
        mav.addObject("msg", "メールアドレスとパスワードを入力してください。");
        return mav;
    }
}
