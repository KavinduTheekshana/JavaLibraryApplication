/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibraryapplication;

import javax.swing.JOptionPane;

/**
 *
 * @author Kavindu Theekshana
 */
public class JavaBankApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        new Dashboard().setVisible(true);
    
        Splash s = new Splash();
        s.setVisible(true);
        login l = new login();
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(30);
                s.jProgressBar1.setValue(i);
                if(i==100){
                    s.setVisible(false);
                    l.setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
}
