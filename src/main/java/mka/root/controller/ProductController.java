package mka.root.controller;
import mka.root.model.Product;
import mka.root.repository.ProductRepository;
import mka.root.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    // PRODUCT  MODEL CRUD OPERATIONS

    // GET : read all products
    // EXAMPLE : GET localhost:8080//mka/v1/products
    @GetMapping("/mka/v1/products")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    // GET : read a single product
    // EXAMPLE : GET localhost:8080//mka/v1/product/1
    @GetMapping("/mka/v1/product/{id}")
    public Product getProduct(@PathVariable(value = "id") Integer product_id) throws ProductNotFoundException {
        return productRepository.findById(product_id)
                .orElseThrow(() -> new ProductNotFoundException(product_id));
    }

    // POST :  Create a new owner
    // EXAMPLE : POST localhost:8080//mka/v1/owners/ + json data
    @PostMapping(value = "/mka/v1/products",consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Product createProduct(@Valid @RequestBody Product product) {
        return productRepository.save(product);
    }

    // PUT : Update an product details
    // EXAMPLE : PUT localhost:8080//mka/v1/product/1
    @PutMapping(value="/mka/v1/product/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Product updateProduct(@PathVariable(value = "id") Integer product_id,
                                  @Valid @RequestBody Product productDetails) throws ProductNotFoundException {

        Product product = productRepository.findById(product_id)
                .orElseThrow(() -> new ProductNotFoundException(product_id));

        product.setProduct_title(productDetails.getProduct_title());
        product.setProduct_description(productDetails.getProduct_description());
        product.setProduct_link(productDetails.getProduct_link());
        product.setProduct_geolocation(productDetails.getProduct_geolocation());

        return productRepository.save(product);
    }

    // DELETE : delete an product
    // EXAMPLE : DELETE localhost:8080//mka/v1/product/1
    @DeleteMapping("/mka/v1/product/{id}")
    public Map<String, Boolean> deleteProduct(@PathVariable(value = "id") Integer product_id) throws ProductNotFoundException {
        Product product = productRepository.findById(product_id)
                .orElseThrow(() -> new ProductNotFoundException(product_id));

        productRepository.delete(product);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Product has been deleted", Boolean.TRUE);
        return response;
    }
}
