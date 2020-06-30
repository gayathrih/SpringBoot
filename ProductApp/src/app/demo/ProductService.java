package app.demo;

import java.util.List;

public interface ProductService {
	  
	  boolean addProduct(Product p);
	  
	  Product findProductById(int pid);
	  
	  List<Product> getAllProducts();

}
