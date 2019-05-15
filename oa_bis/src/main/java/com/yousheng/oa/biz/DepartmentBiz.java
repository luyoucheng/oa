package com.yousheng.oa.biz;

import com.yousheng.oa.entity.Department;

import java.util.List;

/**
 * @ Auther:卢宥晟
 * @ Date:2019/4/29
 * @ Description:com.yousheng.oa.biz
 * @ version:1.0
 */
public interface DepartmentBiz {
    void add(Department department);
    void edit(Department department);
    void remove(String sn);
    Department get(String sn);
    List<Department> getAll();


}
