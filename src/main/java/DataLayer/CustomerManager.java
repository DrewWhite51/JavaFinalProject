/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.Customer;
import java.util.ArrayList;

/**
 *
 * @author Drew
 */
public class CustomerManager {
    private ArrayList<Customer> dataStore;
    
    public CustomerManager() {
        this.dataStore = new ArrayList<Customer>();
    }
    
    public ArrayList<Customer> getAll() {
        return dataStore;
    }
    
    public void create(Customer customerToCreate) {
        this.dataStore.add(customerToCreate);
    }
}
