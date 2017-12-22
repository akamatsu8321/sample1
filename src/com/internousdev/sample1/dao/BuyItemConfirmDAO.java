package com.internousdev.sample1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.sample1.dto.BuyItemDTO;
import com.internousdev.sample1.util.DBConnector;

public class BuyItemConfirmDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();



	public BuyItemDTO getBuyItemInfo(){

		BuyItemDTO buyItemDTO = new BuyItemDTO();

		String sql ="SELECT id, item_name, item_price FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				buyItemDTO.setId(resultSet.getInt("id"));

				buyItemDTO.setItemName(resultSet.getString("item_name"));

				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return buyItemDTO;
}

	/**
	 * 商品履歴登録
	 *
	 * @param item_transaction_id
	 * @param user_master_id
	 * @return
	 * @throws SQLException
	 */
	public int buyItemConfirmInsert(String item_transaction_id, String total_price, String total_count, String user_master_id, String pay) throws SQLException {

		String sql = "insert into user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay) values(?,?,?,?,?)";

		PreparedStatement preparedStatement;
		int count =0;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, Integer.parseInt(item_transaction_id));
			preparedStatement.setInt(2, Integer.parseInt(total_price));
			preparedStatement.setInt(3, Integer.parseInt(total_count));
			preparedStatement.setString(4, user_master_id);
			preparedStatement.setString(5, pay);

			count = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return count;
	}
}
