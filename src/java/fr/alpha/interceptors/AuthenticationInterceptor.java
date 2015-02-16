/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.interceptors;

import java.util.Map;
 
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import fr.alpha.model.Utilisateur;
import fr.alpha.model.Vendeur;
 
public class AuthenticationInterceptor implements Interceptor {
 
    private static final long serialVersionUID = -5011962009065225959L;
 
    @Override
    public void destroy() {
        //release resources here
    }
 
    @Override
    public void init() {
        // create resources here
    }
 
    @Override
    public String intercept(ActionInvocation actionInvocation)
            throws Exception {
        System.out.println("inside auth interceptor");
        Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
         
        Utilisateur user = (Utilisateur) sessionAttributes.get("USER");
         
        if(user == null){
            return Action.LOGIN;
        }else{
            Action action = (Action) actionInvocation.getAction();            
            if(action instanceof UserAware){
                ((UserAware) action).setUser(user);
            }
            return actionInvocation.invoke();
        }
    }
 
}