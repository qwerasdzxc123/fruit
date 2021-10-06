package com.wj.fruit.vo;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author: WangJin
 * @description
 * @date: 2021/10/6 22:44
 */
@Data
public class PieVo {
    private Integer value;
    private Map<String,String> itemStyle;
    private String name;
}
