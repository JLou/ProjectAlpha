<%-- 
    Document   : nouvelUtil
    Created on : 11 févr. 2015, 17:17:02
    Author     : INTI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <s:form action="add" method="post">
<s:textfield name="nom" label="Nom"/>
<s:textfield name="prenom" label="Prenom"/>
<s:textfield name="mail" label="Mail"/>
<s:textfield name="adresse" label="Adresse"/>
 
<s:submit value="Ajouter" align="center"/>
</s:form>
    </body>
</html>