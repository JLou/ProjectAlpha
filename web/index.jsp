
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<z:layout pageTitle="IndexJsp" message="${message}">

    
    <table border="1">
    
        <tr>
        <s:if test="%{#session.isLogged}">
            <a href="demandeRep">DEMANDE REPARATION</a>
        </s:if>
    </tr>
</z:layout>

