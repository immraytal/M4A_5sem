import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

     double t0=Math.PI/2;
     double tmax = t0+3;
     double u=1.0;

     double h= 0.05;


                                                        // Явный Эйлер
     for (double t=t0; t< tmax; t+=h) {

         u=u+h*((u/t) + t*Math.sin(t));
         //System.out.println("(" + t + ";" + u + ")");
        // System.out.println("(" + t + ";" + (((2*t)/Math.PI) - t*Math.cos(t)) + ")");

     }
        u=1.0;                                          // Коши-Эйлер

     for (double t=t0; t< tmax; t+=0.1) {
          double uNew =u+0.1*((u/t) + t*Math.sin(t));

            for (int i =0; i<3; i++) {

                uNew=u+(0.1*(((u/t) + t*Math.sin(t))+((uNew/(t+0.1))+((t+0.1) * Math.sin((t+0.1))))))/2;
            }
            u = uNew;
           // System.out.println("(" + t + ";" + uNew + ")");
           //System.out.println("(" + t + ";" + (((2*t)/Math.PI) - t*Math.cos(t)) + ")");
     }








        System.out.println("End");
    }

}
