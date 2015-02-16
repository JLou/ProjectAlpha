/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author INTI
 */
public class Locations {
    
    public static final Map<Integer, String> towns = new HashMap<>();
    static {
        towns.put(1, "Lille");
        towns.put(2, "Paris");
        towns.put(3, "Marseille");
        towns.put(4, "Lens");
        towns.put(5, "Caen");
        
    }
    
}
