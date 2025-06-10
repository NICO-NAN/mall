package com.mall.order.mapper;

import com.mall.order.entity.MallGoodsProduct;
import com.mall.order.entity.MallGoodsProductExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallGoodsProductMapper {

    long countByExample(MallGoodsProductExample example);

    int insert(MallGoodsProduct record);

    int insertSelective(MallGoodsProduct record);

    MallGoodsProduct selectOneByExample(MallGoodsProductExample example);

    List<MallGoodsProduct> selectByExampleSelective(@Param("example") MallGoodsProductExample example, @Param("selective") MallGoodsProduct.Column ... selective);

    List<MallGoodsProduct> selectByExample(MallGoodsProductExample example);

    MallGoodsProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallGoodsProduct record, @Param("example") MallGoodsProductExample example);

    int updateByPrimaryKeySelective(MallGoodsProduct record);

    int logicalDeleteByExample(@Param("example") MallGoodsProductExample example);

    int logicalDeleteByPrimaryKey(Integer id);

    int addStock(@Param("id") Integer id, @Param("num") Short num);

    int reduceStock(@Param("id") Integer id, @Param("num") Short num);
}