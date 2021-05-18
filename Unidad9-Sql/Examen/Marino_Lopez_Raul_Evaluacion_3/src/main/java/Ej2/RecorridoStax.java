package Ej2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecorridoStax {


    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

        Scanner sc =new Scanner(System.in);
        int paguinas=0;
        int numlibros;
        String nombre;

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("bibliotecaXML.xml"));

        System.out.println("DIme un autor");
        nombre = sc.nextLine();

        while (xmlReader.hasNext()){


        }
    }
}
