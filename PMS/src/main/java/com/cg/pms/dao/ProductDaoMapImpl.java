package com.cg.pms.dao;
import java.util.Map;
import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ProductDaoMapImpl implements ProductDao
{
	private Map<Integer,Product> map;
	public ProductDaoMapImpl()
	{
		map=new HashMap<Integer,Product>();
	}
	@Override
	public int addProduct(Product product) throws ProductException
	{
		boolean flag=map.containsKey(product.getProductId());
		if(flag)
			throw new ProductException("ID already exists");
		else
		{
			map.put(product.getProductId(), product);
		}
		return product.getProductId();
	}
	
	@Override
	public Product findProductById(int productId) throws ProductException
	{
		boolean flag= map.containsKey(productId);
		Product product=null;
		if(flag)
		{
			product=map.get(productId);
		}
		else
			throw new ProductException(productId+" does not exist");
			
		return product;
	}
    @Override
	public Product deleteProductById(int productId) throws ProductException
	{
		boolean flag=map.containsKey(productId);
		Product product=null;
		if(flag)
		{
			product=map.get(productId);
		}
		else
			 throw new ProductException("id does not exist");
		
		product=map.remove(product);
		return product;
	}
    
    @Override
    public List<Product> findAllProducts() throws ProductException
    
}
