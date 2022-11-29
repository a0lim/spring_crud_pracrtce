package spring.crud_prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import spring.crud_prac.service.MemberService;

@Controller
public class MemberController {

    private final MemberService memberService;

    // 생성자: MemberService와 연결(의존성 주입)
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("/create")
    public String createMember(){
        return "/create/createMember";
    }

}
