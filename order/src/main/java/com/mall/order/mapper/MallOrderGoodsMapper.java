package com.mall.order.mapper;

import com.mall.order.entity.MallOrderGoods;
import com.mall.order.entity.MallOrderGoodsExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallOrderGoodsMapper {

    long countByExample(MallOrderGoodsExample example);

    int insert(MallOrderGoods record);

    int insertSelective(MallOrderGoods record);

    MallOrderGoods selectOneByExample(MallOrderGoodsExample example);

    List<MallOrderGoods> selectByExampleSelective(@Param("example") MallOrderGoodsExample example, @Param("selective") MallOrderGoods.Column ... selective);

    List<MallOrderGoods> selectByExample(MallOrderGoodsExample example);

    MallOrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallOrderGoods record, @Param("example") MallOrderGoodsExample example);

    int updateByPrimaryKeySelective(MallOrderGoods record);

    int logicalDeleteByExample(@Param("example") MallOrderGoodsExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}