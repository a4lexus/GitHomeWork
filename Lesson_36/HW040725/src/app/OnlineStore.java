package app;

public class OnlineStore implements Comparable<OnlineStore> {
    private String item;
    private int price;
    private double rating;
    private int quantityInStock;

    public OnlineStore(String item, int price, double rating, int quantityInStock) {
        this.item = item;
        this.price = price;
        this.rating = rating;
        this.quantityInStock = quantityInStock;
    }

    public String getItem() {
        return item;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    @Override
    public String toString() {
        return "OnlineStore{" +
                "name='" + item + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", quantityInStock=" + quantityInStock +
                '}';
    }

    @Override
    public int compareTo(OnlineStore o) {
        return item.compareTo(o.item);
    }
}
