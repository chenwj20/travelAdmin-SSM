package cn.cwj.ssm.dao;

import cn.cwj.ssm.domain.Order;
import cn.cwj.ssm.domain.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderDao {
    /**
     * 查询所有订单
     * @return
     */
    public List<Order> findAll();

    /**
     * 根据Id查询一个
     * @param id
     * @return
     */
    public Order findById(String id);
}
