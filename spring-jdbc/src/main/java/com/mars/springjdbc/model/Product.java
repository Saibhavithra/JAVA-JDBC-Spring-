package com.mars.springjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
	
	
	private int ProdId;
	private String ProdName;
	private String ProdDesc;
	private String ProdCategory;
	private int Price;
	private String Quantity;
	

	/*public Product() {
		
	}
//	public Product(int prodId,  String prodName, String prodDesc,String prodCategory, int price,String quantity ) {
		//super();
		ProdId = prodId;
		ProdName = prodName;
		ProdDesc = prodDesc;
		ProdCategory = prodCategory;	
		Price = price;
		Quantity = quantity;
		
	}*/
	
	/*public int getProdId() {
		return ProdId;
	}
	public void setProdId(int prodId) {
		ProdId = prodId;
	}
	public String getProdCategory() {
		return ProdCategory;
	}
	public void setProdCategory(String prodCategory) {
		ProdCategory = prodCategory;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public String getProdDesc() {
		return ProdDesc;
	}
	public void setProdDesc(String prodDesc) {
		ProdDesc = prodDesc;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [ProdId=" + ProdId + ", ProdName=" + ProdName + ", ProdDesc=" + ProdDesc + ", ProdCategory="
				+ ProdCategory + ", Price=" + Price + ", Quantity=" + Quantity + "]";
	}*/

}
