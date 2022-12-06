/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: LoggingUtil
 * Author:   Chris
 * Date:     2022/12/5 9:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.log.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Chris
 * @date 2022/12/5
 */
public class LoggingUtil {

    private final static Logger logger = LoggerFactory.getLogger(LoggingUtil.class);

    public static void creatLogging() {
        logger.info("----------------------------------INFO");
        logger.debug("----------------------------------DEBUG");
        logger.error("----------------------------------ERROR");
    }
}