/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbo2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args){
        boolean ulang = false;
        double panjang,lebar,tinggi,jarijari;
        int pilih = 0;
        int x=0;
        
        Scanner input = new Scanner (System.in);
        do{
        System.out.println("Menu : ");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Keluar");
        System.out.print("Pilih : "); pilih = input.nextInt();
        
        switch (pilih){
            case 1:
            System.out.print("Masukkan panjang : "); panjang = input.nextDouble();
            System.out.print("Masukkan lebar : "); lebar = input.nextDouble();
            System.out.print("Masukkan tinggi : "); tinggi = input.nextDouble();
                balok balok = new balok(panjang,lebar,tinggi);
            System.out.println("Keliling persegi panjang : " + balok.keliling());            
            System.out.println("Luas persegi panjang : " + balok.luas());           
            System.out.println("Luas permukaan balok : " + balok.luasPermukaan());
            System.out.println("Volume Balok : " + balok.volume());
            break;
               
            case 2:
            System.out.print("Masukkan jari-jari : "); jarijari = input.nextDouble();
            System.out.print("Masukkan tinggi : "); tinggi = input.nextDouble();           
                tabung tabung = new tabung (jarijari, tinggi);
            System.out.println("Keliling lingkaran : " + tabung.keliling());            
            System.out.println("Luas lingkaran : " + tabung.luas());            
            System.out.println("Luas permukaan Tabung : " + tabung.luasPermukaan());
            System.out.println("Volume Tabung : " + tabung.volume());
            break;
        
            case 3:
                x=1;
                System.exit(0); 
            break;
            
            default : System.out.println("Input Anda Salah");break;
                }
            }
        while(x==0);
        }  
    }