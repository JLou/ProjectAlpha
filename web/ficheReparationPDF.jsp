<%@page import="fr.alpha.model.DemandeReparation"%>
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
    
    document.addTitle("Fiche Reparation");
            
   document.add(new Paragraph("Description                                                           Prix " ));
   document.add(new Paragraph("-----------------------------------------------------------------------------"));
        
    Paragraph paragraph2 = new Paragraph();  
        Chunk chunk2 = new Chunk(
              "Port :                                                                   " + ((DemandeReparation) session.getAttribute("demande")).getForfait().getCoutPort()+"  euros");
        paragraph2.add(chunk2); 
        document.add(paragraph2);
        document.add(new Paragraph("-----------------------------------------------------------------------------"));
         Paragraph paragraph3 = new Paragraph(); 
        Chunk chunk3 = new Chunk(
              "Diagnostic :                                                        " + ((DemandeReparation) session.getAttribute("demande")).getForfait().getCoutDevis()+"  euros");
        paragraph3.add(chunk3); 
         document.add(paragraph3);
         document.add(new Paragraph("-----------------------------------------------------------------------------"));
        
          Paragraph paragraph4 = new Paragraph(); 
           Chunk chunk4 = new Chunk(
              "Réparation :                                                       " + ((DemandeReparation) session.getAttribute("demande")).getForfait().getCoutReparation()+"  euros");
        paragraph4.add(chunk4); 
         document.add(paragraph4);
         document.add(new Paragraph("-----------------------------------------------------------------------------"));
        
         Paragraph paragraph5 = new Paragraph(); 
        Chunk chunk5 = new Chunk(
              "Total: :                                                               " + ((DemandeReparation) session.getAttribute("demande")).getForfait().getTotal()+"  euros");
        paragraph5.add(chunk5);
   document.add(paragraph5);

   document.close();
%>