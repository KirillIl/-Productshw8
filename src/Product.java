import java.util.Objects;

public class Product {
    String name;
    private int price;
    private double kg;

    private boolean checked;
    private boolean isBuy;


    public Product(String name, int price, double kg) {
        if (name== null || name.isEmpty() || name.isBlank() || price <= 0 || kg <= 0 )
        throw new IllegalArgumentException("Заполните карточку товара полностью");
        this.name = name;
        this.price = price;
        this.kg = kg;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getKg() {
        return kg;
    }

    public void buy() {
        isBuy = true;
    }

    public boolean isBuy() {
        return isBuy;
    }

    public void setChecked() {
        this.checked = true;
    }

    public boolean isChecked() {
        return checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return String.format("%s, Цена: %s, Количество: %s, Куплен: %s",
                this.name, this.price, this.kg, checkedString);
    }
}