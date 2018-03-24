module persistence {
    requires domain;
    provides domain.products.ProductRepository with persistence.inmemory.InMemoryProductRepository;
}