package cn.cwj.ssm.service;

import cn.cwj.ssm.dao.IPermissionDao;
import cn.cwj.ssm.domain.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PermissionServiceImpl implements IPermissionService {
    @Autowired
    private IPermissionDao permissionDao;
    @Override
    public List<Permission> findAll() {
        return permissionDao.findAll();
    }

    @Override
    public void addPermission(Permission permission) {
        permissionDao.addPermission(permission);
    }
}
