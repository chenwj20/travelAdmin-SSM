package cn.cwj.ssm.service;

import cn.cwj.ssm.domain.Role;
import cn.cwj.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    void addRoleToUser(String[] rids,String uid);
    List<Role> findOtherRoles(String id);
    /**
     * 查询所有
     * @return
     */
    List<UserInfo> findAll();
    public void saveUser(UserInfo userInfo);
    /**
     * 根据id查询
     * @param id
     * @return
     */
    UserInfo findById(String id);
}
