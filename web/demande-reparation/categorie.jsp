<%-- 
    Document   : categorie
    Created on : 12 févr. 2015, 10:15:38
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
        <h1>Hello World!</h1>
        
        <s:form action="demandeRep2" method="post">
            <s:select label="Chose a category" 
		headerKey="-1" headerValue="--- Select ---"
                list="categories"
                listValue="nom"
                name="yourCategory"/>      
            <s:submit value="Valider" align="center"/>
        </s:form>
    </body>
</html>
