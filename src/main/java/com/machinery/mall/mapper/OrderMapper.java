package com.machinery.mall.mapper;

import com.machinery.mall.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    int insertOrder(Order order);
    Order selectOrderById(@Param("id") Integer id);
    List<Order> selectOrdersByUserId(@Param("uid") Integer uid);
    Order selectOrderByOrderNo(@Param("orderNo") Long orderNo);
    int deleteOrder(@Param("id") Integer id);
    int updateOrderStatus(Order order);
} 