<%-- 
    Document   : login
    Created on : 13 févr. 2015, 11:10:40
    Author     : INTI
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<z:layout pageTitle="Login">
    <s:form method="post" action="ValidateUser">
        <span class="alert-block" value="message" >${message}</span>
        <s:textfield placeholder="Identifiant" type="text" name="utilisateur.mail" value="" />
        <s:textfield placeholder="Mot de Passe" type="password" name="utilisateur.mdp" value=""  />
        <s:textfield type="submit" class="btn" value="connection" /> 
    </s:form>
        
    <s:form method="post" action="ValidateVendeur">
        <span class="alert-block" value="message" >${message}</span>
        <s:textfield placeholder="Code Vendeur" type="number" name="vendeur.codeVendeur" value="" />
        <s:textfield placeholder="Mot de Passe" type="password" name="vendeur.MdpVendeur" value=""  />
        <s:textfield type="submit" class="btn" value="connection" /> 
    </s:form>
</z:layout>
