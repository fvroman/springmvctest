package com.taiga;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/processForm")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        String name = request.getParameter("nameForm");
        model.addAttribute("message", name.toUpperCase());
        return "greetings";
    }
}
