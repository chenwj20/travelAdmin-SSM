package cn.cwj.ssm.service;

import cn.cwj.ssm.domain.Order;

import java.util.List;

public interface IOrderService {
    /**
     * 查询所有订单
     * @return
     * @param page
     * @param pageSize
     */
    public List<Order> findAll(Integer page, Integer pageSize);
    /**
     * 根据Id查询一个
     * @param id
     * @return
     */
    public Order findById(String id);
}
