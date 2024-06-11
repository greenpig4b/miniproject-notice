package com.example.subnotice.user;

import com.example.subnotice.user.oauth.Oauth;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    //중복확인
    public User findByEmail(String email){

        return userRepository.findByEmail(email);
    }

    //회원가입
    @Transactional
    public User usersJoin(UserRequest.JoinDTO reqDTO){
        User user = userRepository.save(reqDTO.toEntity());
        return user;
    }

    //Oauth 서비스
    public User oauthLogin(String code){

        return null;
    }
    //어댑터패턴으로 수정해야함


    public class GoogleOauthLogin implements Oauth {

        @Override
        public String getProviderName() {
            return "";
        }

        @Override
        public String handleCallback(String code) {
            return "";
        }

    }


}
