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
public class Ol2steps extends javax.swing.JFrame {

    /**
     * Creates new form Ol2steps
     */
    public Ol2steps() {
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

        placeholderol2 = new javax.swing.JLabel();
        backOlstep2 = new javax.swing.JButton();
        homeButtonOl2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stepsareaol2 = new javax.swing.JTextArea();
        StepsdescOl2 = new javax.swing.JLabel();
        Chemistrystepshead = new javax.swing.JLabel();
        Ol2stepsbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 415));
        getContentPane().setLayout(null);

        placeholderol2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/quimica.jpg"))); // NOI18N
        getContentPane().add(placeholderol2);
        placeholderol2.setBounds(130, 30, 180, 100);

        backOlstep2.setText("Back");
        backOlstep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backOlstep2ActionPerformed(evt);
            }
        });
        getContentPane().add(backOlstep2);
        backOlstep2.setBounds(0, 0, 80, 23);

        homeButtonOl2.setText("Home");
        homeButtonOl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonOl2ActionPerformed(evt);
            }
        });
        getContentPane().add(homeButtonOl2);
        homeButtonOl2.setBounds(0, 20, 80, 23);

        stepsareaol2.setColumns(20);
        stepsareaol2.setLineWrap(true);
        stepsareaol2.setRows(5);
        stepsareaol2.setText("Step 1:\nStep 2:\nStep 3:\nStep 4:\nStep 5:\nStep 6:\nStep 7:\nStep 8:\nStep 9:\nStep 10:\nstep 11:\nstep 12:\nstep 13:");
        jScrollPane1.setViewportView(stepsareaol2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 160, 440, 220);

        StepsdescOl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StepsdescOl2.setText("Outline of steps required to conduct experiment. ");
        getContentPane().add(StepsdescOl2);
        StepsdescOl2.setBounds(40, 130, 360, 20);

        Chemistrystepshead.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Chemistrystepshead.setText("Chemistry experiment steps.");
        getContentPane().add(Chemistrystepshead);
        Chemistrystepshead.setBounds(120, 0, 320, 30);

        Ol2stepsbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/6805727-plain-backgrounds.jpg"))); // NOI18N
        Ol2stepsbg.setText("jLabel1");
        getContentPane().add(Ol2stepsbg);
        Ol2stepsbg.setBounds(0, 0, 440, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backOlstep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backOlstep2ActionPerformed
        Ol2 myOl2 = new Ol2();
        myOl2.setVisible(true);
        dispose();
    }//GEN-LAST:event_backOlstep2ActionPerformed

    private void homeButtonOl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonOl2ActionPerformed
        MainMenu myMainMenu = new MainMenu();
        myMainMenu.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonOl2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ol2steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ol2steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ol2steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ol2steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ol2steps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Chemistrystepshead;
    private javax.swing.JLabel Ol2stepsbg;
    private javax.swing.JLabel StepsdescOl2;
    private javax.swing.JButton backOlstep2;
    private javax.swing.JButton homeButtonOl2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel placeholderol2;
    private javax.swing.JTextArea stepsareaol2;
    // End of variables declaration//GEN-END:variables
}
