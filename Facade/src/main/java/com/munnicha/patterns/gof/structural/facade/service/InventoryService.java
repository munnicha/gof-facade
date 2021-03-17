package com.munnicha.patterns.gof.structural.facade.service;

/**
 *
 * @author munnicha
 */
public class InventoryService {
    
    public static boolean isAvailable(int id){
        if(id>0){
            return true;
        }else{
            return false;
        }
    }
}
