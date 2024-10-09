package atu.ie.week3_recap;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public boolean editProduct(long id, Product updatedProduct) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(long id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                return true;
            }
        }
        return false;
    }
}