
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="icon" type="image/png" href="http://fc01.deviantart.net/fs70/f/2011/104/8/e/custom_website_icon_by_jhewitt86-d3dyh5z.png" />
    </head>
    <body>
        
        <s:form action="ValidateUser" >
        
           <s:textfield key="Login" name="utilisateur.identifiant"/>
            
           <s:password key="mdp"name="utilisateur.mdp" />
            <s:submit value="Connection" />
            <s:property value="message"/>
          
        </s:form>
        
        <s:form action="/nouvelUtil.jsp" >        
          <s:submit value="nouvel utilisateur" />          
        </s:form>

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
