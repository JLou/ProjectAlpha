<%-- 
    Document   : docs
    Created on : 16 févr. 2015, 15:41:35
    Author     : INTI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<z:layout pageTitle="IndexJsp" message="${message}">

 
   <menu>
    <lh><em>Documents à telecharger :</em></lh>
    <li><a href="bonEnvoi.jsp">Bon d'envoi du colis</a> (à coller sur le carton pour l'envoi du colis) <a href="bonEnvoiPDF.jsp">Bon d'envoi PDF</a></li>
    <li><a href="bonRetour.jsp">Bon de retour du colis</a> (à placer dans le colis) <a href="bonRetourPDF.jsp">Bon de retour PDF</a></li>
    <li><a href="ficheReparation.jsp">Fiche réparation</a> (à placer dans le colis) <a href="ficheReparationPDF.jsp">Fiche réparation PDF</a></li>
</menu>
 
</z:layout>
