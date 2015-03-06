package experiments.oop.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author x14435708
 */
public class FormAndQsGUI extends javax.swing.JFrame {

    /**
     * Creates new form FormAndQsGUI
     */
    public FormAndQsGUI() {
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

        BiologyPg = new javax.swing.JButton();
        ChemistryPg = new javax.swing.JButton();
        PhysicsPg = new javax.swing.JButton();
        home = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 415));
        getContentPane().setLayout(null);

        BiologyPg.setText("Biology");
        BiologyPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiologyPgActionPerformed(evt);
            }
        });
        getContentPane().add(BiologyPg);
        BiologyPg.setBounds(172, 64, 103, 50);

        ChemistryPg.setText("Chemistry");
        ChemistryPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChemistryPgActionPerformed(evt);
            }
        });
        getContentPane().add(ChemistryPg);
        ChemistryPg.setBounds(172, 180, 103, 50);

        PhysicsPg.setText("Physics");
        PhysicsPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhysicsPgActionPerformed(evt);
            }
        });
        getContentPane().add(PhysicsPg);
        PhysicsPg.setBounds(172, 289, 103, 50);

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(0, 0, 70, 23);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/6805727-plain-backgrounds.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, 0, 455, 415);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BiologyPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiologyPgActionPerformed
        // TODO add your handling code here:
        BioPg myBioPg = new BioPg();
        myBioPg.setVisible(true);
        dispose();
    }//GEN-LAST:event_BiologyPgActionPerformed

    private void ChemistryPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChemistryPgActionPerformed
        // TODO add your handling code here:
        ChemPg myChemPg = new ChemPg();
        myChemPg.setVisible(true);
        dispose();
    }//GEN-LAST:event_ChemistryPgActionPerformed

    private void PhysicsPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhysicsPgActionPerformed
        // TODO add your handling code here:
        PhysPg myPhysPg = new PhysPg();
        myPhysPg.setVisible(true);
        dispose();
    }//GEN-LAST:event_PhysicsPgActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        MainMenu myMainMenu = new MainMenu();
        myMainMenu.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(FormAndQsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAndQsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAndQsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAndQsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAndQsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BiologyPg;
    private javax.swing.JButton ChemistryPg;
    private javax.swing.JButton PhysicsPg;
    private javax.swing.JLabel background;
    private javax.swing.JButton home;
    // End of variables declaration//GEN-END:variables
}
