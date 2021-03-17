package com.munnicha.patterns.gof.structural.facade.service;

import com.munnicha.patterns.gof.structural.facade.model.Product;

/**
 *
 * @author munnicha
 */
public class OrderServiceFacade {
    
    public boolean placeOrder(Product product, String shipTo){
        if(InventoryService.isAvailable(product.getId())){
            if(PaymentService.makePayment(product.getPrice())){
                if(ShippingService.shipProduct(shipTo, product.getAvailableCountries())){
                    System.out.println("Hurray, you have ordered the product ("+product.getName()+") successfully.");
                    return true;
                }else{
                    System.out.println("Error, we cannot ship to the product ("+product.getName()+") to your country: "+shipTo);
                    return false;
                }
            }else{
                System.out.println("Error, invalid price on the product ("+product.getName()+") the minimum price is: "+PaymentService.minPrice());
                return false; 
            }
        }else{
            System.out.println("Error, the product ("+product.getName()+") is not available at this moment.");
            return false;
        }
    }
    
}
