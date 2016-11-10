package inventory;

import products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyInventory {

    private List<Product> products = new ArrayList<>();

    public Integer getTotalAmount() {
        return products.size();
    }

    public void printInfo() {
        Map<String, List<Product>> productsMap = getProducts()
                .stream()
                .collect(Collectors.groupingBy(Product::getName,Collectors.toList()));

        for (Map.Entry<String, List<Product>> entry : productsMap.entrySet()) {
            System.out.println(" x" + entry.getValue().size() + " - " + entry.getKey());
        }

        System.out.println("Total amount : " + getTotalAmount());
        System.out.println("Total coast : " + getTotalCoast()+"$");
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Integer getTotalCoast() {
        return getProducts().stream().map(Product::getCoast).reduce((sum, next) -> sum + next).get();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
