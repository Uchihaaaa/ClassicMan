package ecommerce.com.classicman.servcie;

import ecommerce.com.classicman.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();

    void createNewProduct(Product productForm);
}
