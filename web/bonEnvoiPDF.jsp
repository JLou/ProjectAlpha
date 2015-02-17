<%@page import="java.net.URL"%>

import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
<%@page import="com.itextpdf.text.Image"%>

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
    String imageUrl = "http://www.online-image-editor.com//styles/2014/images/example_image.png";
 document.add(Image.getInstance(new URL(imageUrl)));
   document.close();
%>