package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // "/hello"로 들어오면 여기로 맵핑해준다.
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");
        return "hello";
    }
}
