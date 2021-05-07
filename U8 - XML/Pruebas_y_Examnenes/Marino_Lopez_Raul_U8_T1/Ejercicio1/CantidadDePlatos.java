package Marino_Lopez_Raul_U8_T1.Ejercicio1;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class CantidadDePlatos {
    public static void main(String[] args) {

        int num=0;

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("breah_fast.xml"));

            Element root = doc.getDocumentElement();

            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {

                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    num++;
                    Element e = (Element) nl.item(i);
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
        System.out.println(num);
    }
}
