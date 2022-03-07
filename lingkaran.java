/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo2;

/**
 *
 * @author LENOVO
 */
public class lingkaran implements MenghitungBidang{
    private double jarijari;
    double phi = 3.14;

    public double getJariJari() 
    {
     return jarijari;
    }
    public void setJariJari(double jarijari) 
    {
     this.jarijari = jarijari;
    }
    
    @Override
    public double keliling() 
    {
     return keliling(this.jarijari);
    }
    public double keliling(double jariJari)
    {
     return 2*phi*jariJari;
    }
    
    @Override
    public double luas() 
    {
     return luas(this.jarijari);
    }  
    public double luas(double jarijari)
    {
     return phi*jarijari*jarijari;
    }   
} 