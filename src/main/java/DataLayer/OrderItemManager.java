/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author Drew
 */
public class OrderItemManager {
        private ArrayList<OrderItem> dataStore;
    
    public OrderItemManager() {
        dataStore = new ArrayList<OrderItem>();
    }
    
    public ArrayList<OrderItem> getAll() {
        return dataStore;
    }
    
    public void create(OrderItem orderItemToCreate) {
        this.dataStore.add(orderItemToCreate);
    }
}
