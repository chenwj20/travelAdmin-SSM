package cn.cwj.ssm.service;

import cn.cwj.ssm.dao.IUserDao;
import cn.cwj.ssm.domain.Role;
import cn.cwj.ssm.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = userDao.findByUsername(username);
        System.out.println(userInfo.getRoles());// userInfo.getStatus() == 0 ? false : true, true, true, true
        User user = new User(userInfo.getUsername(), userInfo.getPassword(), getGrantedAuthority(userInfo.getRoles()));
        return user;
    }
    public List<SimpleGrantedAuthority>  getGrantedAuthority(List<Role> list){
        List<SimpleGrantedAuthority>  grantedAuthorities = new ArrayList<>();
        for (Role role : list) {
            System.out.println(role.getRoleName());
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
        }
        return grantedAuthorities;
    }


    @Override
    public void addRoleToUser(String[] rids, String uid) {
        for (String rid : rids) {
            userDao.addRoleToUser(uid,rid);
        }
    }

    @Override
    public List<Role> findOtherRoles(String id) {
        return userDao.findOtherRoles(id);
    }

    @Override
    public List<UserInfo> findAll() {
        return userDao.findAll();
    }

    @Override
    public void saveUser(UserInfo userInfo) {
        String password = bCryptPasswordEncoder.encode(userInfo.getPassword());
        userInfo.setPassword(password);
        userDao.saveUser(userInfo);
    }

    @Override
    public UserInfo findById(String id) {
        return userDao.findById(id);
    }
}
