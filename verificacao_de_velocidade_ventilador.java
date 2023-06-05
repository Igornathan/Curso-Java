/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class verificacao_de_velocidade_ventilador {
     public static void main(String[] args) {
         System.out.println("Escolha a velocidade do ventildor. \n 1=Fraco \n 2 = Médio \n 3= Rapido");
         Scanner input = new Scanner (System.in);
         int velocidade = input.nextInt();
         switch(velocidade){
            case 1 -> System.out.println("Velocidade fraca");
            case 2 -> System.out.println("Velocidade média");
            case 3 -> System.out.println("Velocidade máxima");
            default -> System.out.println("Valor inválido");
         }
}
}
