package com.kingaspx.DownloadVideo.menu;

import com.kingaspx.DownloadVideo.util.Downloader;
import java.awt.Color;
import java.io.File;

public class DownloadModal extends javax.swing.JDialog {

    private Downloader downloader;

    public DownloadModal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel4 = new keeptoo.KGradientPanel();
        jButton1 = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel4.setkBorderRadius(190);
        kGradientPanel4.setkEndColor(new java.awt.Color(206, 32, 31));
        kGradientPanel4.setkStartColor(new java.awt.Color(206, 32, 31));
        kGradientPanel4.setOpaque(false);
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/DownloadVideo/icon/download_icon.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        getContentPane().add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 60, 60));

        kGradientPanel2.setkBorderRadius(190);
        kGradientPanel2.setkEndColor(new java.awt.Color(206, 32, 31));
        kGradientPanel2.setkStartColor(new java.awt.Color(206, 32, 31));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/DownloadVideo/icon/logo_icon25x.png"))); // NOI18N
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 80));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 120, 120));

        kGradientPanel3.setkBorderRadius(190);
        kGradientPanel3.setkEndColor(new java.awt.Color(30, 30, 30));
        kGradientPanel3.setkStartColor(new java.awt.Color(30, 30, 30));
        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 140, 140));

        kGradientPanel1.setkEndColor(new java.awt.Color(45, 45, 45));
        kGradientPanel1.setkStartColor(new java.awt.Color(45, 45, 45));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Simply paste your link here");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(45, 45, 45));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 550, 10));

        jPanel1.setBackground(new java.awt.Color(45, 45, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(45, 45, 45));
        jTextField1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Paste here...");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 480, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/DownloadVideo/icon/link_icon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 550, 40));

        kGradientPanel5.setkBorderRadius(190);
        kGradientPanel5.setkEndColor(new java.awt.Color(30, 30, 30));
        kGradientPanel5.setkStartColor(new java.awt.Color(30, 30, 30));
        kGradientPanel5.setOpaque(false);
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel1.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 80, 80));
        kGradientPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 550, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 790, 310));

        setSize(new java.awt.Dimension(925, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        downloader = new Downloader(jProgressBar1, jTextField1.getText());
        
        File image = new File("image.webp");
        if (image.exists()) {
            image.delete();
            downloader.start();
        } else {
            downloader.start();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DownloadModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DownloadModal dialog = new DownloadModal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    // End of variables declaration//GEN-END:variables
}
