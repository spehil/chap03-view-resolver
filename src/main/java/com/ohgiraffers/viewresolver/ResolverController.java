package com.ohgiraffers.viewresolver;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResolverController {
    @GetMapping("/string")
    public String stringReturning(Model model){//Model model 객체인데 동적인 것을 담는다.
        /*Model: View 에서 표현 되어야 하는 동적인 데이터를 담는 용도로 사용하는 객체*/
       model.addAttribute("forwardMessage", "문자열로 뷰 이름 반환함...");
       //String 타입으로 리턴할 경우 논리적인 뷰 이름을 리턴한다.
       //ViewResolver가 Prefix/suffix를 합쳐서 물리적 뷰를 선택한다.
       return "result";
    }

    @GetMapping("/string-redirect")
    public  String stringRedirect() {

        return "redirect:/"; //main으로 redirect된다. main에 /로 등록되어있어서
    }
}
