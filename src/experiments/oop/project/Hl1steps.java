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
public class Hl1steps extends javax.swing.JFrame {

    /**
     * Creates new form Hl1steps
     */
    public Hl1steps() {
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

        hlImage = new javax.swing.JLabel();
        backEx1 = new javax.swing.JButton();
        h1scrollsteps = new javax.swing.JScrollPane();
        stepsarea1 = new javax.swing.JTextArea();
        hl1desc = new javax.swing.JLabel();
        homeButtonHL = new javax.swing.JButton();
        biologySteps1Header = new javax.swing.JLabel();
        hl1stepsbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 415));
        getContentPane().setLayout(null);

        hlImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/art4098_1.jpg"))); // NOI18N
        getContentPane().add(hlImage);
        hlImage.setBounds(130, 30, 180, 100);

        backEx1.setText("Back");
        backEx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backEx1ActionPerformed(evt);
            }
        });
        getContentPane().add(backEx1);
        backEx1.setBounds(0, 0, 80, 23);

        stepsarea1.setColumns(20);
        stepsarea1.setLineWrap(true);
        stepsarea1.setRows(5);
        stepsarea1.setText("1. Label a piece of brown paper (or filter paper) as fat.\n2. Place a small piece of butter or cooking oil on the paper\n3. Rub the paper after folding it over.\n4. Repeat this process using a few drops of water on another piece of paper labelled \"water\". (This acts as a control.)\n5. Leave the two pieces of paper over a radiator or heat source to dry.\n6. The butter or fat will produce a permanent stain on the paper, where as the water will not.");
        h1scrollsteps.setViewportView(stepsarea1);

        getContentPane().add(h1scrollsteps);
        h1scrollsteps.setBounds(0, 160, 440, 220);

        hl1desc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hl1desc.setText("Outline of steps required to conduct experiment. ");
        getContentPane().add(hl1desc);
        hl1desc.setBounds(40, 130, 360, 20);

        homeButtonHL.setText("Home");
        homeButtonHL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonHLActionPerformed(evt);
            }
        });
        getContentPane().add(homeButtonHL);
        homeButtonHL.setBounds(0, 20, 80, 23);

        biologySteps1Header.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        biologySteps1Header.setText("Biology experiment steps.");
        getContentPane().add(biologySteps1Header);
        biologySteps1Header.setBounds(130, 0, 320, 30);

        hl1stepsbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/6805727-plain-backgrounds.jpg"))); // NOI18N
        hl1stepsbg.setText("jLabel1");
        getContentPane().add(hl1stepsbg);
        hl1stepsbg.setBounds(0, 0, 440, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backEx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backEx1ActionPerformed
        Hl1 myHl1 = new Hl1();
        myHl1.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backEx1ActionPerformed

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
            java.util.logging.Logger.getLogger(Hl1steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hl1steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hl1steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hl1steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hl1steps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backEx1;
    private javax.swing.JLabel biologySteps1Header;
    private javax.swing.JScrollPane h1scrollsteps;
    private javax.swing.JLabel hl1desc;
    private javax.swing.JLabel hl1stepsbg;
    private javax.swing.JLabel hlImage;
    private javax.swing.JButton homeButtonHL;
    private javax.swing.JTextArea stepsarea1;
    // End of variables declaration//GEN-END:variables
}
