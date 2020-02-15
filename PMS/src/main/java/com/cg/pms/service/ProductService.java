package com.cg.pms.service;
import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;
import java.util.List;

public interface ProductService
{
  public boolean validateName(String productName);
  public int addProduct(Product product) throws ProductException;
  public Product findProductById(int productId) throws ProductException;
  public Product deleteProductById(int productId) throws ProductException;
  public List<Product> findAllProducts() throws ProductException;
}
