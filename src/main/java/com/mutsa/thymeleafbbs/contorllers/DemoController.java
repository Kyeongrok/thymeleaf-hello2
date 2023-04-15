package com.mutsa.thymeleafbbs.contorllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping(value = "/hi")
    public String hi(Model model) {
        model.addAttribute("username", "rok");
        return "articles/test";
    }
}
