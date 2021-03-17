package com.munnicha.patterns.gof.structural.facade.service;

/**
 *
 * @author munnicha
 */
public class ShippingService {
    
    public static boolean shipProduct(String shipToCountry, String[] availableCountries){
        for (String availableCountrie : availableCountries) {
            if (shipToCountry.equalsIgnoreCase(availableCountrie)) {
                return true;
            }
        }
        return false;
    }
    
}
