/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfield1;
import java.awt.*; 
import java.awt.event.*;
/**
 *
 * @author adrian
 */
public class Textfield1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f= new Frame("Latihan TextField");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        TextField t1,t2;  
        t1=new TextField("Selamat datang di latihan TextField.");  
        t1.setBounds(60,100, 200,30);  
        t2=new TextField("AWT Tutorial TextField");  
        t2.setBounds(60,150, 200,30);  
        f.add(t1); f.add(t2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }
    
}
