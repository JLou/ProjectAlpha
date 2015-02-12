<%-- 
    Document   : categorie
    Created on : 12 févr. 2015, 10:15:38
    Author     : INTI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<z:layout pageTitle="Choix de la catégorie">
        
        <s:form action="demandeRep2" method="post">
            <s:select label="Chose a category" 
		headerKey="-1" headerValue="--- Select ---"
                list="categories"
                listValue="nom" listKey="idcategorie"
                name="yourCategory"/>      
            <s:submit value="Valider" align="center"/>
        </s:form>
</z:layout>