<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<z:layout pageTitle="Type de panne">

    <s:form action="recapitulatif" method="post">
        <div class="form-group">
            <label for="ville">Adresse de retour</label>
            <s:select list="towns"
                      cssClass="form-control"
                      listKey="key" 
                      listValue="value"  
                      label="Adresse de retour" 
                      name="ville"/>
        </div>
        <div class="form-group">
            <label for="description">Description de la panne</label>
            <s:textarea label="Description de la panne" name="description"
                        cssClass="form-control"
                        cols="40" rows="10"/>
        </div>
        <s:hidden value="%{yourModel}" name="yourModel"/>
        <s:hidden value="%{yourForfait}" name="yourForfait"/>
        <button type="submit" class="btn btn-default">Valider</button>

    </s:form>
</z:layout>