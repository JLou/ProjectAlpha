/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.interceptors;

import fr.alpha.model.Utilisateur;

/**
 *
 * @author INTI
 */
public interface UserAware {
    void setUser(Utilisateur user);
}
