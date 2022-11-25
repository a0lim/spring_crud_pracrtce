package spring.crud_prac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrudController {

    @GetMapping("create")
    public String hello(Model model){
        model.addAttribute("data", "티맥스");
        return "create";
    }
}
