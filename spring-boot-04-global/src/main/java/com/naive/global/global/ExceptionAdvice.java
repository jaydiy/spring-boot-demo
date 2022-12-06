/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: ExceptionAdvice
 * Author:   Chris
 * Date:     2022/12/5 11:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.global.global;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

/**
 * @author Chris
 * @date 2022/12/5
 */
@RestControllerAdvice(basePackages = {"com.naive.global"})
@Slf4j
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<String> exception(Exception e, WebRequest request) {
        log.error("happen exception: " + e.getMessage());
        return Result.fail((((ServletWebRequest) request).getResponse()).getStatus(), e.getMessage());
    }

}