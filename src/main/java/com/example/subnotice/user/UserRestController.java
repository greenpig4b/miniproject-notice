package com.example.subnotice.user;

import com.example.subnotice._core.utils.ApiUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @GetMapping("/email-same-check")
    public @ResponseBody ApiUtil<?> usernameSameCheck(@RequestParam("email")String email) {
        User user = userService.findByEmail(email);
        if (user == null){
            return new ApiUtil<>(true);
        }else{
            return new ApiUtil<>(false);
        }
    }
}
