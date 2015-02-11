/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.bdd;

import fr.alpha.bo.Utilisateur;
import java.util.ArrayList;

public class DataUtilisateur extends ArrayList<Utilisateur>{

    public DataUtilisateur() {
        add(new Utilisateur("azerty", "789"));
        add(new Utilisateur("qsdfgh", "123"));
        add(new Utilisateur("wxcvbn", "456"));
    }
    
}
