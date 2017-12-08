package com.internousdev.sample1.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.internousdev.sample1.dao.LoginDAO;
import com.internousdev.sample1.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;

	private String loginPassword;

	private String result;

	private LoginDAO loginDAO = new LoginDAO();

	private LoginDTO loginDTO = new LoginDTO();

	public String execute(){
		result = ERROR;

		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);

		session.put("loginUser", loginDTO);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
			result = SUCCESS;

			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo()
		}
	}
}
