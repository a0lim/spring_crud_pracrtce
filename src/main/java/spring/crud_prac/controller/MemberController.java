package spring.crud_prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import spring.crud_prac.entity.Member;
import spring.crud_prac.service.MemberService;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    // 생성자: MemberService와 연결(의존성 주입)
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    // CREATE

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

    // READ
    @GetMapping("/read")
    public String readMember(Model model){ // Model 객체: Controller에서 생성한 데이터를 View로 전달할 때 사용 / servelt의 request.setAttribute()와 유사한 역할
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members); // "key", "value
        return "members/read";
    }
}
