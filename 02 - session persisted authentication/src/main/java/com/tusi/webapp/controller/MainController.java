package com.tusi.webapp.controller;

import com.tusi.webapp.controller.data.LoginData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
@SessionAttributes("login")
public class MainController {

    private static Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    private static String message = "Welcome to Spring MVC!";

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showMessage(@ModelAttribute("login") LoginData loginData) {
        ModelAndView mv;
        if (loginData == null) {
            mv = new ModelAndView("redirect:/");
        } else {
            mv = new ModelAndView("main");
            mv.addObject("message", message);
            mv.addObject("username", loginData.getUserName());
        }
        return mv;

    }
}


