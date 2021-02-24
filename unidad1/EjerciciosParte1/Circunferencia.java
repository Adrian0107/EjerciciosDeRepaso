/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.unidad1.EjerciciosParte1;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    
    public static void main(String[] args)
    {
        double diametro, circunferencia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Capture el diametro del circulo");
        diametro=scanner.nextDouble();
        
        circunferencia=Math.PI* diametro;
        System.out.println("La circunferencia del circulo es: " + circunferencia);
    }
}
