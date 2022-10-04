package be.pxl.ja.robbery;

public class Product implements Comparable<Product>{
    private double weight;
    private double price;
    private String name;


    public Product(String name, double weight, double price) {
        setName(name);
        setPrice(price);
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Product product) {
        return Double.compare(product.getWeight(), this.getWeight());
    }
}
