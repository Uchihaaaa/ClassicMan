package ecommerce.com.classicman.servcie;

import ecommerce.com.classicman.model.Product;
import ecommerce.com.classicman.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void createNewProduct(Product productForm) {
        productForm.setDeleteFlag(0);
        productForm.setCreatedAt(new Date());
        productForm.setUpdatedAt(new Date());
        productRepository.save(productForm);
    }
}
