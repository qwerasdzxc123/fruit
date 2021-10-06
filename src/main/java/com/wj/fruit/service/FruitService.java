package com.wj.fruit.service;

import com.wj.fruit.entity.Fruit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.fruit.vo.BarVo;
import com.wj.fruit.vo.PieVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2021-10-06
 */
public interface FruitService extends IService<Fruit> {

    public BarVo barVoList();

    public List<PieVo> pieVoList();
}
