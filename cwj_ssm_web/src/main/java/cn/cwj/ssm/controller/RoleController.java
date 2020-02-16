package cn.cwj.ssm.controller;

import cn.cwj.ssm.domain.Permission;
import cn.cwj.ssm.domain.Role;
import cn.cwj.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private IRoleService roleService;
    @RequestMapping("/addPermissionToRole.do")
    public String addPermissionToRole(@RequestParam(name = "rid",required = true) String rid, String[] pids){
        roleService.addPermissionToRole(pids,rid);
        return "redirect:findAll.do";
    }
    @RequestMapping("/findOtherPermission.do")
    public ModelAndView findRoleByIdAndAllPermission(String id){
        ModelAndView mv = new ModelAndView();
        List<Permission> permissions = roleService.findRoleByIdAndAllPermission(id);
        mv.addObject("permissionList",permissions);
        mv.addObject("roleid",id);
        return mv;
    }
    @RequestMapping("/addRole.do")
    public String addRole(Role role){
        System.out.println(role.getRoleName()+role.getRoleDesc());
        roleService.addRole(role);
        return "forward:findAll.do";
    }
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Role> roles = roleService.findAll();
        mv.addObject("roleList",roles);
        mv.setViewName("role-list");
        return mv;
    }
}
