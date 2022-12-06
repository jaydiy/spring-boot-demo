/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: MysqlProperties
 * Author:   Chris
 * Date:     2022/12/3 10:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.prop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Chris
 * @date 2022/12/3
 */
@Component
@PropertySource("classpath:mysql.properties")
@Data
public class MysqlProperties {

    @Value("${mysql.username}")
    private String userName;

    @Value("${mysql.password}")
    private String passWord;

    @Value("${mysql.password}")
    private String version;
}