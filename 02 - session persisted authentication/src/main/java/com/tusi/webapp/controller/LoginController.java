package com.tusi.webapp.controller;

import com.tusi.webapp.controller.data.LoginData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"/", "/login"})
public class LoginController {

    private static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showMessage() {
        return new ModelAndView("login");
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView doLogin(@RequestParam(value = "username", required = false) String userName, @RequestParam(value = "password", required = false) String password) {
        LOGGER.debug("In Controller with name {}", userName);
        ModelAndView mv;
        if ("test".equals(userName) && "password".equals(password)) {
            mv = new ModelAndView("main");
            LoginData loginData = new LoginData();
            loginData.setUserName(userName);
            loginData.setPassword(password);
            mv.addObject("login", loginData);
        } else {
            mv = new ModelAndView("login");
        }
        return mv;
    }
}


