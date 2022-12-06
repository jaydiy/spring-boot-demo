/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: LogsController
 * Author:   Chris
 * Date:     2022/12/5 9:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.log.controller;

import com.naive.log.util.LoggingUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris
 * @date 2022/12/5
 */
@RestController
public class LogsController {

    private final static Logger logger = LoggerFactory.getLogger(LogsController.class);

    @RequestMapping(value = {"/**", "/"}, method = RequestMethod.GET)
    public Long createLogs() {
        logger.info("----------------------------------INFO");
        logger.debug("----------------------------------DEBUG");
        logger.error("----------------------------------ERROR");
        LoggingUtil.creatLogging();
        return System.currentTimeMillis();
    }
}
