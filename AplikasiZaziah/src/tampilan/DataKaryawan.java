/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author HP
 */
public class DataKaryawan extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect() ;

    /**
     * Creates new form DataKaryawan
     */
         public void id_auto(){
        try{
            Connection c = new koneksi().connect();
            Statement stat = c.createStatement();
            String sql = "select max(right(id_karyawan,4)) as no from datakaryawan";
            ResultSet rs = stat.executeQuery(sql);
            idkar.setEnabled(false);
            while (rs.next()){
                if(rs.first()==false){
                    idkar.setText("IDK0001");
                }else {
                    rs.last();
                    int set_kode = rs.getInt(1)+1;
                    String no = String.valueOf(set_kode);
                    int kode_next = no.length();
                    for (int a = 0 ; a<4 - kode_next; a++){
                        no = "0"+no;
                        
                }
                    idkar.setText("IDK"+no);
                }
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void listed(){ 
        DefaultTableModel table = new DefaultTableModel(); 
        
        table.addColumn("ID Karyawan");
        table.addColumn("Nama Karyawan");  
        table.addColumn("Jenis Kelamin");  
        table.addColumn("No Telpon"); 
        table.addColumn("Alamat");
 
        try{ 
            Connection kon = new koneksi().connect();
            String sql = "SELECT * FROM datakaryawan"; 
            Statement S = kon.createStatement(); 
            ResultSet rs = S.executeQuery(sql); 
             
            while(rs.next()){ 
                table.addRow(new Object[]{ 
                        rs.getString(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getString(4),
                        rs.getString(5),


                        }); 
                } 
            tabeldatakaryawan.setModel(table); 
         }   
        catch(Exception e){ 
            System.out.println(e); 
        } 
    }
    
    public void clear(){ 
     idkar.setText("");
     nmkar.setText("");  
     //jenkel.getSelectedItem("");
     notlp.setText(""); 
     almt.setText("");
     }
    
    public DataKaryawan() {
        initComponents();
        setLocationRelativeTo(null);
         nmkar.requestFocus();
    listed();
    clear();
    id_auto();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idkar = new javax.swing.JTextField();
        nmkar = new javax.swing.JTextField();
        almt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldatakaryawan = new javax.swing.JTable();
        tf_cari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        notlp = new javax.swing.JTextField();
        jenkel = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        buttonkembali4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bodypanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Nama Karyawan");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("ID Karyawan");

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Jenis Kelamin ");

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Alamat");

        idkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idkarActionPerformed(evt);
            }
        });

        tabeldatakaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Karyawan", "Nama Karyawan", "Jenis Kelamin", "No Telpon", "Alamat"
            }
        ));
        tabeldatakaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldatakaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldatakaryawan);

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnsimpan.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(153, 0, 0));
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnubah.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        btnubah.setForeground(new java.awt.Color(153, 0, 0));
        btnubah.setText("Ubah");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnrefresh.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        btnrefresh.setForeground(new java.awt.Color(153, 0, 0));
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(153, 0, 0));
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("No Telpon");

        jenkel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan", " " }));

        javax.swing.GroupLayout bodypanelLayout = new javax.swing.GroupLayout(bodypanel);
        bodypanel.setLayout(bodypanelLayout);
        bodypanelLayout.setHorizontalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodypanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodypanelLayout.createSequentialGroup()
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idkar)
                            .addComponent(nmkar)
                            .addComponent(jenkel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(30, 30, 30)
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(almt)
                            .addComponent(notlp)))
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addComponent(btnsimpan)
                        .addGap(67, 67, 67)
                        .addComponent(btnubah, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnrefresh)
                        .addGap(79, 79, 79)
                        .addComponent(btnhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(tf_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(34, 34, 34))
        );
        bodypanelLayout.setVerticalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(notlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodypanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(almt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bodypanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))))
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idkar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nmkar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jenkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnubah)
                    .addComponent(btnrefresh)
                    .addComponent(btnhapus)
                    .addComponent(tf_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        getContentPane().add(bodypanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 112, 830, 410));

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonkembali4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        buttonkembali4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Go Back_35px.png"))); // NOI18N
        buttonkembali4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonkembali4MouseClicked(evt);
            }
        });
        jPanel3.add(buttonkembali4, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 37, 40, 40));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Form KARYAWAN");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarkontrakan/FormKaryawan_50px.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 60, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 1, 830, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        String idkaryawan = idkar.getText();
        String namakaryawan = nmkar.getText();  
        String jeniskelamin = (String) jenkel.getSelectedItem();
        String notelpon = notlp.getText(); 
        String alamat = almt.getText();
        
        if(idkaryawan.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(null, "Masukkan ID Karyawan");
        }
        else if(namakaryawan.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(null, "Masukkan Nama Karyawan");
        }
        else if(jeniskelamin.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(null, "Masukkan Jenis Kelamin");
        }
        else if(notelpon.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(null, "Masukkan No telpon");
        }
        else if(alamat.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(null, "Masukkan Alamat");
        }else {
            try {
               String sql = "insert into datakaryawan values ('"+idkaryawan+"','"+namakaryawan+"','"+jeniskelamin+"','"+notelpon+"','"+alamat+"')";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql); 
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Input");
                clear();
                listed();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Di Input"+ e);
            }
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void idkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idkarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idkarActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        // TODO add your handling code here:
        String idkaryawan = idkar.getText();
        String namakaryawan = nmkar.getText();  
        String jeniskelamin = (String) jenkel.getSelectedItem();
        String notelpon = notlp.getText(); 
        String alamat = almt.getText();
        
        if(idkaryawan.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(null, "Masukkan ID Karyawan");
        }
        else if(namakaryawan.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(null, "Masukkan Nama Karyawan");
        }
        else if(jeniskelamin.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(null, "Masukkan Jenis Kelamin");
        }
        else if(notelpon.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(null, "Masukkan No telpon");
        }
        else if(alamat.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(null, "Masukkan Alamat");
        }else {
            try {
               String sql = "update datakaryawan set nama_karyawan=?, jenis_kelamin=?, no_tlp=?, alamat=? where id_karyawan=?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql); 
           
            pst.setString(1, namakaryawan);
            pst.setString(2, jeniskelamin);
            pst.setString(3, notelpon);
            pst.setString(4, alamat);
            pst.setString(5, idkaryawan);
            
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
                clear();
                listed();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah"+ e);
            }
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void tabeldatakaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldatakaryawanMouseClicked
        // TODO add your handling code here:
         int i = tabeldatakaryawan.getSelectedRow(); 
        if(i>-1){
           
        try {
            } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
            //btnPilihTanggal.setDate(tabeldatabarang.getValueAt(i, 0).parse());
            idkar.setText(tabeldatakaryawan.getValueAt(i,0).toString()); 
            nmkar.setText(tabeldatakaryawan.getValueAt(i,1).toString());
            //jenkel.setText(tabeldatakaryawan.getValueAt(i,2).toString());
            notlp.setText(tabeldatakaryawan.getValueAt(i,3).toString());
            almt.setText(tabeldatakaryawan.getValueAt(i,4).toString());
        }                              
    }//GEN-LAST:event_tabeldatakaryawanMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        
        int ok = JOptionPane.showConfirmDialog(null,"Apakah Anda Yakin ingin Hapus Data","Konfirmasi Dialog",JOptionPane.YES_NO_OPTION);

        if(ok==0){
            String sql = "delete from datakaryawan where id_karyawan ='"+idkar.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement (sql);
                stat.executeUpdate();
                listed();
                clear();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Data Gagal DiHAPUS"+ e);
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
                dispose(); 
        new DataKaryawan().setVisible(true);
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabel = new DefaultTableModel();
        
        tabel.addColumn("ID Karyawan");
        tabel.addColumn("Nama Karyawan");
        tabel.addColumn("Jenis Kelamin");
        tabel.addColumn("No Tlp");
        tabel.addColumn("Alamat");
        try {
           Connection con = new koneksi().connect();
            String sql = "Select * From datakaryawan where id_karyawan like '%"+ tf_cari.getText()+ "%' OR nama_karyawan like '%"
                    + tf_cari.getText()+"%' OR jenis_kelamin like '%"+ tf_cari.getText()+"%'OR no_tlp like '%"+ tf_cari.getText()+"%'"
                    + "OR alamat like '%"+ tf_cari.getText()+"%'";
         
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                tabel.addRow(new Object[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                });
            }
            tabeldatakaryawan.setModel(tabel);
       
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonkembali4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonkembali4MouseClicked
        // TODO add your handling code here:
        dispose();
        new MenuUtama().setVisible(true);
    }//GEN-LAST:event_buttonkembali4MouseClicked

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
            java.util.logging.Logger.getLogger(DataKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField almt;
    private javax.swing.JPanel bodypanel;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JButton buttonkembali4;
    private javax.swing.JTextField idkar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenkel;
    private javax.swing.JTextField nmkar;
    private javax.swing.JTextField notlp;
    private javax.swing.JTable tabeldatakaryawan;
    private javax.swing.JTextField tf_cari;
    // End of variables declaration//GEN-END:variables
}
