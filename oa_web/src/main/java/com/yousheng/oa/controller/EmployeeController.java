package com.yousheng.oa.controller;


import com.yousheng.oa.biz.DepartmentBiz;
import com.yousheng.oa.biz.EmployeeBiz;
import com.yousheng.oa.entity.Employee;
import com.yousheng.oa.global.Const;
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

@Controller("emplyeeController")
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeBiz employeeBiz;

    @Autowired
    private DepartmentBiz departmentbiz;

    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",employeeBiz.getAll());
        return "employee_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("employee",new Employee());
        map.put("dlist",departmentbiz.getAll());
        map.put("plist", Const.getPosts());
        return  "employee_add";
    }

    @RequestMapping("/add")
    public String toAdd(Employee employee){
        employeeBiz.add(employee);
        return  "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "sn")
    public String toUpadate(String sn,Map<String,Object> map){
        map.put("employee",employeeBiz.get(sn));
        map.put("dlist",departmentbiz.getAll());
        map.put("plist", Const.getPosts());
        return  "employee_update";
    }

    @RequestMapping("/update")
    public String update(Employee employee){
        employeeBiz.edit(employee);
        return  "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "sn")
    public String toRemove(String sn){
        employeeBiz.remove(sn);
        return  "redirect:list";
    }




}
