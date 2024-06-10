package com.example.subnotice.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping("/")
    public String main(){
        return "/notice/index";
    }

    @GetMapping("/login")
    public String login(){
        return "/notice/login";
    }

    @GetMapping("/join")
    public String join(){
        return "/notice/join";
    }

    @GetMapping("/detail")
    public String detail(){
        return "/notice/detail";
    }
}
