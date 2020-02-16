package cn.cwj.ssm.dao;

import cn.cwj.ssm.domain.Role;
import cn.cwj.ssm.domain.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    void addRoleToUser(String uid,String rid);
    /**
     * 查询该用户不具备的角色
     * @param id
     * @return
     */
    List<Role> findOtherRoles(String id);
    /**
     * 通过条件查询用户
     * @param username
     * @return
     */
    UserInfo findByUsername(String username);

    /**
     * 查询所有
     * @return
     */
    List<UserInfo> findAll();

    /**
     * 添加用户
     * @param userInfo
     */
    void saveUser(UserInfo userInfo);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    UserInfo findById(String id);
}
