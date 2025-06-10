package com.mall.common.mapper;

import com.mall.common.entity.MallStorage;
import com.mall.common.entity.MallStorageExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MallStorageMapper {

    long countByExample(MallStorageExample example);

    int deleteByExample(MallStorageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallStorage record);

    int insertSelective(MallStorage record);

    MallStorage selectOneByExample(MallStorageExample example);

    MallStorage selectOneByExampleSelective(@Param("example") MallStorageExample example, @Param("selective") MallStorage.Column ... selective);

    List<MallStorage> selectByExampleSelective(@Param("example") MallStorageExample example, @Param("selective") MallStorage.Column ... selective);

    List<MallStorage> selectByExample(MallStorageExample example);

    MallStorage selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallStorage.Column ... selective);

    MallStorage selectByPrimaryKey(Integer id);

    MallStorage selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") MallStorage record, @Param("example") MallStorageExample example);

    int updateByExample(@Param("record") MallStorage record, @Param("example") MallStorageExample example);

    int updateByPrimaryKeySelective(MallStorage record);

    int updateByPrimaryKey(MallStorage record);

    int logicalDeleteByExample(@Param("example") MallStorageExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}