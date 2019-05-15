package com.yousheng.oa.biz.impl;

import com.yousheng.oa.biz.DepartmentBiz;
import com.yousheng.oa.dao.DepartmentDao;
import com.yousheng.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Auther:卢宥晟
 * @ Date:2019/4/29
 * @ Description:com.yousheng.oa.biz.impl
 * @ version:1.0
 */
@Service("departmentBiz")
public class DepartmentBizImpl implements DepartmentBiz {
    @Autowired
     private DepartmentDao departmentDao;
   public void add(Department department){
        departmentDao.insert(department);
   };

   public void edit(Department department){
       departmentDao.update(department);
   }
    public void remove(String sn){
       departmentDao.delete(sn);
    }

    public Department get(String sn){
       return  departmentDao.select(sn);
    };
    public List<Department> getAll(){
        return  departmentDao.selectAll();
    };
}
