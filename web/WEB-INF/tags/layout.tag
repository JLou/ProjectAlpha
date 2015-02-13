<%-- 
    Document   : layout
    Created on : 12 févr. 2015, 09:47:04
    Author     : INTI
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ tag body-content="scriptless" %>
<%@ attribute name="pageTitle" required="true" type="java.lang.String" %>
<%@ attribute name="message" required="false" type="java.lang.String" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@attribute name = "sideBar" fragment="true" %>
<%@attribute name = "bodyContent" fragment="true" %>
<%@attribute name = "titleContent" fragment="true" %>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${pageTitle}</title>
        <link rel="icon" type="image/png" href="http://fc01.deviantart.net/fs70/f/2011/104/8/e/custom_website_icon_by_jhewitt86-d3dyh5z.png" />

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index">@lpha</a>

                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <p class="navbar-text navbar-right">Signed in as Mark Otto</p>
                    <ul class="nav navbar-nav">
                        <s:url action="add" var="addURL" />
                        <li>
                            <s:a href="%{addURL}" cssClass="brand">Nouvel Utilisateur</s:a>
                        </li>
                    </ul>

                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>


        <jsp:doBody/>




        <hr>

        <footer class="footer">
            <p class="text-muted container">&copy; @lpha 2015</p>
        </footer>

    </body>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

</html>


