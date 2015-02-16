<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<z:layout pageTitle="Bon de retour" > 
    <h1 class="titreCommande">Bon de retour</h1>
    <hr>
    <div class="recap-header">
       
        <div class="recapContact" id="leftRecap">
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
   
</z:layout>
 