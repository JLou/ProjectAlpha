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
    <s:form action="addUserVendeur" method="post">
        <div class="form-group">
            <label for="user_nom">Nom</label>
            <s:textfield id="user_nom" name="user.nom" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <label for="user_prenom">Prenom</label>
            <s:textfield id="user_prenom" name="user.prenom" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <label for="user_mail">Mail</label>
            <s:textfield id="user_mail" name="user.mail" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <label for="user_adresse">Adresse</label>
            <s:select id="user_adresse" list="towns" listKey="key" listValue="value"  
                      name="user.adresse" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <label for="user_mdp">Mot de passe</label>
            <s:textfield id="user_mdp" name="user.mdp" cssClass="form-control"/>
        </div>

        <button type="submit" class="btn btn-default">Valider</button>

    </s:form>
</z:layout>
