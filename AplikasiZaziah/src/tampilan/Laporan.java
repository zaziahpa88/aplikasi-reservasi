/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author HP
 */
public class Laporan extends javax.swing.JFrame {
private Connection conn = new koneksi().connect() ;
    JasperReport jasperReport;
    JasperDesign jasperDesign;
    JasperPrint jasperPrint;
    Map<String,Object> param = new HashMap<String,Object>();
    
    
    public Laporan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodypanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        buttonkembali4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Karyawan = new javax.swing.JLabel();
        Penghuni = new javax.swing.JLabel();
        Pembayaran = new javax.swing.JLabel();
        Tagihan = new javax.swing.JLabel();
        Kontrakan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bodypanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        buttonkembali4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        buttonkembali4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Go Back_35px.png"))); // NOI18N
        buttonkembali4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonkembali4MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Menu Laporan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(186, 186, 186)
                .addComponent(buttonkembali4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonkembali4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Laporan Data Karyawan");

        Karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/administrator_male_100px.png"))); // NOI18N
        Karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KaryawanMouseClicked(evt);
            }
        });

        Penghuni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/People_100px.png"))); // NOI18N
        Penghuni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PenghuniMouseClicked(evt);
            }
        });

        Pembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/banknotes_100px.png"))); // NOI18N
        Pembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembayaranMouseClicked(evt);
            }
        });

        Tagihan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/receipt_100px.png"))); // NOI18N
        Tagihan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TagihanMouseClicked(evt);
            }
        });

        Kontrakan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/badminton_100px.png"))); // NOI18N
        Kontrakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KontrakanMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Laporan Data Lapangan");

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Laporan Data Pelanggan");

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Laporan Data Pembayaran");

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Laporan Data Tagihan");

        javax.swing.GroupLayout bodypanelLayout = new javax.swing.GroupLayout(bodypanel);
        bodypanel.setLayout(bodypanelLayout);
        bodypanelLayout.setHorizontalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodypanelLayout.createSequentialGroup()
                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(Karyawan)
                        .addGap(97, 97, 97)
                        .addComponent(Kontrakan)
                        .addGap(97, 97, 97)
                        .addComponent(Penghuni))
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8))
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodypanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel11))
                            .addGroup(bodypanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(Pembayaran)
                                .addGap(90, 90, 90)
                                .addComponent(Tagihan)))))
                .addGap(121, 121, 121)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodypanelLayout.setVerticalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodypanelLayout.createSequentialGroup()
                                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Karyawan)
                                    .addComponent(Kontrakan))
                                .addGap(18, 18, 18)
                                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)))
                            .addGroup(bodypanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(Penghuni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)))
                        .addGap(54, 54, 54)
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bodypanelLayout.createSequentialGroup()
                                .addComponent(Pembayaran)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addGroup(bodypanelLayout.createSequentialGroup()
                                .addComponent(Tagihan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))))
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel7)))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bodypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bodypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonkembali4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonkembali4MouseClicked
        // TODO add your handling code here:
        dispose();
        new MenuUtama().setVisible(true);
    }//GEN-LAST:event_buttonkembali4MouseClicked

    private void KaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaryawanMouseClicked
        // TODO add your handling code here:
        try{
            File file = new File("src/Laporan/LapDataKaryawan.jrxml ");
            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport,param,conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_KaryawanMouseClicked

    private void PenghuniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PenghuniMouseClicked
        // TODO add your handling code here:
        try{
            File file = new File("src/Laporan/LapDataPelanggan.jrxml ");
            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport,param,conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_PenghuniMouseClicked

    private void PembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembayaranMouseClicked
        // TODO add your handling code here:
        try{
            File file = new File("src/Laporan/LapDataPembayaran.jrxml ");
            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport,param,conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_PembayaranMouseClicked

    private void TagihanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TagihanMouseClicked
        // TODO add your handling code here:
        try{
            File file = new File("src/Laporan/LapDataTagihan.jrxml ");
            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport,param,conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_TagihanMouseClicked

    private void KontrakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KontrakanMouseClicked
        // TODO add your handling code here:
        try{
            File file = new File("src/Laporan/LapDataLapangan.jrxml ");
            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport,param,conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_KontrakanMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Karyawan;
    private javax.swing.JLabel Kontrakan;
    private javax.swing.JLabel Pembayaran;
    private javax.swing.JLabel Penghuni;
    private javax.swing.JLabel Tagihan;
    private javax.swing.JPanel bodypanel;
    private javax.swing.JButton buttonkembali4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
