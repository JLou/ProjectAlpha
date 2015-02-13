/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alpha.mails;

import com.opensymphony.xwork2.ActionInvocation;
import fr.alpha.model.Utilisateur;
import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author INTI
 */
public class EnvoiMail {

    /**
     *
     * @param recipients : destinataires
     * @param subject : sujet
     * @param message : message du mail
     * @param from : expediteur
     */
    public void sendMail(String recipients,
            String subject,
            String message,
            String from) throws MessagingException {
        System.out.println("methode send mail ********************************************** !!!");
        String smtpHost = "smtp.bbox.fr";
        Properties properties = new Properties();
        properties.put("mail.smtp.host", smtpHost);
        Session session = Session.getDefaultInstance(properties);
        Message msg = new MimeMessage(session);

        //les expediteurs
        InternetAddress adressForm = new InternetAddress(from);
        msg.setFrom(adressForm);

        //les destinataires
                //InternetAddress addressTo = new InternetAddress("max.traverst@orange.fr");
        InternetAddress addressTo = new InternetAddress(recipients);

        msg.setRecipient(Message.RecipientType.TO, addressTo);
        msg.setHeader("MailingApplication", "MailingApplication");

        msg.setSubject(subject);
        msg.setContent(message, "text/html");
        
        Transport.send(msg);

    }

}
