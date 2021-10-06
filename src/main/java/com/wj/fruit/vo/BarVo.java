package com.wj.fruit.vo;

import lombok.Data;

import java.util.List;

/**
 * @author: WangJin
 * @description
 * @date: 2021/10/6 20:43
 */
@Data
public class BarVo {
    private List<String> names;
    private List<DataVo> values;
}
