/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class prueba {

    public static void main(String[] args) {
        ArrayList<Double> listaNotas = new ArrayList<>();
        listaNotas.add(3.0);
        listaNotas.add(3.7);
        listaNotas.add(Double.NaN);
        ArrayList<Double> listaPond = new ArrayList<>();
        listaPond.add(30.0);
        listaPond.add(35.0);
        listaPond.add(35.0);
        //  Double prom = calcProm(listaNotas, listaPond);
        //Double prom = calcNotaFaltante(listaNotas, listaPond);
        Double prom = calcNotaExamen(listaNotas, listaPond);
        System.out.println(prom);
    }

    private static double calcProm(java.util.List<java.lang.Double> listaNotas, java.util.List<java.lang.Double> listaPond) {
        promedio.CalcPromedios_Service service = new promedio.CalcPromedios_Service();
        promedio.CalcPromedios port = service.getCalcPromediosPort();
        return port.calcProm(listaNotas, listaPond);
    }

    private static double calcNotaFaltante(java.util.List<java.lang.Double> listaNotas, java.util.List<java.lang.Double> listaPond) {
        promedio.CalcPromedios_Service service = new promedio.CalcPromedios_Service();
        promedio.CalcPromedios port = service.getCalcPromediosPort();
        return port.calcNotaFaltante(listaNotas, listaPond);
    }

    private static double calcNotaExamen(java.util.List<java.lang.Double> listaNotas, java.util.List<java.lang.Double> listaPond) {
        promedio.CalcPromedios_Service service = new promedio.CalcPromedios_Service();
        promedio.CalcPromedios port = service.getCalcPromediosPort();
        return port.calcNotaExamen(listaNotas, listaPond);
    }
    
    
}
