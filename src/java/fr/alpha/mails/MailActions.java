/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.mails;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import fr.alpha.model.Utilisateur;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;


/**
 *
 * @author INTI
 */
public class MailActions extends ActionSupport implements ModelDriven<Mail> , SessionAware{
    private Map<String, Object> session;
    private Mail mailForm;


    @Override
    public Mail getModel() {
        mailForm = new Mail();
        return mailForm;
    }


    @Override
    public String execute() throws Exception {

        EnvoiMail em = new EnvoiMail();
        String mailTemp = mailForm.getMailTo();
        String[]recipients;
        

        Utilisateur user = (Utilisateur) session.get("USER");

        recipients = new String[]{mailTemp};

        String subject = "Informations Reparations";
        String message = "<html>\n" +
"    <head>\n" +
"        <title>TODO supply a title</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        Bonjour Mr/Mme " +user.getNom()+"\n" +
"        <div><a href=\"http://localhost:8080/ProjectAlpha/\">\nVoici un lien vers notre site</a></div>\n" +
"    </body>\n" +
"</html>\n" +
"";
        System.out.println("----------------");
        String from = "no-reply.alpha@orange.fr";
        
        try {
            System.out.println("mail à envoyé !!!");
            em.sendMail(user.getMail(), subject, message, from);
            System.out.println("mail envoyé !!!");

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());

            return INPUT;
        }
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map ;
    }

}
