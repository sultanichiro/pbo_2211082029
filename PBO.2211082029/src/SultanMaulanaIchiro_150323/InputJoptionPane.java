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
public class InputJoptionPane {
         public static void main(String[] args){
        String name = "";
        name =JOptionPane.showInputDialog("Please Enter Your Name -");
        String msg = "Hello "+name+"!";
        JOptionPane.showMessageDialog(null, msg);
}
}
