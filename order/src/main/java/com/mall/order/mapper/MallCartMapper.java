package com.mall.order.mapper;

import com.mall.order.entity.MallCart;
import com.mall.order.entity.MallCartExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallCartMapper {

    long countByExample(MallCartExample example);

    int insert(MallCart record);

    int insertSelective(MallCart record);

    MallCart selectOneByExample(MallCartExample example);

    List<MallCart> selectByExampleSelective(@Param("example") MallCartExample example, @Param("selective") MallCart.Column ... selective);

    List<MallCart> selectByExample(MallCartExample example);

    MallCart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallCart record, @Param("example") MallCartExample example);

    int updateByPrimaryKeySelective(MallCart record);

    int logicalDeleteByExample(@Param("example") MallCartExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}