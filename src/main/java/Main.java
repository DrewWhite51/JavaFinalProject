
import BusinessLayer.Customer;
import BusinessLayer.Product;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Drew
 */
public class Main {
    public static void main(String[] args) {
        
        Customer firstCustomer = new Customer("01", "Drew", "White", "888-888-8888");
        Customer secondCustomer = new Customer("02", "Dylan", "White", "777-777-7777");
        Customer thirdCustomer = new Customer("03", "Rachael", "White", "555-555-5555");
        
        Product firstProduct = new Product(01, "A bottle of shampoo", 20, 10.99);
        Product secondProduct = new Product(02, "A PS5", 5, 499.99);
        Product thirdProduct = new Product(03, "A pair of cleats", 7, 99.99);
        
        System.out.println(firstCustomer);
        System.out.println(secondCustomer);
        System.out.println(thirdCustomer);
        System.out.println(firstProduct);
        System.out.println(secondProduct);
        System.out.println(thirdProduct);
    }
}
