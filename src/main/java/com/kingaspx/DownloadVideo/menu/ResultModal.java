package com.kingaspx.DownloadVideo.menu;

import static com.kingaspx.DownloadVideo.Main.downloadModal;
import static com.kingaspx.DownloadVideo.util.Downloader.openAudio;
import static com.kingaspx.DownloadVideo.util.Downloader.openVideo;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ResultModal extends javax.swing.JDialog {

    private File audio, video;

    public ResultModal(java.awt.Frame parent, boolean modal, String author, String title, String description, long views, BufferedImage image, File audio, File video) {
        super(parent, modal);
        initComponents();

        setBackground(new Color(0, 0, 0, 0));

        this.audio = audio;
        this.video = video;

        author_lbl.setText(author);
        title_lbl.setText(title);
        description_lbl.setText(description);
        views_lbl.setText("" + views);

        ImageIcon i = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(180, 170, Image.SCALE_DEFAULT));
        image_lbl.setIcon(i);

    }

    private ResultModal(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel6 = new keeptoo.KGradientPanel();
        jButton2 = new javax.swing.JButton();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jButton3 = new javax.swing.JButton();
        back_btn = new keeptoo.KGradientPanel();
        jButton1 = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        image_lbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        views_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description_lbl = new javax.swing.JTextArea();
        title_lbl = new javax.swing.JLabel();
        author_lbl = new javax.swing.JLabel();
        kGradientPanel8 = new keeptoo.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel6.setkBorderRadius(190);
        kGradientPanel6.setkEndColor(new java.awt.Color(206, 32, 31));
        kGradientPanel6.setkStartColor(new java.awt.Color(206, 32, 31));
        kGradientPanel6.setOpaque(false);
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/DownloadVideo/icon/video_icon.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        getContentPane().add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 60, 60));

        kGradientPanel7.setkBorderRadius(190);
        kGradientPanel7.setkEndColor(new java.awt.Color(206, 32, 31));
        kGradientPanel7.setkStartColor(new java.awt.Color(206, 32, 31));
        kGradientPanel7.setOpaque(false);
        kGradientPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/DownloadVideo/icon/audio_icon.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        kGradientPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        getContentPane().add(kGradientPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 60, 60));

        back_btn.setkBorderRadius(190);
        back_btn.setkEndColor(new java.awt.Color(206, 32, 31));
        back_btn.setkStartColor(new java.awt.Color(206, 32, 31));
        back_btn.setOpaque(false);
        back_btn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/DownloadVideo/icon/back_icon.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        back_btn.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 60, 60));

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

        image_lbl.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        image_lbl.setForeground(new java.awt.Color(255, 255, 255));
        image_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_lbl.setText("Image Here");
        kGradientPanel1.add(image_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, 170));

        jSeparator1.setBackground(new java.awt.Color(45, 45, 45));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 20, 190));

        kGradientPanel5.setkBorderRadius(190);
        kGradientPanel5.setkEndColor(new java.awt.Color(30, 30, 30));
        kGradientPanel5.setkStartColor(new java.awt.Color(30, 30, 30));
        kGradientPanel5.setOpaque(false);
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel1.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 80, 80));

        views_lbl.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        views_lbl.setForeground(new java.awt.Color(249, 249, 249));
        views_lbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        views_lbl.setText("Views: 0");
        kGradientPanel1.add(views_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 120, 20));

        description_lbl.setBackground(new java.awt.Color(45, 45, 45));
        description_lbl.setColumns(20);
        description_lbl.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        description_lbl.setForeground(new java.awt.Color(249, 249, 249));
        description_lbl.setLineWrap(true);
        description_lbl.setRows(5);
        description_lbl.setText("Description");
        description_lbl.setWrapStyleWord(true);
        jScrollPane1.setViewportView(description_lbl);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 490, 130));

        title_lbl.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        title_lbl.setForeground(new java.awt.Color(249, 249, 249));
        title_lbl.setText("Title");
        kGradientPanel1.add(title_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 360, -1));

        author_lbl.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        author_lbl.setForeground(new java.awt.Color(249, 249, 249));
        author_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        author_lbl.setText("Author: Abner");
        kGradientPanel1.add(author_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 490, -1));

        kGradientPanel8.setkBorderRadius(190);
        kGradientPanel8.setkEndColor(new java.awt.Color(30, 30, 30));
        kGradientPanel8.setkStartColor(new java.awt.Color(30, 30, 30));
        kGradientPanel8.setOpaque(false);
        kGradientPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel1.add(kGradientPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 80));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 790, 310));

        setSize(new java.awt.Dimension(954, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        downloadModal.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        openVideo(video);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        openAudio(audio);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ResultModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResultModal dialog = new ResultModal(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel author_lbl;
    private keeptoo.KGradientPanel back_btn;
    private javax.swing.JTextArea description_lbl;
    private javax.swing.JLabel image_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private javax.swing.JLabel title_lbl;
    private javax.swing.JLabel views_lbl;
    // End of variables declaration//GEN-END:variables
}
