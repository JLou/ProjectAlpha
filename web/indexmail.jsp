<%-- 
    Document   : index
    Created on : 22 janv. 2015, 12:08:53
    Author     : INTI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style type="text/css">
            textarea{
                resize: none;
                
            }
            
        </style>
        
    </head>
    <body>
        
        <s:form method="post" action="sendMail">
           
            <s:submit value="Envoyer"/>
        </s:form>
        
    </body>
</html>
