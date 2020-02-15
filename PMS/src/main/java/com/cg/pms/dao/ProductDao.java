package com.cg.pms.dao;
import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;
import java.util.*;

public interface ProductDao 
{
  
	public int addProduct(Product product) throws ProductException;
	public Product findProductProductById(int productId) throws ProductException;
	public Product deleteEmployeeById(int productId) throws ProductException;
	public List<Product> findAllProducts() throws ProductException;
}
