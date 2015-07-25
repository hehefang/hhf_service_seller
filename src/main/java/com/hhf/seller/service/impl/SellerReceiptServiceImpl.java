package com.hhf.seller.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhf.model.seller.SellerReceipt;
import com.hhf.seller.dao.SellerReceiptMapper;
import com.hhf.service.seller.ISellerReceiptService;

@Service("sellerReceiptService")
public class SellerReceiptServiceImpl implements ISellerReceiptService{

	@Autowired
	protected SellerReceiptMapper sellerReceiptMapper;
	
	@Override
	public SellerReceipt getSellerReceiptById(int receiptId) {
		return sellerReceiptMapper.selectByPrimaryKey(receiptId);
	}

	@Override
	public SellerReceipt getSellerReceiptBySellerId(int sellerId) {
		return sellerReceiptMapper.getSellerReceiptBySellerId(sellerId);
	}

	@Override
	public int updateSellerReceipt(SellerReceipt receipt) {
		int i = 0;
		if(null != receipt.getReceiptId() && receipt.getReceiptId() >0){
			 i = sellerReceiptMapper.updateByPrimaryKeySelective(receipt);
		}else{
			 i = sellerReceiptMapper.insertSelective(receipt);
		}
		
		return i;
	}

}
