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
    <div>
        <table class="recap-table">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Prix</th>
                </tr>
            </thead>
            <tr>
                <th>Port</th>
                <td><s:text name="forfait.coutPort" />€</td>
            </tr>
            <tr>
                <th>Diagnostic</th>
                <td><s:text name="forfait.coutDevis" />€</td>
            </tr>
            <tr>
                <th>Réparation</th>
                <td><s:text name="forfait.coutReparation" />€</td>
            </tr>
            <tr class="recap-total">
                <th>Total:</th>
                <td><s:text name="forfait.total" />€</td>
            </tr>
        </table>
        <a href="payement"><button type="button" class="btn btn-success">Payement</button></a>
    </div>
</z:layout>
