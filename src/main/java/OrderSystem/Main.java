package OrderSystem;

import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import BusinessLayer.Product;
import DataLayer.CustomerManager;
import DataLayer.OrderItemManager;
import DataLayer.OrderManager;
import DataLayer.ProductManager;
import java.util.ArrayList;

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
        
        CustomerManager customerDM = new CustomerManager();
        OrderManager orderDM = new OrderManager();
        OrderItemManager orderItemDM = new OrderItemManager();
        ProductManager productDM = new ProductManager();
        // Creating customers
        Customer firstCustomer = new Customer("01", "Drew", "White", "888-888-8888");
        Customer secondCustomer = new Customer("02", "Dylan", "White", "777-777-7777");
        Customer thirdCustomer = new Customer("03", "Rachael", "White", "555-555-5555");
        //Creating orders
        Order firstOrder = new Order(101, 1, "12-4-2020");
        Order secondOrder = new Order(102, 2, "12-4-2020");
        Order thirdOrder = new Order(103, 3, "12-4-2020");
        // Creating order items
        OrderItem firstItem = new OrderItem(101, 1, 02, "A PS5", 1, 499.99);
        OrderItem secondItem = new OrderItem(101, 2, 03, "A pair of cleats", 1, 99.99);
        OrderItem thirdItem = new OrderItem(102, 3, 02, "A PS5", 1, 499.99);
        OrderItem fourthItem = new OrderItem(102, 4, 03, "A pair of cleats", 1, 99.99);
        OrderItem fifthItem = new OrderItem(103, 5, 01, "A bottle of shampoo", 1, 10.99);
        OrderItem sixthItem = new OrderItem(103, 6, 03, "A pair of cleats", 1, 99.99);
        // Creating products
        Product firstProduct = new Product(01, "A bottle of shampoo", 20, 10.99);
        Product secondProduct = new Product(02, "A PS5", 5, 499.99);
        Product thirdProduct = new Product(03, "A pair of cleats", 7, 99.99);

        
        customerDM.create(firstCustomer);
        customerDM.create(secondCustomer);
        customerDM.create(thirdCustomer);
        orderDM.create(firstOrder);
        orderDM.create(secondOrder);
        orderDM.create(thirdOrder);
        orderItemDM.create(firstItem);
        orderItemDM.create(secondItem);
        orderItemDM.create(thirdItem);
        orderItemDM.create(fourthItem);
        orderItemDM.create(fifthItem);
        orderItemDM.create(sixthItem);
        productDM.create(firstProduct);
        productDM.create(secondProduct);
        productDM.create(thirdProduct);
        
        System.out.println("Reading customers from databse.");
        ArrayList<Customer> customersFromDB = customerDM.getAll();
        for (Customer dbCustomer : customersFromDB) {
            System.out.println(dbCustomer);
        }
        System.out.println("Reading orders from databse.");
        ArrayList<Order> ordersFromDB = orderDM.getAll();
        for (Order dbOrder : ordersFromDB) {
            System.out.println(dbOrder);
        }
        System.out.println("Reading order items from databse.");
        ArrayList<OrderItem> orderItemsFromDB = orderItemDM.getAll();
        for (OrderItem dbOrderItems : orderItemsFromDB) {
            System.out.println(dbOrderItems);
        }
        System.out.println("Reading products from databse.");
        ArrayList<Product> productsFromDB = productDM.getAll();
        for (Product dbProduct : productsFromDB) {
            System.out.println(dbProduct);
        }
        
    }
}
