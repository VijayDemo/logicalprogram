package com.nt.collections;

import java.util.List;

public class Product {
	
		private String pname;
		private String discription;
		private List<String> tags;
		
		
		@Override
		public String toString() {
			return "Product [pname=" + pname + ", discription=" + discription + ", tags=" + tags + ", prod=" + prod
					+ "]";
		}


		public String getPname() {
			return pname;
		}


		public void setPname(String pname) {
			this.pname = pname;
		}


		public String getDiscription() {
			return discription;
		}


		public void setDiscription(String discription) {
			this.discription = discription;
		}


		public List<String> getTags() {
			return tags;
		}


		public void setTags(List<String> tags) {
			this.tags = tags;
		}


		public Product getProd() {
			return prod;
		}


		public void setProd(Product prod) {
			this.prod = prod;
		}


		public Product addTagsofotherProducts(Product product) {
			this.tags.addAll(product.getTags());
			return product;
			
		}
		
		Product prod= new Product();
	

	public static void main(String[] args) {
		
	}

}
