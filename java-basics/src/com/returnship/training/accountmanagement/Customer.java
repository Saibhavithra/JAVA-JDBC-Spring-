package com.returnship.training.accountmanagement;


	//Account class will have association with Customer class.

	//Customer class will have custId, custName and custEmail fields.
	public class Customer {

		private int custId;
		private String custName;
		private String custEmail;
		
		public Customer(int custId, String custName, String custEmail) {
			this.custId =custId;
			this.custName = custName;
			this.custEmail = custEmail;
			
		}
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getCustEmail() {
			return custEmail;
		}
		public void setCustEmail(String custEmail) {
			this.custEmail = custEmail;
		}
		
		
	}

