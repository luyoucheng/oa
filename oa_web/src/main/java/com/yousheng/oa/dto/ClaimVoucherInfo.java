package com.yousheng.oa.dto;

import com.yousheng.oa.entity.ClaimVoucher;
import com.yousheng.oa.entity.ClaimVoucherItem;

import java.util.List;

/**
 * @ Auther:卢宥晟
 * @ Date:2019/5/1
 * @ Description:com.yousheng.oa.dto
 * @ version:1.0
 */
public class ClaimVoucherInfo {
     private ClaimVoucher  claimVoucher;
     private List<ClaimVoucherItem> items;

    public ClaimVoucher getClaimVoucher() {
        return claimVoucher;
    }

    public void setClaimVoucher(ClaimVoucher claimVoucher) {
        this.claimVoucher = claimVoucher;
    }

    public List<ClaimVoucherItem> getItems() {
        return items;
    }

    public void setItems(List<ClaimVoucherItem> items) {
        this.items = items;
    }
}
