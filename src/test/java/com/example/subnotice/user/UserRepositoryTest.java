package com.example.subnotice.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findById_test(){

        //given
        String email = "ssar@nate.com";
        //then
        User user = userRepository.findByEmail(email);
        //eye
        System.out.println(user);
        //when
        Assertions.assertEquals("ssar@nate.com", user.getEmail());

    }
}
