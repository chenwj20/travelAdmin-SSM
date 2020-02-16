package cn.cwj.ssm.service;

import cn.cwj.ssm.dao.IRoleDao;
import cn.cwj.ssm.domain.Permission;
import cn.cwj.ssm.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService{
    @Autowired
    private IRoleDao roleDao;

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

    @Override
    public void addRole(Role role) {
        roleDao.addRole(role);
    }

    @Override
    public List<Permission> findRoleByIdAndAllPermission(String id) {
        return roleDao.findRoleByIdAndAllPermission(id);
    }

    @Override
    public void addPermissionToRole(String[] pids, String rid) {
        for (String pid : pids) {
            roleDao.addPermissionToRole(pid,rid);
        }
    }
}
