package cn.cwj.ssm.service;

import cn.cwj.ssm.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProductService {
    /**
     * 查询所有产品
     * @return
     */
    List<Product> findAll();

    /**
     * 添加产品
     * @param product
     */
    void addProduct(Product product);
}
