package cn.cwj.ssm.controller;

import cn.cwj.ssm.domain.Product;
import cn.cwj.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RequestMapping("/product")
@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Product> products = productService.findAll();
        mv.addObject("productsList",products);

        mv.setViewName("product-list1");
        return mv;
    }
    @RequestMapping("/addProduct.do")
    public String addProduct(Product product){
        productService.addProduct(product);
        return "forward:findAll.do";
    }
}
