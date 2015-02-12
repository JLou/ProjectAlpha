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

<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="icon" type="image/png" href="http://fc01.deviantart.net/fs70/f/2011/104/8/e/custom_website_icon_by_jhewitt86-d3dyh5z.png" />

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
        <link href="bootstrap v2.3.2/bootstrap/css/bootstrap.css" rel="stylesheet">
        <style type="text/css">
            body {
                padding-top: 60px;
                padding-bottom: 40px;
            }
            .sidebar-nav {
                padding: 9px 0;
            }

            @media (max-width: 980px) {
                /* Enable use of floated navbar text */
                .navbar-text.pull-right {
                    float: none;
                    padding-left: 5px;
                    padding-right: 5px;
                }
            }
        </style>
        <link href="bootstrap v2.3.2/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
    </head>
    <body>



        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>

                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="brand" href="/ProjectAlpha/index.jsp">@lpha</a>
                    <a class="brand" href="/ProjectAlpha/nouvelUtil.jsp">Nouvel Utilisateur</a>

                    <form method="post" action="ValidateUser" class="navbar-form pull-right">
                                       
                        <span class="alert-block" value="message" >${message}</span>
                        <input placeholder="Identifiant" type="text" name="utilisateur.mail" value="" />
                        <input placeholder="Mot de Passe" type="password" name="utilisateur.mdp" value=""  />
                        <input type="submit" class="btn" value="connection" /> 
          
                    </form>


                    <div class="nav-collapse collapse">


                        <ul class="nav">

                            <li><a href="index.jsp">Accueil</a></li>

                            <li><a href="nouvelUtil.jsp">Nouvel Utilisateur</a></li>
                        </ul>
                    </div><!--/.nav-collapse -->

                </div>
            </div>
        </div>

        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span3" style="position:fixed ; right: 5px "/>

                <div class="well sidebar-nav">
                    <ul class="nav nav-list" >
                        <jsp:invoke fragment="sideBar"/>
                    </ul>
                </div><!--/.well -->

            </div><!--/span-->

            <jsp:doBody/>




            <hr>

            <footer>
                <p>&copy; @lpha 2015</p>
            </footer>

        </div>

    </body>
</html>


