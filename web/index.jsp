<%-- 
    Document   : index
    Created on : 11 févr. 2015, 15:28:40
    Author     : INTI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Items in Master</h2>
        <table border="1">
            <tr>
                <th>Item Code</th>
            </tr>
            <tr>
                <s:iterator value="itemList" var="items">

                    <td><s:property value="idproduit"/></td>

                </s:iterator>
            </tr>
    </body>
</html>
