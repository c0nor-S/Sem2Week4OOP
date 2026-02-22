package ie.atu.sem2.week2.sem2week4.Service;

import ie.atu.sem2.week2.sem2week4.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();
    private long nextID = 1;

    public Product addProduct(Product product) {
        product.setId(nextID++);
        products.add(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
