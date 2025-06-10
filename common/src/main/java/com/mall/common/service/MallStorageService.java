package com.mall.common.service;

import com.github.pagehelper.PageHelper;
import com.mall.common.entity.MallStorage;
import com.mall.common.entity.MallStorageExample;
import com.mall.common.mapper.MallStorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MallStorageService {
    @Autowired
    private MallStorageMapper storageMapper;

    public void deleteByKey(String key) {
        MallStorageExample example = new MallStorageExample();
        example.or().andKeyEqualTo(key);
        storageMapper.logicalDeleteByExample(example);
    }

    public void add(MallStorage storageInfo) {
        storageInfo.setAddTime(LocalDateTime.now());
        storageInfo.setUpdateTime(LocalDateTime.now());
        storageMapper.insertSelective(storageInfo);
    }

    public MallStorage findByKey(String key) {
        MallStorageExample example = new MallStorageExample();
        example.or().andKeyEqualTo(key).andDeletedEqualTo(false);
        return storageMapper.selectOneByExample(example);
    }

    public int update(MallStorage storageInfo) {
        storageInfo.setUpdateTime(LocalDateTime.now());
        return storageMapper.updateByPrimaryKeySelective(storageInfo);
    }

    public MallStorage findById(Integer id) {
        return storageMapper.selectByPrimaryKey(id);
    }

}
