package domain.products;

import java.util.List;

public interface ProductRepository {

    Product getOne(long id);

    List<Product> getAll();
}
