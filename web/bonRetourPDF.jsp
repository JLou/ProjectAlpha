
<%@page import="fr.alpha.model.Utilisateur"%>
<%@page import="com.itextpdf.text.Chunk"%>
<%@page import="com.itextpdf.text.Document"%>
<%@page import="com.itextpdf.text.Paragraph"%>
<%@page import="com.itextpdf.text.pdf.PdfWriter"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
   response.setContentType("application/pdf");
   Document document = new Document();
   PdfWriter.getInstance(document, response.getOutputStream());
   document.open();
    
    document.addTitle("Bon de retour");
    document.add(new Paragraph("Adresse de livraison"));
    Paragraph paragraph = new Paragraph();  
        Chunk chunk = new Chunk(
              "Nom, Prenom : " + ((Utilisateur) session.getAttribute("USER")).getNom()+ ", " + ((Utilisateur) session.getAttribute("USER")).getPrenom());
        paragraph.add(chunk);  
   document.add(paragraph);
   
    Paragraph paragraph2 = new Paragraph();  
        Chunk chunk2 = new Chunk(
              "Adresse : " + ((Utilisateur) session.getAttribute("USER")).getTownName());
        paragraph2.add(chunk2);  
   document.add(paragraph2);

   document.close();
%>