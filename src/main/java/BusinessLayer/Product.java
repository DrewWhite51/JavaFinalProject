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
public class Product {
    private int prodcutID;
    private String descrpition;
    private int quantityOnHand;
    private double price;

    public Product(int prodcutID, String descrpition, int quantityOnHand, double price) {
        this.prodcutID = prodcutID;
        this.descrpition = descrpition;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    public int getProdcutID() {
        return prodcutID;
    }

    public void setProdcutID(int prodcutID) {
        this.prodcutID = prodcutID;
    }

    public String getDescrpition() {
        return descrpition;
    }

    public void setDescrpition(String descrpition) {
        this.descrpition = descrpition;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "prodcutID=" + prodcutID + ", descrpition=" + descrpition + ", quantityOnHand=" + quantityOnHand + ", price=" + price + '}';
    }
    
}
