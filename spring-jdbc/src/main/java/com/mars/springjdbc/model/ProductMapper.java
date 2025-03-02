
package com.mars.springjdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;
 
public class ProductMapper implements RowMapper<Product> {
 
 
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product pro = new Product();
		pro.setProdId(rs.getInt("PROD_ID"));
		pro.setProdName(rs.getString("PROD_NAME"));
		pro.setProdDesc(rs.getString("PROD_DESC"));
		pro.setProdCategory(rs.getString("PROD_CATEGORY"));			
		pro.setPrice(rs.getInt("PRICE"));
		pro.setQuantity(rs.getString("STOCK"));		
		return pro;
	}
}