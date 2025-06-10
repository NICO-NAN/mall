package com.mall.order.service;

import com.mall.order.entity.MallGoodsProduct;
import com.mall.order.mapper.MallGoodsProductMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.time.LocalDateTime;

@Service
public class MallGoodsProductService {
    @Resource
    private MallGoodsProductMapper mallGoodsProductMapper;

    public MallGoodsProduct findById(Integer id) {
        return mallGoodsProductMapper.selectByPrimaryKey(id);
    }

    public void add(MallGoodsProduct goodsProduct) {
        goodsProduct.setAddTime(LocalDateTime.now());
        goodsProduct.setUpdateTime(LocalDateTime.now());
        mallGoodsProductMapper.insertSelective(goodsProduct);
    }

    public int addStock(Integer id, Short num){
        return mallGoodsProductMapper.addStock(id, num);
    }

    public int reduceStock(Integer id, Short num){
        return mallGoodsProductMapper.reduceStock(id, num);
    }

}