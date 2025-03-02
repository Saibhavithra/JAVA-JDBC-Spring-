
package com.mars.springjdbc.tester;

import com.mars.springjdbc.config.AppConfig;
import com.mars.springjdbc.dao.ProductDAO;
import com.mars.springjdbc.model.Product;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class SpringjdbcTest {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductDAO proDao = cont.getBean((ProductDAO.class));
	
		
		
		
		//INSERT
		/*Product pro = new Product(13, "Redux", "LEARN redux", "CSC" ,10000,"17"  );
		proDao.createProduct(pro);
		System.out.println("Product Added Sucessfully");*/
		
	
		
		//UPDATE
		
		/*Product pro = new Product();
		pro.setProdId(8);
		pro.setProdName("MAINFRAME");
		pro.setProdDesc("LEARN MAINFRAME");
		pro.setProdCategory("CSC");			
		pro.setPrice(4000);
		pro.setQuantity("15");	
		proDao.updateProduct(pro);
		System.out.println("Updated");*/
		
		//DELETE
		

		/*int record = proDao.deleteProduct(2);
		System.out.println("Deleted " + record );*/
		
		//SELECT ALL RECORDS
		
		List<Product> product = proDao.getAllProducts();
		for(Product p : product)
		{
			System.out.println(p);
		}
		
		((AnnotationConfigApplicationContext) cont).close();
	}
		
	
}
	
