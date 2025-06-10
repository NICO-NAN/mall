package com.mall.goods.mapper;

import com.mall.goods.entity.MallCategory;
import com.mall.goods.entity.MallCategoryExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallCategoryMapper {

    long countByExample(MallCategoryExample example);

    int deleteByExample(MallCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallCategory record);

    int insertSelective(MallCategory record);

    MallCategory selectOneByExample(MallCategoryExample example);

    MallCategory selectOneByExampleSelective(@Param("example") MallCategoryExample example, @Param("selective") MallCategory.Column ... selective);

    List<MallCategory> selectByExampleSelective(@Param("example") MallCategoryExample example, @Param("selective") MallCategory.Column ... selective);

    List<MallCategory> selectByExample(MallCategoryExample example);

    MallCategory selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallCategory.Column ... selective);

    MallCategory selectByPrimaryKey(Integer id);

    MallCategory selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") MallCategory record, @Param("example") MallCategoryExample example);

    int updateByExample(@Param("record") MallCategory record, @Param("example") MallCategoryExample example);

    int updateByPrimaryKeySelective(MallCategory record);

    int updateByPrimaryKey(MallCategory record);

    int logicalDeleteByExample(@Param("example") MallCategoryExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}