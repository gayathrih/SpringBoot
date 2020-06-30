package app.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProducTestCase {

	   ProductService prodservice;
	   Product p1,p2,p3;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	

	@BeforeEach
	void setUp() throws Exception {
		  prodservice  = new ProductServiceImpl();
		  p1 =  new Product(1, "Pen");
		   p2 =  new Product(2, "computer");
		   p3 =  new Product(3, "Keyboard");
		   
		   prodservice.addProduct(p1);
		   prodservice.addProduct(p2);
		   prodservice.addProduct(p3);
	}

	

	/*
	 * @Test void addProductTestCase() { boolean res=prodservice.addProduct(p1);
	 * 
	 * assertTrue(res);
	 * 
	 * boolean res2=prodservice.addProduct(p1);
	 * 
	 * assertTrue(res2); boolean res3=prodservice.addProduct(p1);
	 * 
	 * assertTrue(res3);
	 * 
	 * 
	 * }
	 */
	
	
	@Test
	 void getAllProdTestCase() {
		List<Product> list = prodservice.getAllProducts();
		
		  
		  assertTrue(!list.isEmpty(), list.toString());
		 
	}
	
	@Test
	void findById() {
		
		Product p =prodservice.findProductById(1);  //pen
		System.out.println(p.getName());
		assertEquals("computer", p.getName());
	}
	
	@AfterEach
	void tearDown() throws Exception {
		prodservice=null;
		p1=null;
		p2=null;
		p3=null;
		
	}
	
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

}
