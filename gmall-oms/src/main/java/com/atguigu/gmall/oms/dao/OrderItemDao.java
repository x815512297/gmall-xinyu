package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xinyu
 * @email 815512297@qq.com
 * @date 2019-09-22 15:55:18
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
