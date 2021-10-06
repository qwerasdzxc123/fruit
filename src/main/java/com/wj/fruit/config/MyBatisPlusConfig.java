package com.wj.fruit.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: WangJin
 * @description
 * @date: 2021/10/6 13:42
 */
@Configuration
@MapperScan("com.wj.fruit.mapper")
public class MyBatisPlusConfig {
}
