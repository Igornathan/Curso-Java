/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

public class Cachorro{
    String Color;
    boolean Latido;
    String Raca;
    
    public Cachorro(String CorCachorro, boolean EstaLatindo, String RacaCachorro){
        Color = CorCachorro;
        Latido = EstaLatindo;
        Raca = RacaCachorro;
    }
    
    public static void main(String[] args) {
       Cachorro Pipoca = new Cachorro("Marrom",true, "Vira-Lata");
       Cachorro Billy = new Cachorro("Branco", true,"Shih-tzu");
       
       System.out.println(Pipoca.Color);
       
       System.out.println(Billy.Raca);
       
       System.out.println(Billy.Latido);
       
       if(Billy.Latido){
           System.out.println("AU-AU");
       }
    }
    
}
