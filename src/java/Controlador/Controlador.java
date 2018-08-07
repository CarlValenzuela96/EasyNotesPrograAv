/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import clases.Evento;
import clases.Ramo;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.xmlgraphics.util.MimeConstants;
import org.xml.sax.SAXException;

/**
 *
 * @author Carlos
 */
public class Controlador {

    public Controlador() {
    }

    public String edadUsuario(String fecha) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNac = LocalDate.parse(fecha, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);

        return String.valueOf(periodo.getYears());
    }

//    public String generarJsonFechas(ArrayList<Evento> a) {
    public String generarJsonFechas(Evento[] a) {
        Gson g = new Gson();
        String json;
        String jsonTotal = "";
        //            FileWriter file = new FileWriter("C:\\Users\\Carlos\\Desktop\\EasyNotes\\web\\assets\\js\\fechas.js");
        if (a != null) {

            for (int i = 0; i < a.length; i++) {
                if (i != (a.length - 1)) {
                    JsonObject object = new JsonObject();
                    object.addProperty("color", a[i].getColor());
                    object.addProperty("anio", a[i].getAño());
                    object.addProperty("mes", a[i].getMes());
                    object.addProperty("dia", a[i].getDia());
                    object.addProperty("content", a[i].getContent());

                    json = object.toString();
                    jsonTotal = jsonTotal + json + ",";

                } else {
                    JsonObject object = new JsonObject();
                    object.addProperty("color", a[i].getColor());
                    object.addProperty("anio", a[i].getAño());
                    object.addProperty("mes", a[i].getMes());
                    object.addProperty("dia", a[i].getDia());
                    object.addProperty("content", a[i].getContent());

                    json = object.toString();
                    jsonTotal = jsonTotal + json;

                }

            }
        } else {
            jsonTotal = "{}";
        }
        return jsonTotal;
    }

    public void crearXMLHistorial(String name, Ramo[] r) throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        DOMImplementation implementation = builder.getDOMImplementation();
        Document document = implementation.createDocument(null, name, null);
        document.setXmlVersion("1.0");

        Element raiz = document.getDocumentElement();
        for (int i = 0; i < r.length; i++) {
            Element itemNode = document.createElement("HISTORIAL");

            //Key Node
            Element keyNode = document.createElement("ID");
            Text nodeKeyValue = document.createTextNode(String.valueOf(i));
            keyNode.appendChild(nodeKeyValue);

            Element valueNodeRamo = document.createElement("RAMO");
            Element valueNodeProm = document.createElement("PROMEDIO");
            Element valueNodeEstado = document.createElement("ESTADO");

            Text nodeValueValueRamo = document.createTextNode(r[i].getNombreRamo());

            Text nodeValueValueProm;
            double prom;
            if (r[i].getTipoAprobacion().equals("Teórico - Práctico en conjunto") || r[i].getTipoAprobacion().equals("Teórico - Práctico por separado")) {
                nodeValueValueProm = document.createTextNode(String.valueOf(r[i].getPromedioMixto().getPromFinal()));
                prom = r[i].getPromedioMixto().getPromFinal();
            } else {
                nodeValueValueProm = document.createTextNode(String.valueOf(r[i].getPromedioSimple().getPromFinal()));
                prom = r[i].getPromedioSimple().getPromFinal();
            }

            Text nodeValueValueEstado;
            if (prom >= 3.96) {
                nodeValueValueEstado = document.createTextNode("Aprobado");
            } else {
                nodeValueValueEstado = document.createTextNode("Reprobado");
            }

            valueNodeRamo.appendChild(nodeValueValueRamo);
            valueNodeProm.appendChild(nodeValueValueProm);
            valueNodeEstado.appendChild(nodeValueValueEstado);

            itemNode.appendChild(keyNode);
            itemNode.appendChild(valueNodeRamo);
            itemNode.appendChild(valueNodeProm);
            itemNode.appendChild(valueNodeEstado);

            //append itemNode to raiz
            raiz.appendChild(itemNode);
            //Generate XMLUsuarios
            Source source = new DOMSource(document);

            //Indicamos donde lo queremos almacenar
            Result result = new StreamResult(new java.io.File("C:\\Users\\Carlos\\Desktop\\EasyNotes\\src\\java\\Transformacion\\" + name + ".xml")); //nombre del archivo
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        }

    }

    public void convertToPDF(String xslFile, String xmlFile, String outFile) throws IOException, FOPException, TransformerException, SAXException, SAXException {
        // the XSL FO file
        File xsltFile = new File(xslFile + "FormatoPDF.xsl");
        // the XML file which provides the input
        StreamSource xmlSource = new StreamSource(new File(xmlFile + "Historial.xml"));
        // create an instance of fop factory
        System.out.println(new File(".").toURI().toString());
        System.out.println(new File("C:/Users/Carlos/Desktop/EasyNotes/.").toURI());
        
        FopFactory fopFactory = FopFactory.newInstance(new File("File:/C:/Users/Carlos/Desktop/EasyNotes/.").toURI());
        
        // a user agent is needed for transformation
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
        // Setup output
        OutputStream out;
        out = new java.io.FileOutputStream(outFile + "Historial.pdf");

        try {
            // Construct fop with desired output format
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);
            
            // Setup XSLT
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

            // Resulting SAX events (the generated FO) must be piped through to FOP
            Result res = new SAXResult(fop.getDefaultHandler());

            // Start XSLT transformation and FOP processing
            // That's where the XML is first transformed to XSL-FO and then 
            // PDF is created
            transformer.transform(xmlSource, res);
        } finally {
            out.close();
        }
    }
}
