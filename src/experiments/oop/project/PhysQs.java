package experiments.oop.project;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author x14435708
 */
public class PhysQs extends javax.swing.JFrame {
private ArrayList <Question> Pqlist;
private String Panswer;
private int PACount;
    /**
    /**
     * Creates new form PhysQs
     */
    public PhysQs() {
        initComponents();
        Pqlist = new ArrayList <>();
        Panswer = new String();
        PACount = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        Psubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pqField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        PAfield = new javax.swing.JTextArea();
        Pnextq = new javax.swing.JButton();
        DisplayAnsP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 415));

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Psubmit.setText("submit");
        Psubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsubmitActionPerformed(evt);
            }
        });

        pqField.setEditable(false);
        pqField.setColumns(20);
        pqField.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        pqField.setRows(5);
        pqField.setText("__________ is the change in \ndirection of a beam of light when \nit enters from one medium to \nanother.");
        jScrollPane1.setViewportView(pqField);

        PAfield.setColumns(20);
        PAfield.setRows(5);
        PAfield.setText("Please enter answer here!");
        jScrollPane2.setViewportView(PAfield);

        Pnextq.setText("next");
        Pnextq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnextqActionPerformed(evt);
            }
        });

        DisplayAnsP.setText("Display Answers");
        DisplayAnsP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayAnsPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Psubmit)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Pnextq)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DisplayAnsP)
                        .addGap(168, 168, 168))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Back)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Psubmit)
                .addGap(18, 18, 18)
                .addComponent(DisplayAnsP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(Pnextq)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        PhysPg myPhysPg = new PhysPg();
        myPhysPg.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed
int nextPhys =0;
    private void PnextqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnextqActionPerformed
        // TODO add your handling code here:
                        nextPhys++;
        int Pcount = 0;
while(Pcount <= nextPhys){
    if(nextPhys==1){
    Pnextq.setVisible(false);
    pqField.setText("Question 2: what is used to show that"
            + "\nwhite light is a spectrum of colors? ");
    }
Pcount++;
}
Psubmit.setEnabled(true);
    }//GEN-LAST:event_PnextqActionPerformed

    private void PsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsubmitActionPerformed
        // TODO add your handling code here:
          Panswer = PAfield.getText();
        
        Question q = new Question();
        q.setAnswer(Panswer);
        
        //add object to arraylist
        Pqlist.add(q);
        
        PACount++;
        Psubmit.setEnabled(false);
    }//GEN-LAST:event_PsubmitActionPerformed

    private void DisplayAnsPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayAnsPActionPerformed
        // TODO add your handling code here:
          int confirmAns = 0; 
            int number = 0;
        String confirm[] = new String[2];
        confirm[0] = "Correct!";
        confirm[1] = "incorrect";
        
        String Correct[] = new String[2];
        Correct[0]= "refraction";
        Correct[1]= "prism";
       
        for(int i = 0; i < Pqlist.size();i++){
            if(Pqlist.get(i).getAnswer().equals(Correct[i])){
             confirmAns = 0;
            }
            else{
            confirmAns = 1;
            }
            number++;
            JOptionPane.showMessageDialog(null,"for question "+number+" your answer is: "+ Pqlist.get(i).getAnswer()+" It is "+confirm[confirmAns]+" The correct answer is: "+Correct[i]);
        }
        
    }//GEN-LAST:event_DisplayAnsPActionPerformed

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
            java.util.logging.Logger.getLogger(PhysQs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhysQs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhysQs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhysQs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhysQs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton DisplayAnsP;
    private javax.swing.JTextArea PAfield;
    private javax.swing.JButton Pnextq;
    private javax.swing.JButton Psubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea pqField;
    // End of variables declaration//GEN-END:variables
}
