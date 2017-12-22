package com.internousdev.sample1.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sample1.dao.BuyItemDAO;
import com.internousdev.sample1.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoHomeAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;

	public String execute(){

			BuyItemDAO buyItemDAO = new BuyItemDAO();

			// 商品の情報を取得しています。
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name",buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());




		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public Map<String, Object> getSession() {
		return session;
	}

}
