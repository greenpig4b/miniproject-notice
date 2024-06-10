package com.example.subnotice._core.errors.exception;

import com.example.subnotice._core.utils.ApiUtil;
import lombok.Getter;
import org.springframework.http.HttpStatus;

// 권한없음
@Getter
public class Exception403 extends RuntimeException {
    public Exception403(String message) {
        super(message);
    }

    public ApiUtil.ApiResult<?> body() {
        return ApiUtil.error(getMessage(), HttpStatus.FORBIDDEN);
    }

    public HttpStatus status() {
        return HttpStatus.FORBIDDEN;
    }
}