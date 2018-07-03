package com.project.controller;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	static final Logger logger = Logger.getLogger(HelloWorldController.class);

	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model){

        // add parameterized message from controller
        String welcome = "welcome";

        model.addAttribute("message", welcome);

        // obtain locale from LocaleContextHolder
        Locale currentLocale = LocaleContextHolder.getLocale();
        model.addAttribute("locale", currentLocale);

        model.addAttribute("startMeeting", "10:30");

        return "index";
    }
}