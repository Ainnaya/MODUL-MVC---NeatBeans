package pack.view;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pack.control.c_koneksi;
import pack.control.controllerToko;
import pack.model.m_toko;

public class home extends javax.swing.JFrame{
    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();
    
    public home(){
        initComponents();
        ctoko = new controllerToko (this);
        ctoko.isiTable();}
    
    public JTextField getTxtKode(){
        return kodebarang;
    }
    public JTextField getTxtNama(){
        return namabarang;
    }
    public JTextField getTxtHarga(){
        return harga;
    }
    public JComboBox getCbKategori(){
        return kategoribarang;
    }
    public JComboBox getCbJenis(){
        return jenispackaging;
    }
    public JComboBox getCbCariKategori(){
        return kategorimakanan;
    }
    public JButton getButtonCari(){
        return cari;
    }
    public JButton getButtonHapus(){
        return hapus;
    }
    
    public JButton getButtonBersih(){
        return bersihkan;
    }
    public JButton getButtonSimpan(){
        return simpan;
    }
    public JButton getButtonUbah(){
        return ubah;
    }
    public JButton getButtonKeluar(){
        return keluar;
    }
    public JTable getTableData(){
        return tabel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        kodebarang = new javax.swing.JTextField();
        namabarang = new javax.swing.JTextField();
        jenispackaging = new javax.swing.JComboBox<>();
        kategoribarang = new javax.swing.JComboBox<>();
        keluar = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        bersihkan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kategorimakanan = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        cari = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 30));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Harga                        :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Kode Barang         :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nama Barang         :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Kategori Barang:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Jenis Packaging  :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        harga.setBackground(new java.awt.Color(51, 51, 51));
        harga.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        harga.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, -1));

        kodebarang.setBackground(new java.awt.Color(51, 51, 51));
        kodebarang.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        kodebarang.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.add(kodebarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 170, -1));

        namabarang.setBackground(new java.awt.Color(51, 51, 51));
        namabarang.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        namabarang.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.add(namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 170, -1));

        jenispackaging.setBackground(new java.awt.Color(51, 51, 51));
        jenispackaging.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jenispackaging.setForeground(new java.awt.Color(0, 153, 153));
        jenispackaging.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack 1", "Pack 2", "Pack 3" }));
        jPanel2.add(jenispackaging, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 170, -1));

        kategoribarang.setBackground(new java.awt.Color(51, 51, 51));
        kategoribarang.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        kategoribarang.setForeground(new java.awt.Color(0, 153, 153));
        kategoribarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Cemilan", "Sembako", "Permen" }));
        jPanel2.add(kategoribarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 170, -1));

        keluar.setBackground(new java.awt.Color(0, 0, 0));
        keluar.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        keluar.setForeground(new java.awt.Color(0, 153, 153));
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel2.add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 80, 50));

        simpan.setBackground(new java.awt.Color(0, 0, 0));
        simpan.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        simpan.setForeground(new java.awt.Color(0, 153, 153));
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel2.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 80, 50));

        ubah.setBackground(new java.awt.Color(0, 0, 0));
        ubah.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        ubah.setForeground(new java.awt.Color(0, 153, 153));
        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        jPanel2.add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 80, 50));

        bersihkan.setBackground(new java.awt.Color(0, 0, 0));
        bersihkan.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        bersihkan.setForeground(new java.awt.Color(0, 153, 153));
        bersihkan.setText("Bersihkan");
        bersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihkanActionPerformed(evt);
            }
        });
        jPanel2.add(bersihkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 160, 40));

        hapus.setBackground(new java.awt.Color(0, 0, 0));
        hapus.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        hapus.setForeground(new java.awt.Color(0, 153, 153));
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel2.add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 80, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 500, 180));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Pencarian Berdasarkan Kategori Makanan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 20));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Data Barang Ditoko");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 20));

        kategorimakanan.setBackground(new java.awt.Color(51, 51, 51));
        kategorimakanan.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        kategorimakanan.setForeground(new java.awt.Color(0, 153, 153));
        kategorimakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Cemilan", "Sembako", "Permen" }));
        jPanel1.add(kategorimakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 170, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Harga"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 140));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 500, 160));

        cari.setBackground(new java.awt.Color(0, 153, 153));
        cari.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        jPanel1.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 110, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Admin Toko:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_simpanActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_ubahActionPerformed

    private void bersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihkanActionPerformed
        ctoko.Reset();
    }//GEN-LAST:event_bersihkanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_hapusActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        ctoko.CariKategori();
        ctoko.isiTable();
    }//GEN-LAST:event_cariActionPerformed

    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new home().setVisible(true);}});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bersihkan;
    private javax.swing.JButton cari;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jenispackaging;
    private javax.swing.JComboBox<String> kategoribarang;
    private javax.swing.JComboBox<String> kategorimakanan;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField kodebarang;
    private javax.swing.JTextField namabarang;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
