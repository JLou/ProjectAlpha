
<%@page import="com.itextpdf.text.Document"%>
<%@page import="com.itextpdf.text.Paragraph"%>
<%@page import="com.itextpdf.text.pdf.PdfWriter"%>
<%
   response.setContentType("application/pdf");
   Document document = new Document();
   PdfWriter.getInstance(document, response.getOutputStream());
   document.open();
   document.addTitle("Bon d'envoi");
   document.add(new Paragraph(""+
"                   Alpha Réparation \n " +
"\n"+           
"           36 Avenue du Général de Gaulle \n" +              
"                   93170 Bagnolet\n" +
"                Site Web: www.alpha.fr\n" +


"        "));

   document.close();
%>