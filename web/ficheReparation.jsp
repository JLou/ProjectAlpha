<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<z:layout pageTitle="Récapitulatif Commandes" > 
    <h1 class="titreCommande">fiche reparation</h1>
    <hr>
 
    <div class="clearfix"></div>
    <div class="recap">
        <table class="recap-table">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Prix</th>
                </tr>
            </thead>
            <tr>
                <th>Port</th>
                <td><s:text name="produit.infosReparation.forfait.coutPort" />€</td>
            </tr>
            <tr>
                <th>Diagnostic</th>
                <td><s:text name="produit.infosReparation.forfait.coutDevis" />€</td>
            </tr>
            <tr>
                <th>Réparation</th>
                <td><s:text name="produit.infosReparation.forfait.coutReparation" />€</td>
            </tr>
            <tr class="recap-total">
                <th>Total:</th>
                <td><s:text name="produit.infosReparation.forfait.total" />€</td>
            </tr>
        </table>
        
        <div class="clearfix"></div>
        
    </div>
</z:layout>
 