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
public class Hl2 extends javax.swing.JFrame {

    /**
     * Creates new form Hl2
     */
    public Hl2() {
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

        backEx2 = new javax.swing.JButton();
        hl2placeholder = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hl2text = new javax.swing.JTextArea();
        hl2steps = new javax.swing.JButton();
        Hl2desc = new javax.swing.JLabel();
        homeButtonHL = new javax.swing.JButton();
        Chemistryheader = new javax.swing.JLabel();
        backgroundEx2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 415));
        getContentPane().setLayout(null);

        backEx2.setText("Back");
        backEx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backEx2ActionPerformed(evt);
            }
        });
        getContentPane().add(backEx2);
        backEx2.setBounds(0, 0, 80, 23);

        hl2placeholder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/art4098_1.jpg"))); // NOI18N
        getContentPane().add(hl2placeholder);
        hl2placeholder.setBounds(130, 30, 180, 100);

        jScrollPane1.setToolTipText("");

        hl2text.setColumns(20);
        hl2text.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        hl2text.setLineWrap(true);
        hl2text.setRows(5);
        hl2text.setText("This is where a general description of the selectedexperiment will be displayed along with equipment required at the bottom of the description.\n\nEquipment required: N/A");
        jScrollPane1.setViewportView(hl2text);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 420, 210);

        hl2steps.setText("Steps");
        hl2steps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hl2stepsActionPerformed(evt);
            }
        });
        getContentPane().add(hl2steps);
        hl2steps.setBounds(370, 130, 60, 23);

        Hl2desc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Hl2desc.setText("Description of experiment. Click here to go to steps:");
        getContentPane().add(Hl2desc);
        Hl2desc.setBounds(10, 134, 360, 20);

        homeButtonHL.setText("Home");
        homeButtonHL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonHLActionPerformed(evt);
            }
        });
        getContentPane().add(homeButtonHL);
        homeButtonHL.setBounds(0, 20, 80, 23);

        Chemistryheader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Chemistryheader.setText("Chemistry experiment");
        getContentPane().add(Chemistryheader);
        Chemistryheader.setBounds(140, 0, 320, 30);

        backgroundEx2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/6805727-plain-backgrounds.jpg"))); // NOI18N
        backgroundEx2.setText("jLabel1");
        getContentPane().add(backgroundEx2);
        backgroundEx2.setBounds(0, 0, 440, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backEx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backEx2ActionPerformed
        OOProjectHigherLevel myOOProjectHigherLevel = new OOProjectHigherLevel();
        myOOProjectHigherLevel.setVisible(true);
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_backEx2ActionPerformed

    private void hl2stepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hl2stepsActionPerformed
        Hl2steps myHl2steps = new Hl2steps();
        myHl2steps.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_hl2stepsActionPerformed

    private void homeButtonHLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonHLActionPerformed
        MainMenu myMainMenu = new MainMenu();
        myMainMenu.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonHLActionPerformed

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
            java.util.logging.Logger.getLogger(Hl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hl2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Chemistryheader;
    private javax.swing.JLabel Hl2desc;
    private javax.swing.JButton backEx2;
    private javax.swing.JLabel backgroundEx2;
    private javax.swing.JLabel hl2placeholder;
    private javax.swing.JButton hl2steps;
    private javax.swing.JTextArea hl2text;
    private javax.swing.JButton homeButtonHL;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
