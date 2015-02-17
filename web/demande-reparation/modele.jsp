<%-- 
    Document   : categorie
    Created on : 12 févr. 2015, 10:15:38
    Author     : INTI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<z:layout pageTitle="Choix du modèle">

    <s:form action="TypePanne" method="post">
        <div class="form-group">
            <label for="yourForfait">Chose a Model</label>
            <s:select label="Chose a Model"
                      cssClass="form-control"
                      headerKey="-1" headerValue="--- Select ---"
                      list="models"
                      listValue="nom" listKey="idmodele"
                      name="yourModel"/>
        </div>
        <s:hidden value="%{yourCategory}" name="yourCategory"/>
        <button align="center" type="submit"
                class="btn btn-default">Valider</button>
    </s:form>
</z:layout>