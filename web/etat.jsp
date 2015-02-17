<%-- 
    Document   : etat
    Created on : 13 févr. 2015, 17:11:12
    Author     : INTI
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<z:layout pageTitle="Choix du modèle">

    <s:if test="#session.isLogged ">
        <h2>Etat des reparations</h2>
        <table>
            <tr>

                <td> Mr/Mme   <s:text name="%{#session.USER.nom}" /></td>
            </tr>

            <s:iterator value="produits">
                <tr>
                    <td><s:property value="modele" /></td>
                   
                    <td><s:property value="infosReparations.etat" /></td>
                </tr> 
            </s:iterator>

        </table>
    </s:if>
</z:layout>

