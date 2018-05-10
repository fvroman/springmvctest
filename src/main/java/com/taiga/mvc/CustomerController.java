package com.taiga.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {

    @RequestMapping("getCustomer")
    public String getCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("processCustomer")
    public String processCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "processedCustomer";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        StringTrimmerEditor editor = new StringTrimmerEditor(true);

        binder.registerCustomEditor(String.class, editor);
    }
}
