
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
public class WarehouseProduct {
    private String name;
    private int price;
    private int stock;
    
    public WarehouseProduct(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public void take() {
        this.stock--;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WarehouseProduct other = (WarehouseProduct) obj;
   
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    

}
