<%-- 
    Document   : garantie2
    Created on : 16 févr. 2015, 17:16:58
    Author     : INTI
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<z:layout pageTitle="IndexJsp" message="${message}">

    <s:form action="garantie3" method="post">
        <s:select label="Chose a Model"
                  headerKey="-1" headerValue="--- Select ---"
                  list="garanties"
                  listValue="dureeFormatee" listKey="idgarantie"
                  name="yourGarantieId"/>
        <s:hidden value="%{yourModelgarantie}" name="yourModelgarantie"/>
        
        <s:submit value="Valider" align="center"/>
    </s:form>

</z:layout>
