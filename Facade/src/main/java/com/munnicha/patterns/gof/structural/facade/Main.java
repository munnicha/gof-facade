package com.munnicha.patterns.gof.structural.facade;

import com.munnicha.patterns.gof.structural.facade.model.Product;
import com.munnicha.patterns.gof.structural.facade.service.OrderServiceFacade;

/**
 *
 * @author munnicha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Product product1=new Product(1,"Book",5990.0);
        Product product2=new Product(-9999,"Microwave",5990.0);
        Product product3=new Product(43,"Bookmark",0.0);
        Product product4=new Product(110,"Coffee machine",299990.0);
        Product product5=new Product(144,"Ball",12990.0);
        OrderServiceFacade orderService= new OrderServiceFacade(); //can be singleton
        
        orderService.placeOrder(product1, "SK");
        orderService.placeOrder(product2, "US");
        orderService.placeOrder(product3, "DE");
        orderService.placeOrder(product4, "US");
        orderService.placeOrder(product5, "HU");
    }
    
}
