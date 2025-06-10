package com.mall.goods.mapper;

import com.mall.goods.entity.MallCart;
import com.mall.goods.entity.MallCartExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallCartMapper {

    long countByExample(MallCartExample example);

    int deleteByExample(MallCartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallCart record);

    int insertSelective(MallCart record);

    MallCart selectOneByExample(MallCartExample example);

    MallCart selectOneByExampleSelective(@Param("example") MallCartExample example, @Param("selective") MallCart.Column ... selective);

    List<MallCart> selectByExampleSelective(@Param("example") MallCartExample example, @Param("selective") MallCart.Column ... selective);

    List<MallCart> selectByExample(MallCartExample example);

    MallCart selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallCart.Column ... selective);

    MallCart selectByPrimaryKey(Integer id);

    MallCart selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") MallCart record, @Param("example") MallCartExample example);

    int updateByExample(@Param("record") MallCart record, @Param("example") MallCartExample example);

    int updateByPrimaryKeySelective(MallCart record);

    int updateByPrimaryKey(MallCart record);

    int logicalDeleteByExample(@Param("example") MallCartExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}