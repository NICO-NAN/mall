package com.mall.goods.mapper;

import com.mall.goods.entity.MallGoodsProduct;
import com.mall.goods.entity.MallGoodsProductExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallGoodsProductMapper {

    long countByExample(MallGoodsProductExample example);

    int deleteByExample(MallGoodsProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallGoodsProduct record);

    int insertSelective(MallGoodsProduct record);

    MallGoodsProduct selectOneByExample(MallGoodsProductExample example);

    MallGoodsProduct selectOneByExampleSelective(@Param("example") MallGoodsProductExample example, @Param("selective") MallGoodsProduct.Column ... selective);

    List<MallGoodsProduct> selectByExampleSelective(@Param("example") MallGoodsProductExample example, @Param("selective") MallGoodsProduct.Column ... selective);

    List<MallGoodsProduct> selectByExample(MallGoodsProductExample example);

    MallGoodsProduct selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallGoodsProduct.Column ... selective);

    MallGoodsProduct selectByPrimaryKey(Integer id);

    MallGoodsProduct selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") MallGoodsProduct record, @Param("example") MallGoodsProductExample example);

    int updateByExample(@Param("record") MallGoodsProduct record, @Param("example") MallGoodsProductExample example);

    int updateByPrimaryKeySelective(MallGoodsProduct record);

    int updateByPrimaryKey(MallGoodsProduct record);

    int logicalDeleteByExample(@Param("example") MallGoodsProductExample example);

    int logicalDeleteByPrimaryKey(Integer id);

    int addStock(@Param("id") Integer id, @Param("num") Short num);

    int reduceStock(@Param("id") Integer id, @Param("num") Short num);
}