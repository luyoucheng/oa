package com.yousheng.oa.biz;

import com.yousheng.oa.entity.Employee;

/**
 * @ Auther:卢宥晟
 * @ Date:2019/5/1
 * @ Description:com.yousheng.oa.biz
 * @ version:1.0
 */
public interface GlobalBiz {
    Employee login(String sn,String password);
    void  changePassword(Employee employee);

}
