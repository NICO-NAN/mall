package com.mall.user.mapper;

import com.mall.user.entity.MallAddress;
import com.mall.user.entity.MallAddressExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallAddressMapper {
    
    long countByExample(MallAddressExample example);

    int insert(MallAddress record);

    int insertSelective(MallAddress record);

    MallAddress selectOneByExample(MallAddressExample example);

    List<MallAddress> selectByExampleSelective(@Param("example") MallAddressExample example, @Param("selective") MallAddress.Column ... selective);

    List<MallAddress> selectByExample(MallAddressExample example);

    MallAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallAddress record, @Param("example") MallAddressExample example);

    int updateByPrimaryKeySelective(MallAddress record);

    int logicalDeleteByExample(@Param("example") MallAddressExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}