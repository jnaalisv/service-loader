package persistence.inmemory;

import domain.products.Product;
import domain.products.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductRepository implements ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public InMemoryProductRepository() {
        products.add(new Product(1L, "Crystals"));
        products.add(new Product(2L, "Gems"));
        products.add(new Product(3L, "Platinum"));
        products.add(new Product(4L, "Gold"));
        products.add(new Product(5L, "Silver"));
    }

    @Override
    public Product getOne(long id) {
        return products
                .stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
