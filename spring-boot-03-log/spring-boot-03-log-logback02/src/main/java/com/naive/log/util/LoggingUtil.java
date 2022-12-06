/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: LoggingUtil
 * Author:   Chris
 * Date:     2022/12/5 10:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.log.util;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Chris
 * @date 2022/12/5
 */
@Slf4j
public class LoggingUtil {

    public static final Logger logger = LoggerFactory.getLogger(LoggingUtil.class);

    public static void creatLogging() {
        log.info("@Slf4j----------------------------------INFO");
        log.debug("@Slf4j----------------------------------DEBUG");
        log.error("@Slf4j----------------------------------ERROR");
        logger.info("----------------------------------INFO");
        logger.debug("----------------------------------DEBUG");
        logger.error("----------------------------------ERROR");
    }
}