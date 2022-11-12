//package homework.pdf;
//
//import com.itextpdf.layout.element.Cell;
//import com.itextpdf.layout.element.Table;
//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.PdfDocument;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
//
//
//import java.io.*;
//import java.net.URISyntaxException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.stream.Stream;
//
//public class Main {
//    public static void main(String[] args) {
//        // Create a new document.
//        Document document = new Document();
//        try {
//            // Get an instance of PdfWriter and create a HelloWorld.pdf
//            // file as an output.
//            PdfWriter.getInstance(document,
//                    new FileOutputStream("HelloWorld.pdf"));
//            document.open();
//
//            // Create our first paragraph for the pdf document to be
//            // created. We also set the alignment and the font of the
//            // paragraph.
//            String text = "SASKAITA FAKTURA\n Serija AAA nr. 2456 \n 2022-10-10";
//            Paragraph saskaitosFakturosInfo = new Paragraph(text);
//            saskaitosFakturosInfo.setAlignment(Element.ALIGN_CENTER);
//            saskaitosFakturosInfo.setFont(new Font(
//                    Font.FontFamily.HELVETICA, 10, Font.NORMAL));
//            document.add(saskaitosFakturosInfo);
//
//            text = "PARDAVEJAS\n UAB \" SASKAITU IMONE\n i.k: 123348666\n adresas: Fakturu g.24, Vilnius\n i.s: LT72 7044 " +
//                    "0014 2241 7652, AB SEB bankas           ";
//            Paragraph pardavejoInfo = new Paragraph(text);
//            pardavejoInfo.setAlignment(Element.ALIGN_LEFT);
//            pardavejoInfo.setFont(new Font(
//                    Font.FontFamily.HELVETICA, 10, Font.NORMAL));
//            document.add(pardavejoInfo);
//
//            text = "PIRKEJAS\nII\"Fakturu imone\"\ni.k: 456489744949\nadresas: Saskaitu g.15, Siauliai";
//            Paragraph pirkejoInfo = new Paragraph(text);
//            pirkejoInfo.setAlignment(Element.ALIGN_RIGHT);
//            pirkejoInfo.setFont(new Font(
//                    Font.FontFamily.HELVETICA, 10, Font.NORMAL));
//// Creating a table object
//                // Creating a PdfDocument object
//                String dest = "C:/itextExamples/addingTable.pdf";
//                PdfWriter writer = new PdfWriter(dest);
//
//                // Creating a PdfDocument object
//                PdfDocument pdf = new PdfDocument(writer);
//
//                // Creating a Document object
//                Document doc = new Document(pdf);
//
//                // Creating a table
//                float [] pointColumnWidths = {150F, 150F, 150F};
//                Table table = new Table(pointColumnWidths);
//
//                // Adding cells to the table
//                table.addCell(new Cell().add("Name"));
//                table.addCell(new Cell().add("Raju"));
//                table.addCell(new Cell().add("Id"));
//                table.addCell(new Cell().add("1001"));
//                table.addCell(new Cell().add("Designation"));
//                table.addCell(new Cell().add("Programmer"));
//
//                // Adding Table to document
//                doc.add(table);
//
//                // Closing the document
//                doc.close();
//                System.out.println("Table created successfully..");
//
//
//
//
//
//
//        } catch (DocumentException | FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            document.close();
//        }
//    }
//}
//
//
//
//
