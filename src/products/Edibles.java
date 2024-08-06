package products;

public class Edibles extends Product {
    private double kilos;

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public void plusKilos(double kilos) {
        this.kilos = this.kilos + kilos;
    }

    public String getName() {
        return productName;
    }

    public void setName(String name) {
        productName = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }
}