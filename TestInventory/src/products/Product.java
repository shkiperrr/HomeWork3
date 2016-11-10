package products;

public class Product {

    private String name;
    private Integer coast;

    public Product(String name, Integer coast) {
        this.name = name;
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCoast() {
        return coast;
    }

    public void setCoast(Integer coast) {
        this.coast = coast;
    }
}
