<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<z:layout pageTitle="Type de panne">

    <s:form action="recapitulatif" method="post">
        
        <s:select list="towns" 
                  listKey="key" 
                  listValue="value"  
                  label="Adresse de retour" 
                  name="ville"/>
        <s:textarea label="Description de la panne" name="description" 
                    cols="40" rows="10"/>
        <s:hidden value="%{yourModel}" name="yourModel"/>
        <s:hidden value="%{yourForfait}" name="yourForfait"/>
        <s:submit value="Valider" align="center"/>

    </s:form>
</z:layout>