/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jbtnQuanLySach = new javax.swing.JButton();
        jbtnQuanLyTaiKhoan = new javax.swing.JButton();
        jbtnQuanLyHoaDonNhap = new javax.swing.JButton();
        jbtnThongKe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnQuanLyHoaDonXuat = new javax.swing.JButton();
        jbtnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnQuanLySach.setBackground(new java.awt.Color(102, 255, 102));
        jbtnQuanLySach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnQuanLySach.setText("Quản lý sách");
        jbtnQuanLySach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQuanLySachActionPerformed(evt);
            }
        });

        jbtnQuanLyTaiKhoan.setBackground(new java.awt.Color(102, 255, 102));
        jbtnQuanLyTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnQuanLyTaiKhoan.setText("Quản lý nhân viên");
        jbtnQuanLyTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQuanLyTaiKhoanActionPerformed(evt);
            }
        });

        jbtnQuanLyHoaDonNhap.setBackground(new java.awt.Color(102, 255, 102));
        jbtnQuanLyHoaDonNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnQuanLyHoaDonNhap.setText("Quản lý hóa đơn nhập");
        jbtnQuanLyHoaDonNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQuanLyHoaDonNhapActionPerformed(evt);
            }
        });

        jbtnThongKe.setBackground(new java.awt.Color(102, 255, 102));
        jbtnThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnThongKe.setText("Thống kê");
        jbtnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThongKeActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("HỆ THỐNG QUẢN LÝ SÁCH CÔNG TY CAMPUS\n");

        jbtnQuanLyHoaDonXuat.setBackground(new java.awt.Color(102, 255, 102));
        jbtnQuanLyHoaDonXuat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnQuanLyHoaDonXuat.setText("Quản lý hóa đơn xuất");
        jbtnQuanLyHoaDonXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQuanLyHoaDonXuatActionPerformed(evt);
            }
        });

        jbtnDangXuat.setBackground(new java.awt.Color(102, 255, 102));
        jbtnDangXuat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnDangXuat.setText("Đăng xuất");
        jbtnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnQuanLyHoaDonNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnQuanLyTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnQuanLyHoaDonXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnQuanLySach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnQuanLyTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnQuanLySach, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnQuanLyHoaDonNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnQuanLyHoaDonXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnQuanLyTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQuanLyTaiKhoanActionPerformed
       QuanLyNhanVien qltk = new QuanLyNhanVien();
            qltk.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jbtnQuanLyTaiKhoanActionPerformed

    private void jbtnQuanLySachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQuanLySachActionPerformed
       QuanLySach qls = new QuanLySach();
            qls.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jbtnQuanLySachActionPerformed

    private void jbtnQuanLyHoaDonNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQuanLyHoaDonNhapActionPerformed
            QuanLyHoaDonNhap qlhdn = new QuanLyHoaDonNhap();
            qlhdn.xuatMaSach();
            qlhdn.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jbtnQuanLyHoaDonNhapActionPerformed

    private void jbtnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThongKeActionPerformed
        ThongKeSach tk = new ThongKeSach();
        tk.xuatMaSach();
            tk.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jbtnThongKeActionPerformed

    private void jbtnQuanLyHoaDonXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQuanLyHoaDonXuatActionPerformed
       QuanLyHoaDonXuat qlhdx = new QuanLyHoaDonXuat();
       qlhdx.xuatMaSach();
            qlhdx.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jbtnQuanLyHoaDonXuatActionPerformed

    private void jbtnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDangXuatActionPerformed
            Menu mn = new Menu();
            mn.setVisible(false);
            this.dispose();
            DangNhap dn=new DangNhap();
            dn.setVisible(true);
            
    }//GEN-LAST:event_jbtnDangXuatActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnDangXuat;
    private javax.swing.JButton jbtnQuanLyHoaDonNhap;
    private javax.swing.JButton jbtnQuanLyHoaDonXuat;
    private javax.swing.JButton jbtnQuanLySach;
    private javax.swing.JButton jbtnQuanLyTaiKhoan;
    private javax.swing.JButton jbtnThongKe;
    // End of variables declaration//GEN-END:variables
}
