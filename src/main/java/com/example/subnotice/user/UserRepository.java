package com.example.subnotice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {

    //이메일 중복확인
    User findByEmail(@Param("email") String email);

}
