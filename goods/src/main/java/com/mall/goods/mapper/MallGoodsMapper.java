package com.mall.goods.mapper;

import com.mall.goods.entity.MallGoods;
import com.mall.goods.entity.MallGoodsExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallGoodsMapper {

    long countByExample(MallGoodsExample example);

    int deleteByExample(MallGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallGoods record);

    int insertSelective(MallGoods record);

    MallGoods selectOneByExample(MallGoodsExample example);

    MallGoods selectOneByExampleSelective(@Param("example") MallGoodsExample example, @Param("selective") MallGoods.Column ... selective);

    MallGoods selectOneByExampleWithBLOBs(MallGoodsExample example);

    List<MallGoods> selectByExampleSelective(@Param("example") MallGoodsExample example, @Param("selective") MallGoods.Column ... selective);

    List<MallGoods> selectByExampleWithBLOBs(MallGoodsExample example);

    List<MallGoods> selectByExample(MallGoodsExample example);

    MallGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallGoods.Column ... selective);

    MallGoods selectByPrimaryKey(Integer id);

    MallGoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") MallGoods record, @Param("example") MallGoodsExample example);

    int updateByExample(@Param("record") MallGoods record, @Param("example") MallGoodsExample example);

    int updateByPrimaryKeySelective(MallGoods record);

    int updateByPrimaryKey(MallGoods record);

    int logicalDeleteByExample(@Param("example") MallGoodsExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}