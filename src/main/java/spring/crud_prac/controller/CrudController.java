package spring.crud_prac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CrudController {
// static
//    @GetMapping("create")
//    public String hello(Model model){
//        model.addAttribute("data", "티맥스"); // data를 "티맥스"로 치환함: 고등학교 이름
//        return "create"; // create.html를 호출

    // mvc
    @GetMapping("create")
    public String Mvc(@RequestParam(name = "name", required = false) String name, Model model){ // required = false: name이 지정되어 있지 않아도 처리 가능
        model.addAttribute("name", name); // key, value 순서
        return "create";
    }
}
