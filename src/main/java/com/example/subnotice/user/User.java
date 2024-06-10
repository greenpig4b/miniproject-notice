package com.example.subnotice.user;

import com.example.subnotice._core.enums.UserEnum;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.processing.Pattern;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Table(name = "user_tb")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // 유저아이디

    @Column(nullable = false, unique = true)
    private String email; // 이메일 (로그인 할 때 아이디로 사용한다)

    @Column(nullable = false)
    private String password; // 비밀번호

    @Column(nullable = false)
    private String name; // 유저네임

    @Column(nullable = false)
    private String phoneNumber; // 전화번호

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserEnum state; // 상태 ON 회원가입한 유저  OFF 탈퇴한 유저

    @Column(nullable = false)
    private LocalDate birth; // 생일

    private String image;

    @Builder
    public User(Integer id, String email, String password, String name, String phoneNumber, UserEnum state, LocalDate birth, String image) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.state = state;
        this.birth = birth;
        this.image = image;
    }

    // 회원정보 수정
    public void updateUser(){
        // 나중에 구현
    }
}
