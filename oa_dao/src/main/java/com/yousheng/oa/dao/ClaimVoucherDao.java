package com.yousheng.oa.dao;


import com.yousheng.oa.entity.ClaimVoucher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("claimVoucherDao")
public interface ClaimVoucherDao {
    void insert(ClaimVoucher claimVoucher);
    void update(ClaimVoucher claimVoucher);
    void delete(int id);
    ClaimVoucher select(int id);
    List<ClaimVoucher> selectByCreateSn(String csn);
    List<ClaimVoucher> selectByNextDealSn(String ndsn);
}
