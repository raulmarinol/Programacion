package Marino_Lopez_Raul_U8_T1.Ejercicio3;

import EjemplosStax.Pedido;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RecorridoStax {

    public static void main(String[] args) {

        Integer caloriaTotal = 0;
        int numPlato = 0;
        String tagActual = "";
        Pedido menuNuevo = null;


        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("breah_fast.xml"));

            while (xmlReader.hasNext()) {

                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {

                    StartElement startTag = xmlEvent.asStartElement();


                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName) {
                        case "calories":
                            tagActual = "calories";
                            numPlato++;
                            break;
                    }
                }

                if (!tagActual.equals("")) {
                    switch (tagActual) {
                        case "calories" :

                            break;
                    }
                }

            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(numPlato);
        System.out.println(caloriaTotal);

    }
}