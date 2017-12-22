package com.internousdev.sample1.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;

	private String id;
	private String buyItemName;
	private String buyItemPrice;
	private Map<String,Object> session;


	public String execute(){
		String ret=ERROR;
		if(!(buyItemName.isEmpty())){
			if(!(buyItemPrice.isEmpty())){

				session.put("loginUserId", loginUserId);
				session.put("loginPassword", loginPassword);
				session.put("id", id);
				session.put("buyItem_name", buyItemName);
				session.put("buyItem_price", buyItemPrice);

				return SUCCESS;
			}
		}


		return ret;
	}



	public String getLoginUserId() {
		return loginUserId;
	}



	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}



	public String getLoginPassword() {
		return loginPassword;
	}



	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getBuyItemName() {
		return buyItemName;
	}


	public void setBuyItemName(String buyItemName) {
		this.buyItemName = buyItemName;
	}


	public String getBuyItemPrice() {
		return buyItemPrice;
	}


	public void setBuyItemPrice(String buyItemPrice) {
		this.buyItemPrice = buyItemPrice;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




}
