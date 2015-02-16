<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <s:if test="#session.isLogged">
            <s:property value="#session.user_login"/>
            <s:property value="#session.user_mdp"/>
        </s:if>
        <s:else>
            <c:redirect url="index.jsp"/>
        </s:else>
        
       
        
        
        
    </body>
</html>
