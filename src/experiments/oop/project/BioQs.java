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
import experiments.oop.project.Question;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BioQs extends javax.swing.JFrame {
private ArrayList <Question> Bqlist;
private String Banswer;
private int BACount;
    /**
     * Creates new form BioQs
     */
    Question a = new Question();
    public BioQs() {
        initComponents();
        Bqlist = new ArrayList <>();
        Banswer = new String();
        BACount = 0;
        
  
        hideRadioButtons();
    }
    private void hideRadioButtons(){
    bradio1q1.setVisible(false);
    bradio2q1.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        Bnextq = new javax.swing.JButton();
        Bsubmit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bqField = new javax.swing.JTextArea();
        DisplayAnsB = new javax.swing.JButton();
        bradio1q1 = new javax.swing.JRadioButton();
        bradio2q1 = new javax.swing.JRadioButton();
        bAns = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 415));
        getContentPane().setLayout(null);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(0, 0, 57, 23);

        Bnextq.setText("next");
        Bnextq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnextqActionPerformed(evt);
            }
        });
        getContentPane().add(Bnextq);
        Bnextq.setBounds(370, 360, 57, 23);

        Bsubmit.setText("submit");
        Bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Bsubmit);
        Bsubmit.setBounds(210, 290, 90, 23);

        bqField.setEditable(false);
        bqField.setColumns(20);
        bqField.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        bqField.setRows(5);
        bqField.setText("question 1: where do plants get their \ngreen color");
        jScrollPane2.setViewportView(bqField);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(90, 20, 340, 120);

        DisplayAnsB.setText("Display answers ");
        DisplayAnsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayAnsBActionPerformed(evt);
            }
        });
        getContentPane().add(DisplayAnsB);
        DisplayAnsB.setBounds(190, 360, 130, 23);

        bradio1q1.setText("converting light energy to chemical energy ");
        bradio1q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bradio1q1ActionPerformed(evt);
            }
        });
        getContentPane().add(bradio1q1);
        bradio1q1.setBounds(90, 210, 340, 23);

        bradio2q1.setText("converting cemical energy to light energy");
        bradio2q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bradio2q1ActionPerformed(evt);
            }
        });
        getContentPane().add(bradio2q1);
        bradio2q1.setBounds(90, 250, 340, 23);

        bAns.setText("Please enter answer here!");
        getContentPane().add(bAns);
        bAns.setBounds(90, 170, 340, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        BioPg myBioPg = new BioPg();
        myBioPg.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed
int nextBio = 0;
    private void BnextqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnextqActionPerformed
        // TODO add your handling code here:
        bAns.setText("");
        String bQuestion[] = new String[5];
        bQuestion[1]="Question 2:complete the sentence"
                + "\n The molecules are moved and \n converted in the area are \n" +
                "called the _______";
        bQuestion[2]="Question 3:When the ATP is used "
            + "to \n make glucose what is the cycle\n"
            + "called the _______ cycle";
        bQuestion[3]="Question 4:complete the sentence"
            + "\nthe process of photosynthesis"
            + "\n is devided into 2 parts the "
            + "\nlight dependant reaction and "
            + "\nthe light _____ reaction?";
        bQuestion[4]="Question 5: select the answer"
                + "\nPhotosynthesis is the process of ";
         nextBio++;
        int Bcount = 0;
while(Bcount <= nextBio){
    if(nextBio==1){
        
    bqField.setText(bQuestion[1]);
    }
    else if(nextBio==2){
        
    bqField.setText(bQuestion[2]);
    }
    else if(nextBio==3){
    
    bqField.setText(bQuestion[3]);
    }
    else if(nextBio==4){
    bAns.setVisible(false);
    Bsubmit.setVisible(false);
    Bnextq.setVisible(false);
    bradio1q1.setVisible(true);
    bradio2q1.setVisible(true);
    bqField.setText(bQuestion[4]);
    }
Bcount++;
}
Bsubmit.setEnabled(true);
        
    }//GEN-LAST:event_BnextqActionPerformed

    private void BsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsubmitActionPerformed
        // get text from text field
         Banswer = bAns.getText();
        
        Question q = new Question();
        q.setAnswer(Banswer);
        
        //add object to arraylist
        Bqlist.add(q);
        
        BACount++;
        Bsubmit.setEnabled(false);
    }//GEN-LAST:event_BsubmitActionPerformed

    private void DisplayAnsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayAnsBActionPerformed
        // TODO add your handling code here:
            int confirmAns = 0;
        int number = 0;
        
        String confirm[] = new String[2];
        confirm[0] = "Correct!";
        confirm[1] = "incorrect";
       
        String CorrectAns[] = new String[4];
        CorrectAns[0]= "chloroplast";
        CorrectAns[1]= "stroma";
        CorrectAns[2]="calvin";
        CorrectAns[3]="independent";
        for(int i = 0; i < Bqlist.size();i++){
            if(Bqlist.get(i).getAnswer().equals(CorrectAns[i])){
             confirmAns = 0;
            }
            else{
            confirmAns = 1;
            }
            number++;
            JOptionPane.showMessageDialog(null,"for question "+number+" your answer is: "+ Bqlist.get(i).getAnswer()+" It is "+confirm[confirmAns]+" The correct answer is: "+CorrectAns[i]);
        }
        if(radioAns==1){
        JOptionPane.showMessageDialog(null,"You chose the first answer and it is correct");
        }
        else if(radioAns==2){
        JOptionPane.showMessageDialog(null,"You chose the second answer and it is incorrect");
        }
        else{
        JOptionPane.showMessageDialog(null,"you havnt dont the question yet");
        }
        
    }//GEN-LAST:event_DisplayAnsBActionPerformed
int radioAns = 0;
    private void bradio1q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bradio1q1ActionPerformed
        // TODO add your handling code here:
        bradio1q1.setEnabled(false);
        bradio2q1.setEnabled(false);
        
        radioAns = 1;
    }//GEN-LAST:event_bradio1q1ActionPerformed

    private void bradio2q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bradio2q1ActionPerformed
        // TODO add your handling code here:
        bradio1q1.setEnabled(false);
        bradio2q1.setEnabled(false);
        radioAns = 2;
    }//GEN-LAST:event_bradio2q1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BioQs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BioQs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bnextq;
    private javax.swing.JButton Bsubmit;
    private javax.swing.JButton DisplayAnsB;
    private javax.swing.JTextField bAns;
    private javax.swing.JButton back;
    private javax.swing.JTextArea bqField;
    private javax.swing.JRadioButton bradio1q1;
    private javax.swing.JRadioButton bradio2q1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
