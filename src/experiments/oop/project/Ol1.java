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
public class Ol1 extends javax.swing.JFrame {

    /**
     * Creates new form Ol1
     */
    public Ol1() {
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

        placeholderol1 = new javax.swing.JLabel();
        backOl1 = new javax.swing.JButton();
        homeButtonOL1 = new javax.swing.JButton();
        imageol1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textOl1 = new javax.swing.JTextArea();
        stepsOl1 = new javax.swing.JButton();
        descOl1 = new javax.swing.JLabel();
        Biologyheader = new javax.swing.JLabel();
        backgroundOl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 415));
        getContentPane().setLayout(null);

        placeholderol1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/art4098_1.jpg"))); // NOI18N
        getContentPane().add(placeholderol1);
        placeholderol1.setBounds(130, 30, 180, 100);

        backOl1.setText("Back");
        backOl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backOl1ActionPerformed(evt);
            }
        });
        getContentPane().add(backOl1);
        backOl1.setBounds(0, 0, 80, 23);

        homeButtonOL1.setText("Home");
        homeButtonOL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonOL1ActionPerformed(evt);
            }
        });
        getContentPane().add(homeButtonOL1);
        homeButtonOL1.setBounds(0, 20, 80, 23);

        imageol1.setText("Click to see image of experiement.");
        imageol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageol1ActionPerformed(evt);
            }
        });
        getContentPane().add(imageol1);
        imageol1.setBounds(110, 350, 230, 23);

        jScrollPane1.setToolTipText("");

        textOl1.setColumns(20);
        textOl1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        textOl1.setLineWrap(true);
        textOl1.setRows(5);
        textOl1.setText("Investigate the action of amylase on starch; identify the substrate, product and enzyme. \nEquipment required: \n1. Four beakers. \n2. A dripper and test solution. \n3. Starch solution.\n4. Salivary amylase.\n5. Water.\n6. Water bath.");
        jScrollPane1.setViewportView(textOl1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 420, 210);

        stepsOl1.setText("Steps");
        stepsOl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepsOl1ActionPerformed(evt);
            }
        });
        getContentPane().add(stepsOl1);
        stepsOl1.setBounds(370, 130, 60, 23);

        descOl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        descOl1.setText("Description of experiment. Click here to go to steps:");
        getContentPane().add(descOl1);
        descOl1.setBounds(10, 134, 360, 20);

        Biologyheader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Biologyheader.setText("Biology experiment");
        getContentPane().add(Biologyheader);
        Biologyheader.setBounds(150, 0, 320, 30);

        backgroundOl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/6805727-plain-backgrounds.jpg"))); // NOI18N
        backgroundOl1.setText("jLabel1");
        getContentPane().add(backgroundOl1);
        backgroundOl1.setBounds(0, 0, 440, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backOl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backOl1ActionPerformed
        OOProjectOrdinaryLevel myOOProjectOrdinaryLevel = new OOProjectOrdinaryLevel();
        myOOProjectOrdinaryLevel.setVisible(true);
        dispose();
    }//GEN-LAST:event_backOl1ActionPerformed

    private void stepsOl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepsOl1ActionPerformed
        Ol1steps myOl1steps = new Ol1steps();
        myOl1steps.setVisible(true);
        dispose();
    }//GEN-LAST:event_stepsOl1ActionPerformed

    private void homeButtonOL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonOL1ActionPerformed
        MainMenu myMainMenu = new MainMenu();
        myMainMenu.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonOL1ActionPerformed

    private void imageol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageol1ActionPerformed
        amylase myAmylase = new amylase();
        myAmylase.setVisible(true);
        dispose();
    }//GEN-LAST:event_imageol1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ol1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ol1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ol1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ol1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ol1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Biologyheader;
    private javax.swing.JButton backOl1;
    private javax.swing.JLabel backgroundOl1;
    private javax.swing.JLabel descOl1;
    private javax.swing.JButton homeButtonOL1;
    private javax.swing.JButton imageol1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel placeholderol1;
    private javax.swing.JButton stepsOl1;
    private javax.swing.JTextArea textOl1;
    // End of variables declaration//GEN-END:variables
}
