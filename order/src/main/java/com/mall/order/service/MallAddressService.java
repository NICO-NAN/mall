package com.mall.order.service;

import com.mall.order.entity.MallAddress;
import com.mall.order.entity.MallAddressExample;
import com.mall.order.mapper.MallAddressMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.time.LocalDateTime;

@Service
public class MallAddressService {
    @Resource
    private MallAddressMapper addressMapper;

    public MallAddress query(Integer userId, Integer id) {
        MallAddressExample example = new MallAddressExample();
        example.or().andIdEqualTo(id).andUserIdEqualTo(userId).andDeletedEqualTo(false);
        return addressMapper.selectOneByExample(example);
    }

    public int add(MallAddress address) {
        address.setAddTime(LocalDateTime.now());
        address.setUpdateTime(LocalDateTime.now());
        return addressMapper.insertSelective(address);
    }

    public MallAddress findDefault(Integer userId) {
        MallAddressExample example = new MallAddressExample();
        example.or().andUserIdEqualTo(userId).andIsDefaultEqualTo(true).andDeletedEqualTo(false);
        return addressMapper.selectOneByExample(example);
    }

}
