package homework.pdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;

import java.io.FileNotFoundException;

public class PDFMain {
    public static void main(String[] args) throws FileNotFoundException {
        // Creating a PdfWriter
        String dest = "C:/Users/Linas/Desktop/failai/addingTable.pdf";
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdfDoc = new PdfDocument(writer);
        // Adding an empty page
        pdfDoc.addNewPage();
        // Creating a Document
        Document document = new Document(pdfDoc);


        // Creating a table object
        String text = "SASKAITA FAKTURA\n Serija AAA nr. 2456 \n 2022-10-10";
        Paragraph saskaitosFakturosInfo = new Paragraph(text);
        saskaitosFakturosInfo.setTextAlignment(TextAlignment.CENTER);


        document.add(saskaitosFakturosInfo);
        float[] pointColumnWidths1 = {500F, 500F};
        Table pardavejoPirkejoInfo = new Table(pointColumnWidths1);
        pardavejoPirkejoInfo.addCell(new Cell().add("PARDAVEJAS\nUAB ,,SASKAITU IMONE\"\ni.k:123456481\n" +
                "adresas:Fakturu g. 27, Vilnius\na.s: LT72 7044 0014 2241 7652, AB SEB bankas").setBorder(Border.NO_BORDER).setFontSize(10));
        pardavejoPirkejoInfo.addCell(new Cell().add("PIRKEJAS\n Inviduali imone ,,FAKTURU IMONE\"\n" +
                "i.k 4566546456466\n adresas: Saskaitu g. 15, Siauliai").setBorder(Border.NO_BORDER).setFontSize(10));

        float[] pointColumnWidths2 = {15F, 350F, 75F, 75F, 75F, 75F};
        Table table2 = new Table(pointColumnWidths2);
        document.add(pardavejoPirkejoInfo);
        String[] lenetelesTurinys = {"Eil nr.", "Prekes ar paslaugos pavadinimas", "Matas", "Kiekis", "Kaina", "Suma"};
        String[][] data = {
                {"1", "Desreles", "KG", "32", "10", "320"},
                {"2", "Alus", "VNT", "12", "50", "3120"},
        };
        table2.addCell(new Cell().add(lenetelesTurinys[0]));
        table2.addCell(new Cell().add(lenetelesTurinys[1]));
        table2.addCell(new Cell().add(lenetelesTurinys[2]));
        table2.addCell(new Cell().add(lenetelesTurinys[3]));
        table2.addCell(new Cell().add(lenetelesTurinys[4]));
        table2.addCell(new Cell().add(lenetelesTurinys[5]));

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                table2.addCell(new Cell().add(data[i][j]));
            }
        }
        document.add(table2);
        document.close();
    }
}
