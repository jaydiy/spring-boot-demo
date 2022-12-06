/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: Result
 * Author:   Chris
 * Date:     2022/12/5 11:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.global.global;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Chris
 * @date 2022/12/5
 */
@Data
public class Result<T> implements Serializable {

    private int code;
    private String message;
    private T data;
    private long timestamp;

    private Result() {
        timestamp = System.currentTimeMillis();
    }

    public static <T> Result<T> ok(T data) {
        Result<T> result = new Result<>();
        result.setCode(ResultCode.RC100.getCode());
        result.setMessage(ResultCode.RC100.getMessage());
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fail(int code, String message) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}