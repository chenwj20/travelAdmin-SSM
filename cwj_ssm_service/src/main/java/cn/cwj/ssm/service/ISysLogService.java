package cn.cwj.ssm.service;

import cn.cwj.ssm.domain.SysLog;

import java.util.List;

public interface ISysLogService {
    /**
     *
     * @param sysLog
     */
    void saveSysLog(SysLog sysLog);
    List<SysLog> findAll(Integer page, Integer pageSize);
}
