package mainprogram.baocao;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.jfree.chart.ChartPanel;
import org.jfree.ui.RefineryUtilities;

public class BarChart extends javax.swing.JFrame {

    
    public BarChart(ChartPanel chart) {
        try {
            this.setIconImage(ImageIO.read(new File("data/icon.png")));
        } catch (IOException ex) {
            System.out.println("Loi: "+ex.getMessage());
        }
        this.setTitle("Thống kê chi tiêu");
        initComponents();
        chart.setPreferredSize(new java.awt.Dimension(1000, 700));
        setContentPane(chart);
        this.pack();
        RefineryUtilities.centerFrameOnScreen(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
