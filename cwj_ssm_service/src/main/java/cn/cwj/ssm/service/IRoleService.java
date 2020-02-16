package cn.cwj.ssm.service;

import cn.cwj.ssm.domain.Permission;
import cn.cwj.ssm.domain.Role;

import java.util.List;

public interface IRoleService {
    /**
     * 查询所有角色
     * @return
     */
    List<Role> findAll();
    void addRole(Role role);
    List<Permission> findRoleByIdAndAllPermission(String id);
    void addPermissionToRole(String[] pids,String rid );
}
