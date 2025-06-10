package com.mall.order.service;

import com.mall.order.entity.MallCart;
import com.mall.order.entity.MallCartExample;
import com.mall.order.mapper.MallCartMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MallCartService {
    @Resource
    private MallCartMapper cartMapper;


    public void add(MallCart cart) {
        cart.setAddTime(LocalDateTime.now());
        cart.setUpdateTime(LocalDateTime.now());
        cartMapper.insertSelective(cart);
    }

    public List<MallCart> queryByUidAndChecked(Integer userId) {
        MallCartExample example = new MallCartExample();
        example.or().andUserIdEqualTo(userId).andCheckedEqualTo(true).andDeletedEqualTo(false);
        return cartMapper.selectByExample(example);
    }


    public MallCart findById(Integer id) {
        return cartMapper.selectByPrimaryKey(id);
    }

    public MallCart findById(Integer userId, Integer id) {
        MallCartExample example = new MallCartExample();
        example.or().andUserIdEqualTo(userId).andIdEqualTo(id).andDeletedEqualTo(false);
        return cartMapper.selectOneByExample(example);
    }


    public void clearGoods(Integer userId) {
        MallCartExample example = new MallCartExample();
        example.or().andUserIdEqualTo(userId).andCheckedEqualTo(true);
        MallCart cart = new MallCart();
        cart.setDeleted(true);
        cartMapper.updateByExampleSelective(cart, example);
    }


    public void deleteById(Integer id) {
        cartMapper.logicalDeleteByPrimaryKey(id);
    }

}
