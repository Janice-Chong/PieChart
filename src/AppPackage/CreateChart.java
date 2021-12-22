/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppPackage;

import java.util.Locale;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Janice
 */
public class CreateChart extends JFrame {
    public CreateChart (String appTitle, String chartTitle){
        PieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(chartPanel);
    }
    private PieDataset createDataset(){
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("January", 2500);
        result.setValue("February", 1600);
        result.setValue("March", 2000);
        result.setValue("April", 2700);
        result.setValue("May", 3200);
        result.setValue("June", 800);
        return result;
    }
    private JFreeChart createChart(PieDataset dataset, String title){
        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset,  true, true, false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(90);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(1.0f);
        return chart;
    }
    
}
