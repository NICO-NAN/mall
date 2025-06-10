package com.mall.order.mapper;

import com.mall.order.entity.MallOrder;
import com.mall.order.entity.MallOrderExample;
import org.apache.ibatis.annotations.Param;
import java.time.LocalDateTime;
import java.util.List;

public interface MallOrderMapper {

    int pay(Integer orderId);

    long countByExample(MallOrderExample example);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    MallOrder selectOneByExample(MallOrderExample example);

    List<MallOrder> selectByExampleSelective(@Param("example") MallOrderExample example, @Param("selective") MallOrder.Column ... selective);

    List<MallOrder> selectByExample(MallOrderExample example);

    MallOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallOrder record, @Param("example") MallOrderExample example);

    int updateByPrimaryKeySelective(MallOrder record);

    int logicalDeleteByExample(@Param("example") MallOrderExample example);

    int logicalDeleteByPrimaryKey(Integer id);

    int updateWithOptimisticLocker(@Param("lastUpdateTime") LocalDateTime lastUpdateTime, @Param("order") MallOrder order);

}