package spring.crud_prac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PracController {
    // static
//    @GetMapping("pracName")
//    public String hello(Model model){
//        model.addAttribute("data", "티맥스"); // data를 "티맥스"로 치환함: 고등학교 이름
//        return "create"; // create.html를 호출

    // mvc
//    @GetMapping("pracName")
//    public String Mvc(@RequestParam(name = "name", required = false) String name, Model model){ // required = false: name이 지정되어 있지 않아도 처리 가능
//        model.addAttribute("name", name); // key, value 순서
//        return "create";
//    }

    // API - 문자 반환
//    @GetMapping("pracName")
//    @ResponseBody // http의 response body에 값을 그대로 넣음
//    public String ApiString(@RequestParam("name") String name){
//        return name + "고등학교 학생 명단"; // http 주소에서 name 설정 필요 ex) http://localhost:8080/create?name=티맥스
//    }

    // API - 객체 반환(JSON 형태)
    @GetMapping("pracName")
    @ResponseBody // JSON 형태로 반환
    public Hello ApiObject(@RequestParam("name") String name){ // type: Hello
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // 객체로 return
    }

        // 객체(type) 정의
    static class Hello{
        private String name;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

}
