package cn.cwj.ssm.service;

import cn.cwj.ssm.dao.IProductDao;
import cn.cwj.ssm.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

}
