/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import clases.Ramo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.apache.fop.apps.FOPException;
import org.xml.sax.SAXException;

/**
 *
 * @author Carlos
 */
public class ProcesoPDF extends Thread {

    Ramo[] r;

    public ProcesoPDF(String msg, Ramo[] r) {
        super(msg);
        this.r = r;
    }

    @Override
    public void run() {
        System.out.println("hola");
        Controlador c = new Controlador();
//        try {
//            c.crearXMLHistorial("Historial", r);
//        } catch (ParserConfigurationException ex) {
//            Logger.getLogger(ProcesoPDF.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (TransformerException ex) {
//            Logger.getLogger(ProcesoPDF.class.getName()).log(Level.SEVERE, null, ex);
//        }

        String path = "C:\\Users\\Carlos\\Desktop\\EasyNotes\\src\\java\\Transformacion\\";
        try {
            c.convertToPDF(path, path, path);
        } catch (IOException ex) {
            Logger.getLogger(ProcesoPDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FOPException ex) {
            Logger.getLogger(ProcesoPDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(ProcesoPDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ProcesoPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
