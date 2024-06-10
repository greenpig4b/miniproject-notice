package com.example.subnotice._core.utils;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
public class ApiUtil<T> {

    public static <T> ApiResult<T> success(T response){
        // 성공 시, 응답데이터와 함께 ApiResult 객체를 생성한다. 상태코드는  200으로 설정!!
        return new ApiResult<>(true, response, 200, null);
    }

    public static ApiResult<?> error(String message, HttpStatus status){
        // 에러 발생했을때 에러 메세지와 HTTP 상태 코드를 포함한 ApiResult 객체를 생성합니다.
        return new ApiResult<>(false, null, status.value(), message);
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ApiResult<T> {
        private boolean success;
        private T response;
        private int status;
        private String errormessage;
    }

    private Integer status;
    private String msg;
    private T body;


    public ApiUtil(T body){
        this.status = 200;
        this.msg = "성공";
        this.body = body;
    }

    public ApiUtil(Integer status, String msg){
        this.status = status;
        this.msg = msg;
        this.body = null;
    }
}
