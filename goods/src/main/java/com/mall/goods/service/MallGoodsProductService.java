package com.mall.goods.service;

import com.mall.goods.entity.MallGoodsProduct;
import com.mall.goods.entity.MallGoodsProductExample;
import com.mall.goods.mapper.MallGoodsProductMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MallGoodsProductService {
    @Resource
    private MallGoodsProductMapper mallGoodsProductMapper;

    public List<MallGoodsProduct> queryByGid(Integer gid) {
        MallGoodsProductExample example = new MallGoodsProductExample();
        example.or().andGoodsIdEqualTo(gid).andDeletedEqualTo(false);
        return mallGoodsProductMapper.selectByExample(example);
    }

    public MallGoodsProduct findById(Integer id) {
        return mallGoodsProductMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
        mallGoodsProductMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(MallGoodsProduct goodsProduct) {
        goodsProduct.setAddTime(LocalDateTime.now());
        goodsProduct.setUpdateTime(LocalDateTime.now());
        mallGoodsProductMapper.insertSelective(goodsProduct);
    }

    public int count() {
        MallGoodsProductExample example = new MallGoodsProductExample();
        example.or().andDeletedEqualTo(false);
        return (int) mallGoodsProductMapper.countByExample(example);
    }

}