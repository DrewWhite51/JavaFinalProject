/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.Product;
import java.util.ArrayList;

/**
 *
 * @author Drew
 */
public class ProductManager {
    
    private ArrayList<Product> dataStore;
    
    public ProductManager() {
        dataStore = new ArrayList<Product>();
    }
    
    public ArrayList<Product> getAll() {
        return dataStore;
    }
    
    public void create(Product productToCreate) {
        this.dataStore.add(productToCreate);
    }
    
}
