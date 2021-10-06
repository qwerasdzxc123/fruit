package com.wj.fruit.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.fruit.entity.Fruit;
import com.wj.fruit.mapper.FruitMapper;
import com.wj.fruit.service.FruitService;
import com.wj.fruit.utils.DataUtil;
import com.wj.fruit.vo.BarVo;
import com.wj.fruit.vo.DataVo;
import com.wj.fruit.vo.PieVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-10-06
 */
@Service
public class FruitServiceImpl extends ServiceImpl<FruitMapper, Fruit> implements FruitService {

    @Autowired
    private FruitMapper fruitMapper;

    @Override
    public BarVo barVoList() {
        BarVo barVO = new BarVo();
        List<String> names = new ArrayList<>();
        List<DataVo> values = new ArrayList<>();
        //先查出数据
        List<Fruit> fruits = this.fruitMapper.selectList(null);
        for (Fruit fruit : fruits) {
            names.add(fruit.getName());
            DataVo dataVO = new DataVo();
            //System.out.println(fruit.getSale());
            dataVO.setValue(fruit.getSale());
            dataVO.setItemStyle(DataUtil.createItemStyle(fruit.getSale()));
            values.add(dataVO);
        }
        barVO.setNames(names);
        barVO.setValues(values);
        //转换VO
        return barVO;
    }

    @Override
    public List<PieVo> pieVoList() {
        List<PieVo> values = new ArrayList<>();
        List<Fruit> fruits = this.fruitMapper.selectList(null);
        for (Fruit fruit : fruits) {
            PieVo pieVo = new PieVo();
            pieVo.setValue(fruit.getSale());
            pieVo.setItemStyle(DataUtil.createItemStyle(fruit.getSale()));
            pieVo.setName(fruit.getName());
            values.add(pieVo);
        }

        return values;
    }
}
