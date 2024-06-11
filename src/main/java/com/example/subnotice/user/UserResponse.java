package com.example.subnotice.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

public class UserResponse {

    @Data
    public static class OauthResponse {
        private NaverTokenDTO naverTokenDTO;
        private KakaoTokenDTO kakaoTokenDTO;
        @JsonProperty("access_token")
        private String accessToken;
        @JsonProperty("token_type")
        private String tokenType;

        @Data
        public static class NaverTokenDTO {
            @JsonProperty("refresh_token")
            private String refreshToken;
            @JsonProperty("expires_in")
            private Integer expiresIn;
            private String scope;
            @JsonProperty("refresh_token_expires_in")
            private Integer refreshTokenExpiresIn;
        }

        @Data
        public static class KakaoTokenDTO {
            @JsonProperty("expires_in")
            private Integer expiresIn;
            @JsonProperty("error")
            private String errorCode;
            @JsonProperty("error_description")
            private String errorMessage;
        }
    }
}
