package Marino_Lopez_Raul_U8_T1.Ejercicio1;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class mostrarXML {
    public static void main(String[] args) {

        try {


            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("breah_fast.xml"));

            Element root = doc.getDocumentElement();


            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {


                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

                    System.out.println("He encontrado un nodo etiqueta");
                    Element e = (Element) nl.item(i);
                    System.out.println("Es la etiqueta: "+e.getTagName());
                    System.out.println("Y contiene:");
                    System.out.println(e.getTextContent());

                } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
                    System.out.println("He encontrado un nodo texto");
                    System.out.println("Y contiene:");
                    Text texto = (Text) nl.item(i);
                    System.out.println(texto.getTextContent());

                } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
                    System.out.println("He encontrado un nodo comentario");
                    System.out.println("Y contiene:");
                    Comment comentario = (Comment) nl.item(i);
                    System.out.println(comentario.getTextContent());

                }
                System.out.println("----------------------------------------");
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
