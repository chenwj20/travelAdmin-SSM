package cn.cwj.ssm.controller;

import cn.cwj.ssm.domain.Permission;
import cn.cwj.ssm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private IPermissionService permissionService;

    @RequestMapping("/addPermission.do")
    public String addPermission(Permission permission){
        permissionService.addPermission(permission);
        System.out.println(permission.getPermissionName()+permission.getUrl());
        return "forward:findAll.do";
    }
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Permission> permissions = permissionService.findAll();
        mv.addObject("permissionList",permissions);
        mv.setViewName("permission-list");
        return mv;
    }
}
