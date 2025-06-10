package com.mall.goods.service;

import com.github.pagehelper.PageHelper;
import com.mall.goods.entity.MallCategory;
import com.mall.goods.entity.MallCategoryExample;
import com.mall.goods.mapper.MallCategoryMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MallCategoryService {
    @Resource
    private MallCategoryMapper categoryMapper;
    private MallCategory.Column[] CHANNEL = {MallCategory.Column.id, MallCategory.Column.name, MallCategory.Column.iconUrl};

    public List<MallCategory> queryL1() {
        MallCategoryExample example = new MallCategoryExample();
        example.or().andLevelEqualTo("L1").andDeletedEqualTo(false);
        return categoryMapper.selectByExample(example);
    }

    public List<MallCategory> queryByPid(Integer pid) {
        MallCategoryExample example = new MallCategoryExample();
        example.or().andPidEqualTo(pid).andDeletedEqualTo(false);
        return categoryMapper.selectByExample(example);
    }

    public List<MallCategory> queryL2ByIds(List<Integer> ids) {
        MallCategoryExample example = new MallCategoryExample();
        example.or().andIdIn(ids).andLevelEqualTo("L2").andDeletedEqualTo(false);
        return categoryMapper.selectByExample(example);
    }

    public MallCategory findById(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
        categoryMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(MallCategory category) {
        category.setAddTime(LocalDateTime.now());
        category.setUpdateTime(LocalDateTime.now());
        categoryMapper.insertSelective(category);
    }

}
