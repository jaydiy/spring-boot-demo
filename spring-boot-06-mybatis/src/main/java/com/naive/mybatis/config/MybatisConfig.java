/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: MybatisConfig
 * Author:   Chris
 * Date:     2022/12/5 16:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Chris
 * @date 2022/12/5
 */
@Configuration
@MapperScan(basePackages = {"com.naive.mybatis.**.mapper"})
public class MybatisConfig {

}