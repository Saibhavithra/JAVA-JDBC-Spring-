
package com.mars.springjdbc.dao;

import java.util.List;
 
import javax.sql.DataSource;
 
import com.mars.springjdbc.model.Product;
import com.mars.springjdbc.model.ProductMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
 
@Component   //regonized as bean
public class ProductDAOImpl implements ProductDAO{
	JdbcTemplate jdbcTemp;
	
	private final String SQL_CREATE_PRODUCT ="insert into PROD_TABLE values(?,?,?,?,?,?)";
	
	private final String SQL_UPDATE_PRODUCT = "update PROD_TABLE set PROD_NAME =? ,PROD_DESC =?,PROD_CATEGORY =?,PRICE=?,STOCK=? where PROD_ID = ?";
	private final String SQL_DELETE_PRODUCT = "delete from PROD_TABLE where PROD_ID =?";
	private final String SQL_SELECT_ALL_PRODUCT ="select * from PROD_TABLE";
	@Autowired
	public ProductDAOImpl( DataSource ds) {
		jdbcTemp = new JdbcTemplate(ds);
	}
	public Product getProductById(String PRODUCT_ID) {
		// TODO Auto-generated method stub
		return null;
	}
 
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return jdbcTemp.query(SQL_SELECT_ALL_PRODUCT,new ProductMapper());
		//return null;
	}
 
	//public boolean deleteProduct(Product pro) {
	public int deleteProduct(int PROD_ID) {
		// TODO Auto-generated method stub
		return jdbcTemp.update(SQL_DELETE_PRODUCT,PROD_ID);
		//return false;
	}

 
	public boolean updateProduct(Product pro) {
		// TODO Auto-generated method stub
		return jdbcTemp.update(SQL_UPDATE_PRODUCT,pro.getProdName(),pro.getProdDesc(),pro.getProdCategory(),pro.getPrice(),pro.getQuantity(),pro.getProdId())>0;
		//return false;
	}
 
	public boolean createProduct(Product pro) {
		// TODO Auto-generated method stub
		return jdbcTemp.update(SQL_CREATE_PRODUCT,pro.getProdId(),pro.getProdName(),pro.getProdDesc(),pro.getProdCategory(),pro.getPrice(),pro.getQuantity())>0;
		//return jdbcTemp.update(SQL_CREATE_PRODUCT,pro.getProdId(),pro.getProdName(),pro.getProdDesc(),pro.getProdCategory(),pro.getPrice(),pro.getQuantity())>0;
	}
	@Override
	public Product getProductById(int PROD_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	
 
}