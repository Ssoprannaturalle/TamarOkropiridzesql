public class Product {
    Long id;
    double price;

    String name;
    String size;
    Long term;

    public Product() {
    }

    public Product(Long id, double price, String name,  String size , Long term) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.size = size;
        this.term = term;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Long getTerm() {
        return term;
    }

    public void setTerm(Long term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", term=" + term +
                '}';
    }

}
