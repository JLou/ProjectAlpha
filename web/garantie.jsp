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
        <s:select label="Chose a Model"
                  headerKey="-1" headerValue="--- Select ---"
                  list="models"
                  listValue="nom" listKey="idmodele"
                  name="yourModelgarantie"/>      
        <s:submit value="Valider" align="center"/>
    </s:form>

</z:layout>
