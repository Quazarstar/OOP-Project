/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments.oop.project;

/**
 *
 * @author Alex
 */
public class Ol3 extends javax.swing.JFrame {

    /**
     * Creates new form Ol3
     */
    public Ol3() {
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

        olImage = new javax.swing.JLabel();
        homeButtonOL3 = new javax.swing.JButton();
        olImageButton = new javax.swing.JButton();
        stepsOl3 = new javax.swing.JButton();
        ol3ScrollPane = new javax.swing.JScrollPane();
        textOl3 = new javax.swing.JTextArea();
        descOl3 = new javax.swing.JLabel();
        Physicshead = new javax.swing.JLabel();
        backgroundOl3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 415));
        getContentPane().setLayout(null);

        olImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/quimica.jpg"))); // NOI18N
        getContentPane().add(olImage);
        olImage.setBounds(130, 30, 180, 100);

        homeButtonOL3.setText("Home");
        homeButtonOL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonOL3ActionPerformed(evt);
            }
        });
        getContentPane().add(homeButtonOL3);
        homeButtonOL3.setBounds(0, 0, 80, 23);

        olImageButton.setText("Click to see image of experiement.");
        olImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olImageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(olImageButton);
        olImageButton.setBounds(110, 350, 230, 23);

        stepsOl3.setText("Steps");
        stepsOl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepsOl3ActionPerformed(evt);
            }
        });
        getContentPane().add(stepsOl3);
        stepsOl3.setBounds(370, 130, 60, 23);

        ol3ScrollPane.setToolTipText("");

        textOl3.setColumns(20);
        textOl3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        textOl3.setLineWrap(true);
        textOl3.setRows(5);
        textOl3.setText("Investigate the relationship between the extension of a spring and the applied force.\n\nEquipment required.\n1. Newton-meter or weights\n2. Ruler\n3. Spring\n4. Metal bar.");
        ol3ScrollPane.setViewportView(textOl3);

        getContentPane().add(ol3ScrollPane);
        ol3ScrollPane.setBounds(10, 160, 420, 210);

        descOl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        descOl3.setText("Description of experiment. Click here to go to steps:");
        getContentPane().add(descOl3);
        descOl3.setBounds(10, 134, 360, 20);

        Physicshead.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Physicshead.setText("Physics Experiment");
        getContentPane().add(Physicshead);
        Physicshead.setBounds(160, 0, 320, 30);

        backgroundOl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/6805727-plain-backgrounds.jpg"))); // NOI18N
        backgroundOl3.setText("jLabel1");
        getContentPane().add(backgroundOl3);
        backgroundOl3.setBounds(0, 0, 440, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonOL3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonOL3ActionPerformed
        MainMenu myMainMenu = new MainMenu();
        myMainMenu.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonOL3ActionPerformed

    private void stepsOl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepsOl3ActionPerformed
        Ol3steps myOl3steps = new Ol3steps();
        myOl3steps.setVisible(true);
        dispose();
    }//GEN-LAST:event_stepsOl3ActionPerformed

    private void olImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olImageButtonActionPerformed
        Ol3image mySpring = new Ol3image();
        mySpring.setVisible(true);
        dispose();
    }//GEN-LAST:event_olImageButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Ol3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ol3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ol3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ol3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ol3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Physicshead;
    private javax.swing.JLabel backgroundOl3;
    private javax.swing.JLabel descOl3;
    private javax.swing.JButton homeButtonOL3;
    private javax.swing.JScrollPane ol3ScrollPane;
    private javax.swing.JLabel olImage;
    private javax.swing.JButton olImageButton;
    private javax.swing.JButton stepsOl3;
    private javax.swing.JTextArea textOl3;
    // End of variables declaration//GEN-END:variables
}
