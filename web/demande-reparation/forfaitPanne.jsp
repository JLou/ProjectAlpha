<%-- 
    Document   : forfaitPanne
    Created on : 13 févr. 2015, 10:37:25
    Author     : INTI
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<z:layout pageTitle="Type de panne">
        
    <s:form action="recapitulatif" method="post">
            <s:select label="Type de panne"
		headerKey="-1" headerValue="--- Select ---"
                list="forfaits"
                listValue="typePanne" listKey="idforfait"
                name="yourForfait"/>
            <s:hidden value="%{yourModel}" name="yourModel"/>
            <s:submit value="Valider" align="center"/>
        </s:form>
</z:layout>