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
public class Cuadraticas {
    public static void main(String[] args)
    {
        double a,b,c;
        double d,x1,x2;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el primer coeficiente");
        a=scanner.nextDouble();
        
        System.out.println("Introduzca el segundo coeficiente");
        b=scanner.nextDouble();
        
        System.out.println("Introduzca el tercer coeficiente");
        c=scanner.nextDouble();
        
        d=(b*b)-(4*a*c);
        if(d<0)
            System.out.println("No existen soluciones reales");
        else
        {
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Solucion: " + x1);
            System.out.println("Solucion: " + x2);
        }
        
        
    }
    
}
