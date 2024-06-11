package com.example.subnotice.user.oauth;

public interface Oauth {
    String getProviderName();
    String handleCallback(String code);
}


