package com.tusi.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    private static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    private static String message = "Welcome to Spring MVC!";

    @RequestMapping("/main")
    public ModelAndView showMessage(@RequestParam(value = "username", required = false) String userName, @RequestParam(value = "password", required = false) String password) {

        LOGGER.debug("In Controller with name{}", userName);
        ModelAndView mv;
        if ("test".equals(userName) && "password".equals(password)) {
            mv = new ModelAndView("main");
            mv.addObject("message", message);
            mv.addObject("username", userName);
        } else {
            mv = new ModelAndView("redirect:/");
        }
        return mv;
    }
}


