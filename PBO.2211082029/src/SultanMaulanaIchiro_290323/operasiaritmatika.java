/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SultanMaulanaIchiro_290323;

/**
 *
 * @author LABP1KOMP
 */
public class operasiaritmatika {
        public static void main(String[] args){
    // pastikan argumen diberikan sesuai 
    if (args.length != 2){
        System.out.println("Usage: java operasiaritmatika n1 n2");
        return;
    }
    //parsiang argumen ke dalam bilangan bilangan bulat
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    
    //melakukan operasi aritmatika dan mencertak hasilnya ke layar
    System.out.println("Tambah = " + (n1 + n2));
    System.out.println("Kurang = " + (n1 - n2));
    System.out.println("Kali = " + (n1 * n2));
    System.out.println("Bagi = " + (n1 / n2));
    }
  
}
