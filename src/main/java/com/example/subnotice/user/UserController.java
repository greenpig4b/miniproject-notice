package com.example.subnotice.user;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final HttpSession session;

    @GetMapping("/")
    public String main(){
        return "/notice/index";
    }

    @GetMapping("/login")
    public String loginForm(){
        return "/notice/login";
    }

    @GetMapping("/join")
    public String joinForm(){
        return "/notice/join";
    }

    @GetMapping("/detail")
    public String detail(){
        return "/notice/detail";
    }

    @PostMapping("/users/join")
    public String join(@Valid UserRequest.JoinDTO reqDTO, Errors errors){
        User user = userService.usersJoin(reqDTO);
        session.setAttribute("sessionUser", user);

        return "redirect:/";
    }

    @PostMapping("/users/login")
    public String login(){
        return null;
    }

    // Oauth 콜백
    @GetMapping("/oauth/callback")
    public String oauthCallback(String code){
        User sessionUser = userService.oauthLogin(code);
        session.setAttribute("sessionUser", sessionUser);

        return "redirect:/";
    }

}
