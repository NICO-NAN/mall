package com.mall.goods.mapper;

import com.mall.goods.entity.MallGoodsSpecification;
import com.mall.goods.entity.MallGoodsSpecificationExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallGoodsSpecificationMapper {

    long countByExample(MallGoodsSpecificationExample example);

    int deleteByExample(MallGoodsSpecificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallGoodsSpecification record);

    int insertSelective(MallGoodsSpecification record);

    MallGoodsSpecification selectOneByExample(MallGoodsSpecificationExample example);

    MallGoodsSpecification selectOneByExampleSelective(@Param("example") MallGoodsSpecificationExample example, @Param("selective") MallGoodsSpecification.Column ... selective);

    List<MallGoodsSpecification> selectByExampleSelective(@Param("example") MallGoodsSpecificationExample example, @Param("selective") MallGoodsSpecification.Column ... selective);

    List<MallGoodsSpecification> selectByExample(MallGoodsSpecificationExample example);

    MallGoodsSpecification selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallGoodsSpecification.Column ... selective);

    MallGoodsSpecification selectByPrimaryKey(Integer id);

    MallGoodsSpecification selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") MallGoodsSpecification record, @Param("example") MallGoodsSpecificationExample example);

    int updateByExample(@Param("record") MallGoodsSpecification record, @Param("example") MallGoodsSpecificationExample example);

    int updateByPrimaryKeySelective(MallGoodsSpecification record);

    int updateByPrimaryKey(MallGoodsSpecification record);

    int logicalDeleteByExample(@Param("example") MallGoodsSpecificationExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}