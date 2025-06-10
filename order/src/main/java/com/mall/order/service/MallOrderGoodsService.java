package com.mall.order.service;

import com.mall.order.entity.MallOrderGoods;
import com.mall.order.entity.MallOrderGoodsExample;
import com.mall.order.mapper.MallOrderGoodsMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MallOrderGoodsService {
    @Resource
    private MallOrderGoodsMapper orderGoodsMapper;

    public int add(MallOrderGoods orderGoods) {
        orderGoods.setAddTime(LocalDateTime.now());
        orderGoods.setUpdateTime(LocalDateTime.now());
        return orderGoodsMapper.insertSelective(orderGoods);
    }

    public List<MallOrderGoods> queryByOid(Integer orderId) {
        MallOrderGoodsExample example = new MallOrderGoodsExample();
        example.or().andOrderIdEqualTo(orderId).andDeletedEqualTo(false);
        return orderGoodsMapper.selectByExample(example);
    }

    public List<MallOrderGoods> findByOidAndGid(Integer orderId, Integer goodsId) {
        MallOrderGoodsExample example = new MallOrderGoodsExample();
        example.or().andOrderIdEqualTo(orderId).andGoodsIdEqualTo(goodsId).andDeletedEqualTo(false);
        return orderGoodsMapper.selectByExample(example);
    }

    public Short getComments(Integer orderId) {
        MallOrderGoodsExample example = new MallOrderGoodsExample();
        example.or().andOrderIdEqualTo(orderId).andDeletedEqualTo(false);
        long count = orderGoodsMapper.countByExample(example);
        return (short) count;
    }

}
