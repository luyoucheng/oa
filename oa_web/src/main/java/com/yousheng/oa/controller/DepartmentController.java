package com.yousheng.oa.controller;

import com.yousheng.oa.biz.DepartmentBiz;
import com.yousheng.oa.biz.EmployeeBiz;
import com.yousheng.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @ Auther:卢宥晟
 * @ Date:2019/4/30
 * @ Description:com.yousheng.oa.controller
 * @ version:1.0
 */

@Controller("departmentController")
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentBiz departmentBiz;



    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",departmentBiz.getAll());

        return "department_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("department",new Department());
        departmentBiz.getAll();
        return  "department_add";
    }

    @RequestMapping("/add")
    public String toAdd(Department department){
        departmentBiz.add(department);
        return  "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "sn")
    public String toUpadate(String sn,Map<String,Object> map){
        map.put("department",departmentBiz.get(sn));
        return  "department_update";
    }

    @RequestMapping("/update")
    public String update(Department department){
        System.out.println(department.getName());
        departmentBiz.edit(department);
        return  "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "sn")
    public String toRemove(String sn){
          departmentBiz.remove(sn);
        return  "redirect:list";
    }




}
