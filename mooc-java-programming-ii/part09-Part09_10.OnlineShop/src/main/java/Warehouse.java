/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {
    private Map<String, WarehouseProduct> products;
    private Map<String, Integer> unused;
    
    public Warehouse() {
        this.products = new HashMap<>();
    }
    
    public void addProduct(String name, int price, int stock) {
        this.products.put(name, new WarehouseProduct(name, price, stock));
    }
    
    public int price(String name) {
        if (this.products.containsKey(name)) {
            return this.products.get(name).getPrice();
        }
        return -99;
    }
    
    public int stock(String name) {
        if (this.products.containsKey(name)) {
            return this.products.get(name).getStock();
        }
        return 0;
    }
    
    public boolean take(String name) {
        if (this.products.containsKey(name) && this.products.get(name).getStock() > 0) {
            this.products.get(name).take();
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> uniqueProducts = new HashSet<>();
        for (String product : this.products.keySet()) {
            uniqueProducts.add(product);
        }
        return uniqueProducts;
    }
}
