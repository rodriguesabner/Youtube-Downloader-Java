package com.kingaspx.DownloadVideo;

import com.kingaspx.DownloadVideo.menu.DownloadModal;
import javax.swing.JFrame;

public class Main {

    public static DownloadModal downloadModal;

    public static void main(String[] args) {
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
        
        downloadModal = new DownloadModal(new JFrame(), false);
        downloadModal.setVisible(true);
    }
}
