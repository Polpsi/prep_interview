package Lesson7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    public MainController() {
    }

    @GetMapping({"/"})
    public String index(Model model) {
        model.addAttribute("testtext", "Hello World!");
        model.addAttribute("title", "Index Title");
        return "index";
    }

    @GetMapping({"/tmp"})
    public String tmp(Model model) {
        model.addAttribute("testtext", "TMP");
        model.addAttribute("title", "Index Title");
        return "index";
    }
}
