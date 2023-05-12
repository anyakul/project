package task048_Automat.models.products;

public class Snack extends DrinkSnack {
    private double weight;

    public Snack(String name, Integer price, Double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s - %s, стоит %s, масса %s", id, name, price, weight);
    }

    public double getWeight() {
        return weight;
    }
}
