/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

/**
 *
 * @author Drew
 */
public class Order {
    private int orderNumber;
    private int customerID;
    private int date;

    public Order(int orderNumber, int customerID, int date) {
        this.orderNumber = orderNumber;
        this.customerID = customerID;
        this.date = date;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" + "orderNumber = " + orderNumber + ", customerID = " + customerID + ", date = " + date + '}';
    }
    
    
}
