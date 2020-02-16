package cn.cwj.ssm.controller;

import cn.cwj.ssm.domain.Order;
import cn.cwj.ssm.service.IOrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam("id") String id){
        ModelAndView mv = new ModelAndView();
        Order order = orderService.findById(id);
        mv.addObject("order",order);
        mv.setViewName("orders-show");
        return mv;
    }
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name="page",defaultValue = "1")Integer page,@RequestParam(name = "pageSize",defaultValue = "5") Integer pageSize){
        ModelAndView mv = new ModelAndView();
//        System.out.println(page+"|||"+pageSize);
        List<Order> orders = orderService.findAll(page,pageSize);
        System.out.println(orders);
        //一个分页bean
        PageInfo info = new PageInfo(orders);
        System.out.println(info);
        mv.addObject("info",info);
        mv.setViewName("orders-list");
        return mv;
    }
}
