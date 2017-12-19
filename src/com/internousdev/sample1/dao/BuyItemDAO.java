package com.internousdev.sample1.dao;

import com.internousdev.sample1.dto.BuyItemDTO;
import com.internousdev.sample1.util.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class BuyItemDAO {
	
	private DBConnector dbConnector = new DBConnector();
	
	private Connection connection = dbConnector.getConnection();
	
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	
	public BuyItemDTO getBuyItemInfo(){
		
			String sql ="SELECT id"
	}

}
