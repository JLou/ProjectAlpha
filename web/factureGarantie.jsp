<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<z:layout pageTitle="Récapitulatif Commandes" > 
    <h1 class="titreCommande">Récapitulatif de la commande</h1>
    <hr>
    <div class="recap-header">
        <div class="recapContact" id="leftRecap">
            <h2>Alpha Réparation</h2>
            <p>36 Avenue du Général de Gaulle
                <br>
                93170 Bagnolet<br>
            </p>
            <table>
                <tr>
                    <th>Site Web:</th>
                    <td>www.alpha.fr</td>
                </tr>
                <tr>
                    <th>Email:</th>
                    <td>contact@alpha.fr</td>
                </tr>
            </table>

        </div>
        <div class="recapContact" id="rightRecap">
            <h2>Adresse de livraison</h2>
            <table>
                <tr>
                    <th>Nom, Prenom:</th>
                    <td><s:text name="utilisateur.nom" />, <s:text name="utilisateur.prenom" /></td>
                </tr>
                <tr>
                    <th>Adresse:</th>
                    <td><s:text name="utilisateur.townName" /></td>
                </tr>
            </table>
        </div>
    </div>
    <div class="clearfix"></div>
    <div class="recap">
        <table class="recap-table">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Durée</th>
                </tr>
            </thead>
            <tr>
                <th>Durée de la garantie</th>
                <td><s:text name="garantie.duree" /> mois</td>
            </tr>
            
            
            <!--<tr>
                <th>Réparation</th>
                <td><s:text name="forfait.coutReparation" />€</td>
            </tr>
            -->
            <tr class="recap-total">
                <th>Total:</th>
                <td><s:text name="garantie.prix" />€</td>
            </tr>
        </table>
        <p class="recap-payement">
            <a href="payement"><button type="button" class="btn btn-success">Paiement 
                    <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
                </button></a>
        </p>
        <div class="clearfix"></div>
        
    </div>
</z:layout>
