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
        <link rel="icon" type="image/png" href="img/logo2.png" />

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
                    <a class="navbar-brand" href="index.jsp">
                        <img src="img/logo2.png" alt="Alpha Réparation" 
                             width="50" />
                    </a>
                </div>


                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <s:if test="#session.isLogged">
                        <p class="navbar-text navbar-right">Signed in as <s:text name="%{#session.USER.prenom}"/> <s:text name="%{#session.USER.nom}"/></p>
                    </s:if>


                    <!-- Gestion dans le cas d'un utilisateur connecté -->
                    <s:if test="#session.isLogged">
                        <ul class="nav navbar-nav">

                            <s:url action="logout" var="addURLlogout" />
                            <li>
                                <s:a href="%{addURLlogout}" cssClass="brand">Log out</s:a>
                                </li>

                            <s:url action="demandeRep" var="addURLRep" />
                            <li>
                                <s:a href="%{addURLRep}" cssClass="brand">Réparation</s:a>
                                </li>

                            <s:url action="garantie1" var="addURLGarantie" />
                            <li>
                                <s:a href="%{addURLGarantie}" cssClass="brand">Extension de garantie</s:a>
                                </li>

                            <s:url action="etat" var="addURLSuiviRep" />
                            <li>
                                <s:a href="%{addURLSuiviRep}" cssClass="brand">Suivi de réparation</s:a>
                                </li>
                        </s:if>    

                        <!-- Gestion dans le cas d'un utilisateur non connecté -->

                        <ul class="nav navbar-nav">
                            <s:else>
                                <s:url action="login" var="addURLlogin" />
                                <li>
                                    <s:a href="%{addURLlogin}" cssClass="brand">Log in</s:a>
                                    </li>

                                <s:url action="login" var="addURLRep" />
                                <li>
                                    <s:a href="%{addURLRep}" cssClass="brand">Réparation</s:a>
                                    </li>

                                <s:url action="login" var="addURLGarantie" />
                                <li>
                                    <s:a href="%{addURLGarantie}" cssClass="brand">Extension de garantie</s:a>
                                    </li>
                                <s:url action="login" var="addURLSuiviRep" />
                                <li>
                                    <s:a href="%{addURLSuiviRep}" cssClass="brand">Suivi de réparation</s:a>
                                    </li>
                            </s:else>    

                            <s:url action="add" var="addURL" />
                            <li>
                                <s:a href="%{addURL}" cssClass="brand">Nouvel Utilisateur</s:a>
                                </li>


                            </ul>

                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>


            <div class="col-md-10 col-md-offset-1">
            <jsp:doBody/>
        </div>



        <div class="clearfix"></div>

        <footer class="footer">
            <p class="text-muted container">&copy; Alpha Réparation - Garantie 2015</p>
            <img height="250" src="img/aze.png" />
        </footer>

    </body>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

</html>
