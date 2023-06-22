/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente;

/**
 *
 * @author Igor Nathan
 */
public class Ventilador {
    //propriedades         
    int pas =3;
    int velocidade;
    boolean girar = true;
    
    public Ventilador(){
    }
    //verifica se o ventilador esta girando e adiciona a velocidade caso o ventilador esteja girando
    public void estaGirando(){
        System.out.println("O ventilador está girando "+girar);
        if(girar == true){
            velocidade =velocidade + 1;
        }
    }
    //este metodo mostra a velocidade do ventilador
    public void mostrarVelocidade(){
        System.out.println("A velocidade do ventilador esta em "+velocidade);
    }
}
