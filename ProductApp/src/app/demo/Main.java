package app.demo;

public class Main {
	
	 public static void main(String[] args) {
		
		  Product p1 =  new Product(1, "Pen");
		  Product p2 =  new Product(2, "computer");
		  Product p3 =  new Product(3, "Keyboard");
		  
		  ProductService productService  = new ProductServiceImpl();
		  
		 System.out.println( productService.addProduct(p1));
		  productService.addProduct(p2);
		  productService.addProduct(p3);
		 
		  
		  System.out.println(productService.getAllProducts());
		  
		    System.out.println(productService.findProductById(2));
		  
		  
	}

}
