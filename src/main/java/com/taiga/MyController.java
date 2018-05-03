package com.taiga;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @RequestMapping("/start")
    public String getUserName() {
        return "index";
    }

    @RequestMapping("/greetings")
    public String greetings() {
        return "greetings";
    }

    //Можно передавать request аргументом
    @RequestMapping("/processForm")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        String name = request.getParameter("nameForm");
        model.addAttribute("message", name.toUpperCase());
        return "greetings";
    }
    //Можно делать с requestParam
    @RequestMapping("/processForm2")
    public String letsShoutDude(@RequestParam("nameForm") String name, Model model) {
        model.addAttribute("message", name.toUpperCase() + "darling");
        return "greetings";
    }
}

