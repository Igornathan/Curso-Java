
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author senai
 */
public class MainCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        circulo c = new circulo();
        double raio;
        c.circulo();
        System.out.println("Qual o tamanho do raio do seu circulo?");
        raio= scanner.nextDouble();
        c.setraio(raio);
        c.calculo();
        System.out.println(c.getraio());
    }
    
}
