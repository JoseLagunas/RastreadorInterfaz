package rastreador;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * @author imssbora
 *
 */
public class Historial extends JFrame {

   private static final long serialVersionUID = 1L;

   public Historial(String title) {
      super(title);
      
      // Create dataset
      XYDataset dataset = getXYDataset();
    
      // Create chart
      JFreeChart chart = ChartFactory.createPolarChart(
            "RASTREADOR HISTORIAL   | MOVIMIENTOS", // Chart title
            dataset,
            true,
            true,
            false
            );

      ChartPanel panel = new ChartPanel(chart);
      panel.setMouseZoomable(false);
      setContentPane(panel);
   }

   private XYDataset getXYDataset() {
     
      XYSeriesCollection dataset = new XYSeriesCollection();

      XYSeries series1 = new XYSeries("LENGUAJES DE INTERFAZ");
      series1.add(35, 45);
      series1.add(145, 120);
      series1.add(90, 150);
      series1.add(90, 45);
      series1.add(145, 140);
      series1.add(54, 175);
       series1.add(275, 183);
       series1.add(220, 119);
       series1.add(25, 45);
      series1.add(15, 120);
      series1.add(90, 150);
      series1.add(10, 45);
      series1.add(155, 140);
      series1.add(341, 175);
       series1.add(275, 183);
       series1.add(220, 119);
      dataset.addSeries(series1);
      
      return dataset;
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
         Historial example = new Historial("HISTORIAL DE MOVIMIENTO");
         example.setSize(700, 500);
         example.setLocationRelativeTo(null);
         example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         example.setVisible(true);
      });
   }
}