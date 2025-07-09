//package com.test;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}



//package com.test;
//
//import java.io.File;
//import net.sourceforge.tess4j.Tesseract;
//import net.sourceforge.tess4j.TesseractException;
//
//public class App {
//    public static void main(String[] args) {
//		// Path to your jpeg image
//        File imageFile = new File("C:\\Users\\BHAVANAREDDY.YADALA\\Image1.jpeg");
//        Tesseract tesseract = new Tesseract();
//        tesseract.setDatapath("C:\\Users\\BHAVANAREDDY.YADALA\\Downloads");
//        tesseract.setLanguage("eng");
//        try {
//            String result = tesseract.doOCR(imageFile);
//            System.out.println("ExtractedText_JPEG :\n" + result);
//        } catch (TesseractException e) {
//            System.err.println("OCR Error: " + e.getMessage());
//        }
//    }
//}
















//package com.test;
//
//import java.io.File;
//import net.sourceforge.tess4j.Tesseract;
//import net.sourceforge.tess4j.TesseractException;
//
//public class App {
//    public static void main(String[] args) {
//        try {
//            // Path to your PDF image
//            File imageFile = new File("C:\\Users\\BHAVANAREDDY.YADALA\\Image1.pdf");
//
//            // Tesseract setup
//            Tesseract tesseract = new Tesseract();
//            tesseract.setDatapath("C:\\Users\\BHAVANAREDDY.YADALA\\Downloads"); // Path to tessdata
//            tesseract.setLanguage("eng"); // Use English
//
//            // OCR and print result
//            String result = tesseract.doOCR(imageFile);
//            System.out.println("ExtractedText_PDF: " + result);
//        } catch (TesseractException e) {
//            System.err.println("OCR Error: " + e.getMessage());
//        }
//    }
//}












//package com.test;
//
//import java.io.File;
//import net.sourceforge.tess4j.Tesseract;
//import net.sourceforge.tess4j.TesseractException;
//
//public class App {
//    public static void main(String[] args) {
//        try {
//            // Path to your JPG image
//            File imageFile = new File("C:\\Users\\BHAVANAREDDY.YADALA\\Image1.jpg");
//
//            // Tesseract setup
//            Tesseract tesseract = new Tesseract();
//            tesseract.setDatapath("C:\\Users\\BHAVANAREDDY.YADALA\\Downloads"); // Path to tessdata
//            tesseract.setLanguage("eng"); // Use English
//
//            // OCR and print result
//            String result = tesseract.doOCR(imageFile);
//            System.out.println("ExtractedText_JPG: " + result);
//        } catch (TesseractException e) {
//            System.err.println("OCR Error: " + e.getMessage());
//        }
//    }
//}













package com.test;

import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class App {
    public static void main(String[] args) {
        try {
            // Path to your PNG image
            File imageFile = new File("C:\\Users\\BHAVANAREDDY.YADALA\\Image1.png");

            // Tesseract setup
            Tesseract tesseract = new Tesseract();
            tesseract.setDatapath("C:\\Users\\BHAVANAREDDY.YADALA\\Downloads"); // Path to tessdata
            tesseract.setLanguage("eng"); // Use English

            // OCR and print result
            String result = tesseract.doOCR(imageFile);
            System.out.println("ExtractedText_PNG: " + result);
        } catch (TesseractException e) {
            System.err.println("OCR Error: " + e.getMessage());
        }
    }
}












//package com.test;
//
//import net.sourceforge.tess4j.Tesseract;
//import net.sourceforge.tess4j.TesseractException;
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.rendering.PDFRenderer;
//
//import java.awt.image.BufferedImage;
//import javax.imageio.ImageIO;
//import java.io.File;
//
//public class App {
//    public static void main(String[] args) {
//    	try {
//    	    //Load the PDF
//    	    File pdfFile = new File("C:\\Users\\BHAVANAREDDY.YADALA\\Image1.pdf");
//    	    PDDocument document = PDDocument.load(pdfFile);
//    	    PDFRenderer pdfRenderer = new PDFRenderer(document);
//
//    	    //Convert the first page page to image
//    	    BufferedImage image = pdfRenderer.renderImageWithDPI(0, 300); // 0 = first page
//    	    File tempImage = new File("page_0.png");
//    	    ImageIO.write(image, "png", tempImage);
//
//    	    //Tesseract OCR
//    	    Tesseract tesseract = new Tesseract();
//    	    tesseract.setDatapath("C:\\Users\\BHAVANAREDDY.YADALA\\Downloads");
//    	    tesseract.setLanguage("eng");
//
//    	    //Extract text
//    	    String result = tesseract.doOCR(tempImage);
//    	    System.out.println("Text Extraction_pdf: " + result);
//
//    	    document.close();
//    	} catch (Exception e) {
//    	    e.printStackTrace();
//    	}
//    }
//}
