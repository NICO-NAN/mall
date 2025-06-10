package com.mall.goods.mapper;

import com.mall.goods.entity.MallGoodsAttribute;
import com.mall.goods.entity.MallGoodsAttributeExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallGoodsAttributeMapper {

    long countByExample(MallGoodsAttributeExample example);

    int deleteByExample(MallGoodsAttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallGoodsAttribute record);

    int insertSelective(MallGoodsAttribute record);

    MallGoodsAttribute selectOneByExample(MallGoodsAttributeExample example);

    MallGoodsAttribute selectOneByExampleSelective(@Param("example") MallGoodsAttributeExample example, @Param("selective") MallGoodsAttribute.Column ... selective);

    List<MallGoodsAttribute> selectByExampleSelective(@Param("example") MallGoodsAttributeExample example, @Param("selective") MallGoodsAttribute.Column ... selective);

    List<MallGoodsAttribute> selectByExample(MallGoodsAttributeExample example);

    MallGoodsAttribute selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallGoodsAttribute.Column ... selective);

    MallGoodsAttribute selectByPrimaryKey(Integer id);

    MallGoodsAttribute selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") MallGoodsAttribute record, @Param("example") MallGoodsAttributeExample example);

    int updateByExample(@Param("record") MallGoodsAttribute record, @Param("example") MallGoodsAttributeExample example);

    int updateByPrimaryKeySelective(MallGoodsAttribute record);

    int updateByPrimaryKey(MallGoodsAttribute record);

    int logicalDeleteByExample(@Param("example") MallGoodsAttributeExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}