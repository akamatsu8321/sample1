package com.internousdev.sample1.action;

import com.internousdev.sample1.dao.BuyItemDAO;
import com.internousdev.sample1.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAeare {
	
	public Map<String, Object> session;
	
	public String execute(){
		
		BuyItemDAO buyItemDAO = new BuyItemDAO();
		BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
		session.put("id", buyItemDTO.getId());
		session.put("buyItem_name", buyItemDTO.getItemName());
		session.put("buyItem_price", buyItemDTO.getItemPrice());

		
		return SUCCESS;
		
	}

}
