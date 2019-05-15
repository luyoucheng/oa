package com.yousheng.oa.global;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Auther:卢宥晟
 * @ Date:2019/4/29
 * @ Description:com.yousheng.oa.global
 * @ version:1.0
 */
public class Const {
    //职务
    public static final String POST_STAFF="员工";
    public static final String POST_FM="部门经理";
    public static final String POST_GM="总经理";
    public static final String POST_CASHIER="财务";

    // 注册的时候 我们要选择职务 所以将所有都返回
    public static List<String> getPosts(){
        List<String>  list =new ArrayList<String>();
        list.add(POST_STAFF);
        list.add(POST_FM);
        list.add(POST_GM);
        list.add(POST_CASHIER);
        return list;
    }


    //费用类别
    public static List<String> getItems(){
        List<String>  list =new ArrayList<String>();
        list.add("交通");
        list.add("餐饮");
        list.add("住宿");
        list.add("办公");
        return list;
    }

    //报销单的状态
    public static final String CLALIMVOUCHER_CREATED="新创建";
    public static final String CLALIMVOUCHER_SUBMIT="已提交";
    public static final String CLALIMVOUCHER_APPROVER="已审核";
    public static final String CLALIMVOUCHER_BACK="已打回";
    public static final String CLALIMVOUCHER_TERMINATED="已终止";
    public static final String CLALIMVOUCHER_RECHECK="待复审";
    public static final String CLALIMVOUCHER_PAID="已打款";

    //复审的额度
    public static final double LIMIT_CHECK=5000.00;

    //报销的处理

    public static final String DEAL_CREATE="创建";
    public static final String DEAL_SUBMIT="提交";
    public static final String DEAL_UPDATE="修改";
    public static final String DEAL_BACK="打回";
    public static final String DEAL_REJECT="拒绝";
    public static final String DEAL_PASS="通过";
    public static final String DEAL_PAID="打款";






}
