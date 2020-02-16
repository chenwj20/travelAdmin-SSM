package cn.cwj.ssm.service;

import cn.cwj.ssm.dao.ISysLogDao;
import cn.cwj.ssm.domain.SysLog;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLogServiceImpl implements ISysLogService{
    @Autowired
    private ISysLogDao sysLogDao;

    @Override
    public void saveSysLog(SysLog sysLog) {
        sysLogDao.saveSysLog(sysLog);
    }

    @Override
    public List<SysLog> findAll(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return sysLogDao.findAll();
    }
}
