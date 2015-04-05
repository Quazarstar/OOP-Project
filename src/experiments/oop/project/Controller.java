/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package experiments.oop.project;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


/**
 *
 * @author david
 */
public class Controller {
    private String cycle;
    private String subject;
    
    public void setCycle(String cycle){
        this.cycle = cycle;
        }
    
    public void setSubject(String subject){
        this.subject = subject;
        }
    
    public void writeOpt(){
        try{
                FileWriter fw = new FileWriter("selection.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(cycle);
                bw.close();
                JOptionPane.showMessageDialog(null, cycle);
                
                FileWriter fw2 = new FileWriter("selection2.txt");
                BufferedWriter bw2 = new BufferedWriter(fw2);
                bw2.write(subject);
                bw2.close();
                
        }
        catch(IOException e){JOptionPane.showMessageDialog(null, "We have an issue");}
    }
    
    public void readIn(){
            
    
    
    }
}
