package com.hhf.seller.dao;

import com.hhf.model.seller.SellerReceipt;

public interface SellerReceiptMapper {
    int deleteByPrimaryKey(Integer receiptId);

    int insert(SellerReceipt record);

    int insertSelective(SellerReceipt record);

    SellerReceipt selectByPrimaryKey(Integer receiptId);

    int updateByPrimaryKeySelective(SellerReceipt record);

    int updateByPrimaryKey(SellerReceipt record);

	SellerReceipt getSellerReceiptBySellerId(int sellerId);
}