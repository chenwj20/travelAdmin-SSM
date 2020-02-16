package dao.test;

import cn.cwj.ssm.domain.Product;
import cn.cwj.ssm.service.IProductService;
import cn.cwj.ssm.service.ProductServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

public class DaoTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IProductService bean = (IProductService) cp.getBean(IProductService.class);
        List<Product> l = bean.findAll();
        System.out.println(l);
        cp.close();
    }
    @Test
    public void jiaMI(){
        String password = "222";
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode(password);
        System.out.println(encode);
    }
}
