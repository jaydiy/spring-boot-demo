/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: IndexController
 * Author:   Chris
 * Date:     2022/12/5 11:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.global.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris
 * @date 2022/12/5
 */
@RestController
@Slf4j
public class IndexController {

    @GetMapping("/index")
    public String index() {
        log.info("deal index request");
        return "统一处理全局响应和异常";
    }

    @GetMapping(value = {"exception"})
    public String exception() {
        log.info("deal exception request");
        //9 / 0;
        return "测试异常";
    }
}