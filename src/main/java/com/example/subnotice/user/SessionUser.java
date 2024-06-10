package com.example.subnotice.user;

import com.example.subnotice._core.enums.UserEnum;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


@NoArgsConstructor
@Data
public class SessionUser {
    private Integer id; // 유저번호
    private String email; // 이메일
    private String name; // 유저이름
    private String phone; // 전화번호
    private UserEnum state; // 상태
    private LocalDate birth; // 생일

    @Builder
    public SessionUser(Integer id, String email, String name, String phone, UserEnum state, LocalDate birth) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.state = state;
        this.birth = birth;

    }

    public SessionUser(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.name = user.getName();
        this.phone = user.getPhoneNumber();
        this.state = user.getState();
        this.birth = user.getBirth();

    }
}
