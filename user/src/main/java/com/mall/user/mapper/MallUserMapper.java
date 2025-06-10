package com.mall.user.mapper;

import com.mall.user.entity.MallUser;
import com.mall.user.entity.MallUserExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallUserMapper {

    long countByExample(MallUserExample example);

    int insert(MallUser record);

    int insertSelective(MallUser record);

    MallUser selectOneByExample(MallUserExample example);

    List<MallUser> selectByExampleSelective(@Param("example") MallUserExample example, @Param("selective") MallUser.Column ... selective);

    List<MallUser> selectByExample(MallUserExample example);

    MallUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallUser record, @Param("example") MallUserExample example);

    int updateByPrimaryKeySelective(MallUser record);

    int logicalDeleteByExample(@Param("example") MallUserExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}