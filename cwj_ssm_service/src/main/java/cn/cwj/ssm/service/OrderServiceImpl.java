package cn.cwj.ssm.service;

import cn.cwj.ssm.dao.IOrderDao;
import cn.cwj.ssm.domain.Order;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IOrderDao orderDao;
    @Override
    public List<Order> findAll(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return orderDao.findAll();
    }

    @Override
    public Order findById(String id) {
        return orderDao.findById(id);
    }
}
