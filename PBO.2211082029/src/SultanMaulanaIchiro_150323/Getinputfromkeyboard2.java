/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SultanMaulanaIchiro_150323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author LABP1KOMP
 */
public class Getinputfromkeyboard2 {
       public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String  nama = "";
        int nilai = 0;
        
        try {
            System.out.print("Please Enter Your Name : ");
            nama = dataIn.readLine();
            System.out.print("Nilai Matematika : ");
            nilai = Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Hello "+nama+"!");
        System.out.println("Nilai Matematika : "+nilai);
    } 
}
