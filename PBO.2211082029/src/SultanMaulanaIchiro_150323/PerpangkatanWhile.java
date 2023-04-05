/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SultanMaulanaIchiro_150323;
import java.util.Scanner;
/**
 *
 * @author LABP1KOMP
 */
public class PerpangkatanWhile {
         public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("masukkan angka : ");
     int input = in.nextInt();

     System.out.println("masukkan pangkat : ");
     int pangkat = in.nextInt();

     int i = 1;
     int h = 1;

     while (i<=pangkat){
     h = h*input;
     i++;
     }
     System.out.println(input + " ^ " +pangkat +" = " +h);

     }
}
