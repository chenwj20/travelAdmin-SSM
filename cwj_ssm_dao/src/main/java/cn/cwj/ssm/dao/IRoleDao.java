package cn.cwj.ssm.dao;

import cn.cwj.ssm.domain.Permission;
import cn.cwj.ssm.domain.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IRoleDao {
    /**
     * 查询所有角色
     * @return
     */
     List<Role> findAll();
     void addRole(Role role);
     List<Permission> findRoleByIdAndAllPermission(String id);
     void addPermissionToRole(@Param("pid") String pid,@Param("rid") String rid);
}
