/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo2;

/**
 *
 * @author LENOVO
 */
public class tabung extends lingkaran implements MenghitungRuang {
    double tinggi;
    double phi;

    public tabung(double jarijari, double tinggi) 
    {
      this.setJariJari(jarijari);
      this.tinggi = tinggi;
    }
    
    @Override
    public double volume() 
    {
     return volume(this.luas(),this.tinggi);
    }
    public double volume(double luas, double tinggi)
    {
     return luas*tinggi;
    }

    @Override
    public double luasPermukaan() 
    {
     return luaspermukaan(this.luas(), this.keliling() , this.tinggi);
    }
    public double luaspermukaan(double luas, double keliling, double tinggi)
    {  
     return (2*luas)+(keliling*tinggi);  
    }  
}