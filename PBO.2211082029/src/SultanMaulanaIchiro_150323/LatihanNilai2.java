/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SultanMaulanaIchiro_150323;
import javax.swing.JOptionPane;
/**
 *
 * @author LABP1KOMP
 */
public class LatihanNilai2 {
        public static void main(String [] args){
        int a = 0,
            b = 0,
            c = 0;
        int avg;
    
    a = Integer.parseInt (JOptionPane.showInputDialog("nilai 1"));
    b = Integer.parseInt (JOptionPane.showInputDialog("Nilai 2"));
    c = Integer.parseInt (JOptionPane.showInputDialog("Nilai 3"));
    
    avg = (a+b+c)/3;
    
    String msg = "rata-rata "+avg;
    JOptionPane.showMessageDialog(null, msg);
    
    if (avg >= 60){
        String smiley = ":)";
    JOptionPane.showMessageDialog(null, smiley);
    }
    else {
        String nsmiley = ":(";
    JOptionPane.showMessageDialog(null,nsmiley);
    }
    } 
}
