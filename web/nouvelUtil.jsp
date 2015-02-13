<%-- 
    Document   : nouvelUtil
    Created on : 11 févr. 2015, 17:17:02
    Author     : INTI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<z:layout pageTitle="Nouvel Utilisateur" message="${message}">
    <s:form action="add" method="post">
    <s:textfield  label="Nom" name="user.nom"/>
        <s:textfield  label="Prenom" name="user.prenom"/>
        <s:textfield label="Mail" name="user.mail"/>
        <s:select list="towns" listKey="key" listValue="value"  label="Adresse" name="user.adresse"/>
        <s:textfield  label="Mot de passe" name="user.mdp"/>
        <s:submit value="Ajouter" align="center"/>
    </s:form>
    </z:layout>
