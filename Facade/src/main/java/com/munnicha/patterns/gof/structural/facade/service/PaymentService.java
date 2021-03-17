package com.munnicha.patterns.gof.structural.facade.service;

/**
 *
 * @author munnicha
 */
public class PaymentService {
    
    public static boolean makePayment(double cost){
        if(cost>minPrice()){
            return true; 
        }else{
            return false;
        }
    }
    
    public static double minPrice(){
        return 100.0;
    }
}
