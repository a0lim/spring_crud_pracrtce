package spring.crud_prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import spring.crud_prac.entity.Member;
import spring.crud_prac.service.MemberService;

@Controller
public class MemberController {

    private final MemberService memberService;

    // 생성자: MemberService와 연결(의존성 주입)
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("/create") // http 주소
    public String createMember(){
        return "/members/create"; // members.cteate html로 연결해서 보여줌
    }

    @PostMapping("/create/new") // http 주소
    public String createResponse(CreateController createController){
        Member member = new Member();
        member.setName(createController.getName()); // setName: Member entity / getName: CreateController

        memberService.join(member); // join: MemberService

        return "redirect:/"; // 서비스 이후 홈 화면으로 이동
    }

}
