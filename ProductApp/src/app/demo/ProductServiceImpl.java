package app.demo;

import java.util.LinkedList;
import java.util.List;

public class ProductServiceImpl  implements ProductService{

	List<Product> prodList = new LinkedList<>();
	
	@Override
	public boolean addProduct(Product p) {
	     
		  prodList.add(p);
		  
		 boolean res =  !prodList.isEmpty();
		 
		return res;
	}

	@Override
	public Product findProductById(int pid) {
		 
		 Product  obj = prodList.get(pid-1);
		   
		return obj;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return prodList;
	}

}
