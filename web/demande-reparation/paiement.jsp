<%-- 
    Document   : paiement
    Created on : 13 févr. 2015, 10:37:37
    Author     : INTI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<z:layout pageTitle="Type de panne">

    <s:form action="TypePanne" method="post">
        <div class="form-group">
            <label for="yourForfait">Chose a Model</label>
        <s:select label="Type de panne"
                  cssClass="form-control"
                  headerKey="-1" headerValue="--- Select ---"
                  list="forfaits"
                  listValue="typePanne" listKey="idforfait"
                  name="yourForfait"/>
        <s:hidden value="%{yourModel}" name="yourModel"/>
        </div>
        <button align="center" type="submit"
                class="btn btn-default">Valider</button>
    </s:form>
</z:layout>
