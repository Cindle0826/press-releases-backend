package com.presses.util;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

//@Getter 其實只要給 getter 就好, 不知為何 spring boot 請求API時 spring boot 會調用 getter方法
public class Result<Type> {
    public static final int SUCCESS_CODE = 200;
    public static final int ERROR_CODE = 500;

    private String message;
    private Type data;
    private int code;

    public static <T> Result<T> success(T data) {
        return new Result<>("success", data, SUCCESS_CODE);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(message, data, SUCCESS_CODE);
    }

    public static <T> Result<T> error(String message) {
        return new Result<>(message, null, ERROR_CODE);
    }

}
