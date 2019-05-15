package com.yousheng.oa.biz.impl;

import com.yousheng.oa.biz.GlobalBiz;
import com.yousheng.oa.dao.EmployeeDao;
import com.yousheng.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Auther:卢宥晟
 * @ Date:2019/5/1
 * @ Description:com.yousheng.oa.biz.impl
 * @ version:1.0
 */

@Service("globalbiz")
public class GlobalBizImpl implements GlobalBiz {
    @Autowired
    private EmployeeDao employeeDao;
    public Employee login(String sn, String password) {
        Employee employee =employeeDao.select(sn);
        if(sn!=null&&employee.getPassword().equals(password)){
            return  employee;
        }
        return null;
    }

    public void changePassword(Employee employee) {
         employeeDao.update(employee);

    }
}
