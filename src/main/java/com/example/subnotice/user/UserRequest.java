package com.example.subnotice.user;

import com.example.subnotice._core.enums.UserEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

public class UserRequest {

    @Data
    public static class JoinDTO{

        @Email(message = "이메일 형식으로 작성해주세요")
        private String email;
        @NotEmpty(message = "비밀번호를 입력해주세요")
        @Size(min=3,max=20,message = "비밀번호는 3자 이상이거나 20자를 초과할 수 없습니다")
        private String password;
        @NotEmpty(message = "이름을 작성해주세요")
        private String name;
        @NotEmpty(message = "전화번호를 작성해주세요")
        private String phoneNumber;
        @NotEmpty(message = "주소를 입력해주세요")
        private String address;

        public User toEntity(){
            return User.builder()
                    .email(email)
                    .phoneNumber(phoneNumber)
                    .password(password)
                    .name(name)
                    .address(address)
                    .phoneNumber(phoneNumber)
                    .state(UserEnum.ON)
                    .build();
        }
    }


}
