package com.yousheng.oa.biz.impl;

import com.yousheng.oa.biz.ClaimVoucherBiz;
import com.yousheng.oa.dao.ClaimVoucherDao;
import com.yousheng.oa.dao.ClaimVoucherItemDao;
import com.yousheng.oa.dao.DealRecordDao;
import com.yousheng.oa.dao.EmployeeDao;
import com.yousheng.oa.entity.ClaimVoucher;
import com.yousheng.oa.entity.ClaimVoucherItem;
import com.yousheng.oa.entity.DealRecord;
import com.yousheng.oa.entity.Employee;
import com.yousheng.oa.global.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service("cliamVoucherBiz")
public class ClaimVoucherBizImpl implements ClaimVoucherBiz {
    @Autowired
    private ClaimVoucherDao claimVoucherDao;
    @Autowired
    private ClaimVoucherItemDao claimVoucherItemDao;
    @Autowired
    private DealRecordDao dealRecordDao;
    @Autowired
    private EmployeeDao employeeDao;

    public void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items) {
        claimVoucher.setCreateTime(new Date());
        claimVoucher.setNextDealSn(claimVoucher.getCreateSn());
        claimVoucher.setStatus(Const.CLALIMVOUCHER_CREATED);
        claimVoucherDao.insert(claimVoucher);

        for(ClaimVoucherItem item:items){
            item.setClaimVoucherId(claimVoucher.getId());
            claimVoucherItemDao.insert(item);
        }
    }

    public ClaimVoucher get(int id) {
        return claimVoucherDao.select(id);
    }

    public List<ClaimVoucherItem> getItems(int cvid) {
        return claimVoucherItemDao.selectByClaimVoucher(cvid);
    }

    public List<DealRecord> getRecords(int cvid) {
        return dealRecordDao.selectByClaimVoucher(cvid);
    }

    public List<ClaimVoucher> getForSelf(String sn) {
        return claimVoucherDao.selectByCreateSn(sn);
    }

    public List<ClaimVoucher> getForDeal(String sn) {
        return claimVoucherDao.selectByNextDealSn(sn);
    }

    public void update(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items) {
        claimVoucher.setNextDealSn(claimVoucher.getCreateSn());
        claimVoucher.setStatus(Const.CLALIMVOUCHER_CREATED);
        claimVoucherDao.update(claimVoucher);

        List<ClaimVoucherItem> olds = claimVoucherItemDao.selectByClaimVoucher(claimVoucher.getId());
        for(ClaimVoucherItem old:olds){
            boolean isHave=false;
            for(ClaimVoucherItem item:items){
                if(item.getId()==old.getId()){
                    isHave=true;
                    break;
                }
            }
            if(!isHave){
                claimVoucherItemDao.delete(old.getId());
            }
        }
        for(ClaimVoucherItem item:items){
            item.setClaimVoucherId(claimVoucher.getId());
            if(item.getId()>0){
                claimVoucherItemDao.update(item);
            }else{
                claimVoucherItemDao.insert(item);
            }
        }

    }

    public void submit(int id) {
        ClaimVoucher claimVoucher = claimVoucherDao.select(id);
        Employee employee = employeeDao.select(claimVoucher.getCreateSn());

        claimVoucher.setStatus(Const.CLALIMVOUCHER_SUBMIT);
        System.out.println(employee.getPost());
        if(employee.getPost().equals(Const.POST_GM)||employee.getPost().equals(Const.POST_FM)) {
            claimVoucher.setNextDealSn(employeeDao.selectByDepartmentAndPost(employee.getDepartmentSn(), Const.POST_CASHIER).get(0).getSn());
        }else{
            claimVoucher.setNextDealSn(employeeDao.selectByDepartmentAndPost(employee.getDepartmentSn(), Const.POST_FM).get(0).getSn());
        }

        claimVoucherDao.update(claimVoucher);

        DealRecord dealRecord = new DealRecord();
        dealRecord.setDealWay(Const.DEAL_SUBMIT);
        dealRecord.setDealSn(employee.getSn());
        dealRecord.setClaimVoucherId(id);
        dealRecord.setDealResult(Const.CLALIMVOUCHER_SUBMIT);
        dealRecord.setDealTime(new Date());
        dealRecord.setComment("无");
        dealRecordDao.insert(dealRecord);
    }

    public void deal(DealRecord dealRecord) {
        ClaimVoucher claimVoucher = claimVoucherDao.select(dealRecord.getClaimVoucherId());
        Employee employee = employeeDao.select(dealRecord.getDealSn());
        dealRecord.setDealTime(new Date());

        if(dealRecord.getDealWay().equals(Const.DEAL_PASS)){
            if(claimVoucher.getTotalAmount()<=Const.LIMIT_CHECK || employee.getPost().equals(Const.POST_GM)){
                claimVoucher.setStatus(Const.CLALIMVOUCHER_APPROVER);
                claimVoucher.setNextDealSn(employeeDao.selectByDepartmentAndPost(null,Const.POST_CASHIER).get(0).getSn());

                dealRecord.setDealResult(Const.CLALIMVOUCHER_APPROVER);
            }else{
                claimVoucher.setStatus(Const.CLALIMVOUCHER_RECHECK);
                claimVoucher.setNextDealSn(employeeDao.selectByDepartmentAndPost(null,Const.POST_GM).get(0).getSn());

                dealRecord.setDealResult(Const.CLALIMVOUCHER_RECHECK);
            }
        }else if(dealRecord.getDealWay().equals(Const.DEAL_BACK)){
            claimVoucher.setStatus(Const.CLALIMVOUCHER_BACK);
            claimVoucher.setNextDealSn(claimVoucher.getCreateSn());

            dealRecord.setDealResult(Const.CLALIMVOUCHER_BACK);
        }else if(dealRecord.getDealWay().equals(Const.DEAL_REJECT)){
            claimVoucher.setStatus(Const.CLALIMVOUCHER_TERMINATED);
            claimVoucher.setNextDealSn(null);

            dealRecord.setDealResult(Const.CLALIMVOUCHER_TERMINATED);
        }else if(dealRecord.getDealWay().equals(Const.DEAL_PAID)){
            claimVoucher.setStatus(Const.CLALIMVOUCHER_PAID);
            claimVoucher.setNextDealSn(null);

            dealRecord.setDealResult(Const.CLALIMVOUCHER_PAID);
        }

        claimVoucherDao.update(claimVoucher);
        dealRecordDao.insert(dealRecord);
    }

}
