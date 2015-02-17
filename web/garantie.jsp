<%-- 
    Document   : garantie
    Created on : 16 févr. 2015, 15:00:22
    Author     : INTI
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<z:layout pageTitle="IndexJsp" message="${message}">
    
        <s:form action="garantie2" method="post">
            <div class="form-group">
                <s:select label="Chose a Model"
                          cssClass="form-control"
                          headerKey="-1" headerValue="--- Select ---"
                          list="models"
                          listValue="nom" listKey="idmodele"
                          name="yourModelgarantie"/>    
            </div>
            <button type="submit" class="btn btn-default">Valider</button>
        </s:form>
   
</z:layout>
