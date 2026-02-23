package ie.atu.sem2.week2.sem2week4.Controller;

import ie.atu.sem2.week2.sem2week4.Model.Product;
import ie.atu.sem2.week2.sem2week4.Service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) {
        Product saved = productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/allProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
