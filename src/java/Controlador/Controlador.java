/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.util.ArrayList;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Carlos
 */
public class Controlador {

    public Controlador() {
    }

    public double calcProm(ArrayList<Double> notas, ArrayList<Double> pond) {
        double cont = 0;
        for (int i = 0; i < notas.size(); i++) {
            cont = cont + (notas.get(i) * (pond.get(i) / 100));
        }
        double prom = cont;
        return prom;
    }

    public double calcNotaFalt(ArrayList<Double> notas, ArrayList<Double> pond) {
        double cont = 0;
        for (int i = 0; i < notas.size() - 1; i++) {
            cont = cont + (notas.get(i) * (pond.get(i) / 100));
        }
        double nf = ((3.96 - cont) * 100) / pond.get(pond.size());

        return nf;
    }

    public double calcNotaPExamen(ArrayList<Double> notas, ArrayList<Double> pond) {
        double cont = 0;
        for (int i = 0; i < notas.size() - 1; i++) {
            cont = cont + (notas.get(i) * (pond.get(i) / 100));
        }
        double nf = ((3.6 - cont) * 100) / pond.get(pond.size());

        return nf;
    }

//    public JFreeChart generarGrafico(ArrayList<RamoReprobado> RR, ArrayList<RamoAprobado> RA, int sem, int anio, int idUsuario) {
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//
//        for (int i = 0; i < RR.size(); i++) {
//            if (RR.get(i).getHistorialidHistorial().getUsuarioidUsuario().getIdUsuario() == idUsuario
//                    && RR.get(i).getHistorialidHistorial().getAño() == anio
//                    && RR.get(i).getHistorialidHistorial().getSemestre() == sem) {
//                dataset.setValue(RR.get(i).getNotaReprobacion(), "Ramo Reprobado", RR.get(i).getNombreRamo());
//            }
//        }
//         for (int i = 0; i < RA.size(); i++) {
//            if (RA.get(i).getHistorialidHistorial().getUsuarioidUsuario().getIdUsuario() == idUsuario
//                    && RA.get(i).getHistorialidHistorial().getAño() == anio
//                    && RA.get(i).getHistorialidHistorial().getSemestre() == sem) {
//                dataset.setValue(RA.get(i).getNotaAprobacion(), "Ramo Aprobado", RR.get(i).getNombreRamo());
//            }
//        }
//        
//        JFreeChart chart = ChartFactory.createBarChart3D("Historial", "Ramo",
//                "Notas", dataset, PlotOrientation.VERTICAL, true,
//                true, false);
//
//        return chart;
//    }
}
