package com.internousdev.sample1.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sample1.dao.BuyItemConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	private String loginId;
	private String loginUserId;
	private String loginPassword;
	private String id;
	private String buyItemName;
	private String buyItemPrice;
	private String pay;

	private Map<String ,Object> session;

	public String execute(){
		String ret=ERROR;

		loginUserId = session.get("loginUserId").toString();
		loginPassword = session.get("loginPassword").toString();


		BuyItemConfirmDAO buyItemConfirmDAO =new BuyItemConfirmDAO();

		String item_transaction_id = this.id;
		String total_price = this.buyItemPrice;
		String total_count = "1";
		String user_master_id = null;
		if(loginId!=null){
			user_master_id = loginId;
		}
		if(loginUserId!=null){
			user_master_id = loginUserId;
		}else{
			user_master_id = "";
		}

		String pay= this.pay;

		try {
			if((buyItemConfirmDAO.buyItemConfirmInsert(item_transaction_id, total_price, total_count, user_master_id, pay)>0)){
				return SUCCESS;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public String getPay() {
		return pay;
	}



	public void setPay(String pay) {
		this.pay = pay;
	}



	public String getLoginId() {
		return loginId;
	}



	public void setLoginId(String loginId) {
		this.loginId = loginId;
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



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}



}
