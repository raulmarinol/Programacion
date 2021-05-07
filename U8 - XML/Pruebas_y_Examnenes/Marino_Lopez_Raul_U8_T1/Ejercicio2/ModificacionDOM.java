package Marino_Lopez_Raul_U8_T1.Ejercicio2;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificacionDOM {
    public static void main(String[] args) {
        try {


            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();


            Document doc = db.parse(new File("breah_fast.xml"));


            Node root = doc.getDocumentElement();

            //Añada una nueva comida al menú solicitando los datos al usuario.

            Element food = doc.createElement("food");

            Element name = doc.createElement("name");
            name.setTextContent("Huevo a la pantoja");

            Element price = doc.createElement("price");
            price.setTextContent("25");

            Element description = doc.createElement("description");
            price.setTextContent("Estan ricos, ricos ");

            Element calories = doc.createElement("calories");
            price.setTextContent("calories");

            food.appendChild(name);
            food.appendChild(price);
            food.appendChild(description);
            food.appendChild(calories);


            root.appendChild(food);

            //Inserte al final de cada nodo food (incluido el nuevo) la siguiente etiqueta <healthy>true</healthy>



            //Escriba todo esto en un fichero llamado ejercicio2.xml

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoMenu = new File("ejercicio2.xml");
            StreamResult destino = new StreamResult(nuevoMenu);

            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | IOException | SAXException
                | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}


