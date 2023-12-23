/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author Nguyen Linh,minh
 */
public class QuanLyThuVienPanel extends javax.swing.JFrame {
    public JPanel childpanel;
    public QuanLyThuVienPanel() {
        initComponents();     
        getContentPane().setBackground(Color.white); 
        childpanel = new TrangChuPanel();
        pnMain.removeAll();
        pnMain.add(childpanel);
        pnMain.validate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btTheDocGia = new javax.swing.JButton();
        btDauSach = new javax.swing.JButton();
        btPhieuMuonSach = new javax.swing.JButton();
        btPhieuTraSach = new javax.swing.JButton();
        btTrangChu = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        lbuser = new javax.swing.JLabel();
        btThongKe = new javax.swing.JButton();
        bHoaDon = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();

        jButton5.setBackground(new java.awt.Color(255, 153, 153));
        jButton5.setText("PHIẾU NHẬP SÁCH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205, 245, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, null));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 53, 106));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-library-50.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ THƯ VIỆN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(205, 245, 253));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, null));

        btTheDocGia.setBackground(new java.awt.Color(12, 53, 106));
        btTheDocGia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btTheDocGia.setForeground(new java.awt.Color(255, 255, 255));
        btTheDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-reading-50.png"))); // NOI18N
        btTheDocGia.setText("QUẢN LÝ THẺ ĐỘC GIẢ");
        btTheDocGia.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btTheDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTheDocGiaActionPerformed(evt);
            }
        });

        btDauSach.setBackground(new java.awt.Color(12, 53, 106));
        btDauSach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btDauSach.setForeground(new java.awt.Color(255, 255, 255));
        btDauSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-book-50.png"))); // NOI18N
        btDauSach.setText("QUẢN LÝ ĐẦU SÁCH");
        btDauSach.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btDauSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDauSachActionPerformed(evt);
            }
        });

        btPhieuMuonSach.setBackground(new java.awt.Color(12, 53, 106));
        btPhieuMuonSach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btPhieuMuonSach.setForeground(new java.awt.Color(255, 255, 255));
        btPhieuMuonSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-borrow-book-50.png"))); // NOI18N
        btPhieuMuonSach.setText("PHIẾU MƯỢN SÁCH");
        btPhieuMuonSach.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btPhieuMuonSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPhieuMuonSachActionPerformed(evt);
            }
        });

        btPhieuTraSach.setBackground(new java.awt.Color(12, 53, 106));
        btPhieuTraSach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btPhieuTraSach.setForeground(new java.awt.Color(255, 255, 255));
        btPhieuTraSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-return-book-50.png"))); // NOI18N
        btPhieuTraSach.setText("PHIẾU TRẢ SÁCH");
        btPhieuTraSach.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btPhieuTraSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPhieuTraSachActionPerformed(evt);
            }
        });

        btTrangChu.setBackground(new java.awt.Color(12, 53, 106));
        btTrangChu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        btTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-home-50.png"))); // NOI18N
        btTrangChu.setText("TRANG CHỦ");
        btTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrangChuActionPerformed(evt);
            }
        });

        btThoat.setForeground(new java.awt.Color(12, 53, 106));
        btThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-export-50.png"))); // NOI18N
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        lbuser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        btThongKe.setBackground(new java.awt.Color(12, 53, 106));
        btThongKe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-business-report-50.png"))); // NOI18N
        btThongKe.setText("BÁO CÁO THỐNG KÊ");
        btThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongKeActionPerformed(evt);
            }
        });

        bHoaDon.setBackground(new java.awt.Color(12, 53, 106));
        bHoaDon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        bHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bill.png"))); // NOI18N
        bHoaDon.setText("QUẢN LÝ HÓA ĐƠN");
        bHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lbuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDauSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPhieuMuonSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPhieuTraSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTheDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btTheDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDauSach, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPhieuMuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPhieuTraSach, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbuser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void bHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHoaDonActionPerformed
        // TODO add your handling code here:
        childpanel = new QuanLyHoaDonPanel();
        pnMain.removeAll();
        pnMain.add(childpanel);
        pnMain.validate();
    }//GEN-LAST:event_bHoaDonActionPerformed

    private void btThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongKeActionPerformed
        // TODO add your handling code here:
        childpanel = new BaoCaoThongKePanel();
        pnMain.removeAll();
        pnMain.add(childpanel);
        pnMain.validate();
    }//GEN-LAST:event_btThongKeActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất ","Xác nhận", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION){
            dispose();
            DangNhapPanel dangNhap = new DangNhapPanel();
            dangNhap.setVisible(true);
        }
    }//GEN-LAST:event_btThoatActionPerformed

    private void btTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrangChuActionPerformed
        // TODO add your handling code here:
        childpanel = new TrangChuPanel();
        pnMain.removeAll();
        pnMain.add(childpanel);
        pnMain.validate();
    }//GEN-LAST:event_btTrangChuActionPerformed

    private void btPhieuTraSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPhieuTraSachActionPerformed
        // TODO add your handling code here:
        //phieuTraSach.setVisible(true);

        childpanel = new QuanLyPhieuTraSachPanel();
        pnMain.removeAll();
        pnMain.add(childpanel);
        pnMain.validate();
    }//GEN-LAST:event_btPhieuTraSachActionPerformed

    private void btPhieuMuonSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPhieuMuonSachActionPerformed
        // TODO add your handling code here:
        //phieuMuonSach.setVisible(true);
        childpanel = new QuanLyPhieuMuonSachPanel();
        pnMain.removeAll();
        pnMain.add(childpanel);
        pnMain.validate();
    }//GEN-LAST:event_btPhieuMuonSachActionPerformed

    private void btDauSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDauSachActionPerformed
        // TODO add your handling code here:
        //quanLyDauSach.setVisible(true);
        childpanel = new QuanLyDauSachPanel();
        pnMain.removeAll();
        pnMain.add(childpanel);
        pnMain.validate();
    }//GEN-LAST:event_btDauSachActionPerformed

    private void btTheDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTheDocGiaActionPerformed
        // TODO add your handling code here:
        //quanLyTheDocGia.setVisible(true);
        childpanel = new QuanLyTheDocGiaPanel();
        pnMain.removeAll();
        pnMain.add(childpanel);
        pnMain.validate();
    }//GEN-LAST:event_btTheDocGiaActionPerformed

    public static void main(String args[]) {  
        java.awt.EventQueue.invokeLater(() -> {
            new DangNhapPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHoaDon;
    private javax.swing.JButton btDauSach;
    private javax.swing.JButton btPhieuMuonSach;
    private javax.swing.JButton btPhieuTraSach;
    private javax.swing.JButton btTheDocGia;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btThongKe;
    private javax.swing.JButton btTrangChu;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbuser;
    private javax.swing.JPanel pnMain;
    // End of variables declaration//GEN-END:variables
}
