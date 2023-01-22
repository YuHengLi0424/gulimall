package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xenon
 * @email 768527756@qq.com
 * @date 2023-01-22 15:40:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
