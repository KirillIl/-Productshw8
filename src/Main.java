import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product potato = new Product("Картошка", 19, 0.8);
        Product tomato = new Product("Помидоры", 129, 1.5);
        Product cucumbers = new Product("Огурцы", 69, 1.1);
        Product oil = new Product("Масло подсолнечное", 109, 0.5);
        Product mayonnaise = new Product("Майонез", 159, 0.5);
        Product greenery = new Product("Зелень", 59, 0.1);
        Product rice = new Product("Рис", 89, 0.4);

        ProductService service = new ProductService();
        service.add(potato);
        service.add(tomato);
        service.add(cucumbers);
        service.add(oil);
        service.add(mayonnaise);
        service.add(greenery);
        service.add(rice);

        System.out.println(service);


        System.out.println("Список продуктов: " + service.getProducts());

        service.delete(mayonnaise);

        System.out.println("Список продуктов: " + service.getProducts());












    }
}