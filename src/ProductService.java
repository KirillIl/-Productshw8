import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductService {
    private final Set<Product> products = new HashSet<>();

    public boolean add(Product product) {
        if (!products.add(product)) {
            throw new IllegalArgumentException("Этот продукт уже есть в списке");
        }
        product.buy();

        return true;
    }


    public Set<Product> getProducts() {
        return products;
    }

    public void delete(Product d) {
        products.remove(d);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:").append('\n');
        for (Product product : this.products) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }
}