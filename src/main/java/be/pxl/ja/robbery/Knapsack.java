package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {

    private double maxWeight;
    List<Product> items = new ArrayList<Product>();

    public Knapsack(double maxWeight){
        this.maxWeight = maxWeight;
    }

    public double getCurrentWeight(){
        double som = 0;
        for (Product product : items)
        {
            som = som + product.getWeight();
        }

        return som;
    }

    public void add(Product product) throws KnapsackFullException {
        if (getCurrentWeight() + product.getWeight() > maxWeight){
            throw new KnapsackFullException("Dit item is te vol voor aan de zak toe te voegen.");
        }else{
            items.add(product);
        }
    }

    public List<Product> getItems() {
        return items;
    }
}
