package cn.cwj.ssm.dao;

import cn.cwj.ssm.domain.SysLog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISysLogDao {
    /**
     * 保存日志
     * @param sysLog
     */
     void saveSysLog(SysLog sysLog);
     List<SysLog> findAll();
}
