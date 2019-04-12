package com.dreamfield.dreamapi.mapper.dream.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dreamfield.dreamapi.model.dream.Order;
/**
*  @author shangwei
*/
public interface OrderBaseMapper {

    int insertOrder(Order object);

    int updateOrder(Order object);

    int update(Order.UpdateBuilder object);

    List<Order> queryOrder(Order object);

    Order queryOrderLimit1(Order object);

}