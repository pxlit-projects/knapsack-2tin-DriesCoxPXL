package be.pxl.ja.citytrip;

public class Attraction implements Comparable<Attraction>{

    private String name;
    private double days;
    private int rating;

    public Attraction(){}

    public Attraction(String name, double days, int ratng){

    }

    public double getWeight(){
        return days;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", rating=" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Attraction attraction) {
        return Double.compare(attraction.getWeight(), this.getWeight());
    }
}
