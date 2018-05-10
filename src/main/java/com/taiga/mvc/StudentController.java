package com.taiga.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/getStudent")
    public String getStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "newStudent";
    }

    @RequestMapping("/processStudent")
    public String processStudentForm(@ModelAttribute("student") Student student) {
        return "processedStudent";
    }
}
