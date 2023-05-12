package task048_Automat.models;

public abstract class AbstractProduct implements ComparableProduct {
    protected final Integer id;
    protected String name;
    protected Integer price;
    protected Double attractiveness;
    protected static int defaultIndex = 1;

    public AbstractProduct(String name, int price) {
        this.id = defaultIndex++;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s - %s, стоит %s", id, name, price);
    }

    @Override
    public int compareTo(ComparableProduct o) {
        return this.getAttractiveness().compareTo(o.getAttractiveness());
    }

    @Override
    public Double getAttractiveness() {
        return Double.valueOf(price);
    }

    public final Integer getId() {
        return id;
    }

    public final String getName() {
        return name;
    }

    public final Integer getPrice() {
        return price;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final void setPrice(Integer price) {
        this.price = price;
    }
}
