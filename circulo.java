/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author senai
 */
public class circulo {
    private String cor;
    private double raio;
    private double area;
    private final double pi = 3.14;
            
    public void circulo(){
        cor = "Azul";
        System.out.println("Você tem um circulo "+cor);
    }
        
    public void setraio(double valor){
        this.raio = valor;
    }
    
    public double getraio(){
        return this.area;
    }

    public void calculo(){
      area = pi*(raio * raio);
    }
}
