package application;

import domain.products.ProductRepository;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {

        ServiceLoader<ProductRepository> productRepositoryServiceLoader = ServiceLoader.load(ProductRepository.class);

        ProductRepository productRepository = productRepositoryServiceLoader
                .findFirst()
                .orElseThrow(() -> new RuntimeException("ProductRepository implementations not found"));

        System.out.printf("We have %d products", productRepository.getAll().size());
    }
}