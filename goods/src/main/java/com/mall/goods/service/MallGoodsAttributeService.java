package com.mall.goods.service;

import com.mall.goods.entity.MallGoodsAttribute;
import com.mall.goods.entity.MallGoodsAttributeExample;
import com.mall.goods.mapper.MallGoodsAttributeMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MallGoodsAttributeService {
    @Resource
    private MallGoodsAttributeMapper goodsAttributeMapper;

    public List<MallGoodsAttribute> queryByGid(Integer goodsId) {
        MallGoodsAttributeExample example = new MallGoodsAttributeExample();
        example.or().andGoodsIdEqualTo(goodsId).andDeletedEqualTo(false);
        return goodsAttributeMapper.selectByExample(example);
    }

    public void add(MallGoodsAttribute goodsAttribute) {
        goodsAttribute.setAddTime(LocalDateTime.now());
        goodsAttribute.setUpdateTime(LocalDateTime.now());
        goodsAttributeMapper.insertSelective(goodsAttribute);
    }

    public void deleteById(Integer id) {
        goodsAttributeMapper.logicalDeleteByPrimaryKey(id);
    }

}
