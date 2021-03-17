package com.munnicha.patterns.gof.structural.facade.test;

import com.munnicha.patterns.gof.structural.facade.model.Product;
import com.munnicha.patterns.gof.structural.facade.service.OrderServiceFacade;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author munnicha
 */
public class FacadeTest {
    
    @Test
    public void testFacade(){
        Product product1=new Product(1,"Book",5990.0);
        Product product2=new Product(-9999,"Microwave",5990.0);
        Product product3=new Product(43,"Bookmark",0.0);
        Product product4=new Product(110,"Coffee machine",299990.0);
        Product product5=new Product(144,"Ball",12990.0);
        OrderServiceFacade orderService= new OrderServiceFacade();
        
        boolean result1=orderService.placeOrder(product1, "SK");
        boolean result2=orderService.placeOrder(product2, "US");
        boolean result3=orderService.placeOrder(product3, "DE");
        boolean result4=orderService.placeOrder(product4, "US");
        boolean result5=orderService.placeOrder(product5, "HU");
        
        assertFalse(result1);
        assertFalse(result2);
        assertFalse(result3);
        assertTrue(result4);
        assertTrue(result5);
    }
    
}
