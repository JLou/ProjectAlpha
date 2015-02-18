
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<z:layout pageTitle="IndexJsp" message="${message}">
    <h1>Bienvenue chez Alpha Réparation - Garantie</h1>
    <div class="container-fluid">
        <div class="row row-index">
            <div class="col-sm-6 col-md-3 col-md-offset-1 employe-of-the-month">
                <h2>Vendeur du mois</h2>
                <img src="img/marc.jpg" width="250" class="img-thumbnail" alt="Marc Plouvin"/>
                <div class="caption">
                    <p><h3>Marc Plouvin</h3>
                    <blockquote>
                        <p>
                            Il faut que je vend beaucoup
                        </p>
                        <footer>Marc pendant le <cite title="Source Title">Black Friday</cite></footer>
                    </blockquote>
                    </p>
                </div>
            </div>
            <div class="col-sm-6 col-md-3 col-md-offset-1 employe-of-the-month">
                <h2>Commercial du mois</h2>
                <img src="img/max.jpg" width="250" class="img-thumbnail" alt="Maxime Traverst"/>
                <div class="caption">
                    <p><h3>Maxime Traverst</h3>
                    <blockquote>
                        <p>
                            On s'étend vers l'Ouest
                        </p>
                        <footer>Maxime à la <cite title="Source Title">Monument Valley</cite></footer>
                    </blockquote>
                    </p>
                </div>
            </div>
            <div class="col-sm-6 col-md-3 col-md-offset-1 employe-of-the-month">
                <h2>Manager du mois</h2>
                <img src="img/jlou.jpg" width="250" height="250" class="img-thumbnail" alt="Jean-Lou Piermé"/>
                <div class="caption">
                    <p><h3>Jean-Lou Piermé</h3>
                    <blockquote>
                        <p>
                            Le plus dur dans le job de manager, c'est le surplus de vacances
                        </p>
                        <footer>Jean-Lou à <cite title="Source Title">Hawaï</cite></footer>
                    </blockquote>
                    </p>
                </div>
            </div>
        </div>
    </div>
</z:layout>
