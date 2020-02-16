package cn.cwj.ssm.service;

import cn.cwj.ssm.domain.Permission;

import java.util.List;

public interface IPermissionService {
    List<Permission> findAll();
    void addPermission(Permission permission);
}
