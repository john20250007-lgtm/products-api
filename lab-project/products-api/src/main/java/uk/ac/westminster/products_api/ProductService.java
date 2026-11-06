package uk.ac.westminster.products_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 3L;

    // Seed data: one of each subclass (no "new Product(...)" - Product is abstract)
    public ProductService() {
        products.add(new DigitalProduct(1L, "E-book", 9.99, "/dl/1", 4.2));
        products.add(new PhysicalProduct(2L, "Mug", 8.50, 0.35, "10x10x12 cm"));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public Product addProduct(Product product) {
        product.setId(nextId++); // use the value, then add one
        products.add(product);
        return product;
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

    // One line in the loop, no instanceof, no casts: polymorphism does the work.
    public List<String> getAllSummaries() {
        List<String> summaries = new ArrayList<>();
        for (Product p : products) {
            summaries.add(p.getSummary());
        }
        return summaries;
    }
}