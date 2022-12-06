/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: LoggerController
 * Author:   Chris
 * Date:     2022/12/5 10:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.log.controller;

import com.naive.log.util.LoggingUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris
 * @date 2022/12/5
 */
@RestController
@Slf4j
public class LoggerController {

    public static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @GetMapping(value = {"/", "/**"})
    public Long createLogs() {
        log.info("@Slf4j----------------------------------INFO");
        log.debug("@Slf4j----------------------------------DEBUG");
        log.error("@Slf4j----------------------------------ERROR");
        logger.info("----------------------------------INFO");
        logger.debug("----------------------------------DEBUG");
        logger.error("----------------------------------ERROR");
        LoggingUtil.creatLogging();
        return System.currentTimeMillis();
    }
}