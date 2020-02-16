package cn.cwj.ssm.dao;

import cn.cwj.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductDao {
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
