/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Igor Nathan
 */
public class SobremesaElseIf {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//le o que o usuario digitou e guarda em uma variavel. 
        System.out.println("Qual sobremesa você deseja?\n Temos as seguintes opções:\n Bom-bom = 1 \n Pudim = 2 \n Café =3");
        int Pedido = scanner.nextInt();
        
        if(Pedido == 1){
            System.out.println("Você escolheu Bom-bom");
        }else if (Pedido == 2){
            System.out.println("Você escolheu Pudim");
        }else {
            System.out.println("Você escolheu café");
        }
    }
    
}
