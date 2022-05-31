package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hygod
 * @email jeremygit@163.com
 * @date 2022-05-31 19:35:17
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
