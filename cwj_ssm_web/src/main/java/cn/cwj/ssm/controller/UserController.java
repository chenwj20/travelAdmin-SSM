package cn.cwj.ssm.controller;

import cn.cwj.ssm.domain.Role;
import cn.cwj.ssm.domain.UserInfo;
import cn.cwj.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/addRoleToUser.do")
    public String addRoleToUser(String[] rids,String uid){
        for(String rid:rids){
            System.out.println(rid);
        }
        System.out.println(uid);
        userService.addRoleToUser(rids,uid);
        return "redirect:findAll.do";
    }
    @RequestMapping("/findUserByIdAndAllRole.do")
    public ModelAndView findUserByIdAndAllRole(String id){
        ModelAndView mv = new ModelAndView();
        List<Role> otherRoles = userService.findOtherRoles(id);
        mv.addObject("roleList",otherRoles);
        mv.addObject("user",id);
        mv.setViewName("user-role-add");
        return mv;
    }
    @RequestMapping("/findById.do")
    public ModelAndView findById(String id){
        ModelAndView mv = new ModelAndView();
        UserInfo userInfo = userService.findById(id);
        mv.addObject("user",userInfo);
        mv.setViewName("user-show");
        return mv;
    }
    @RequestMapping("/saveUser.do")
    public String saveUser(UserInfo userInfo){
       userService.saveUser(userInfo);
       return "forward:findAll.do";
    }
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<UserInfo> users = userService.findAll();
        mv.addObject("userList",users);
        mv.setViewName("user-list");
        return mv;
    }

}
