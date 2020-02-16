package cn.cwj.ssm.dao;

import cn.cwj.ssm.domain.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPermissionDao {
    List<Permission> findAll();
    void addPermission(Permission permission);
}
