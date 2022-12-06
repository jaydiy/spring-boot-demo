/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: MysqlController
 * Author:   Chris
 * Date:     2022/12/3 10:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.controller;

import com.naive.prop.MysqlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris
 * @date 2022/12/3
 */
@RestController
@RequestMapping("mysql")
public class MysqlController {

    @Autowired
    private MysqlProperties mysqlProperties;

    @RequestMapping("/getConfig")
    public String getConfig() {
        return mysqlProperties.toString();
    }
}