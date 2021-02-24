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
public class Ordenar3 {
     public static void main(String[] args)
     {
         int n1, n2, n3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Capture el primer numero");
        n1=scanner.nextInt();
        
        System.out.println("Capture el segundo numero");
        n2=scanner.nextInt();
        
        System.out.println("Capture el tercer numero");
        n3=scanner.nextInt();
        
        if(n1==n2 && n2==n3)
               System.out.println("Los numeros son iguales");
        
        if(n1>n2 && n2>n3)
        {
        System.out.println("Los numeros de mayor a menor son: " +n1 +n2 + n3);
        }
        
        if(n1>n3 && n3>n2)
        {
        System.out.println("Los numeros de mayor a menor son: " +n1 +n3 + n2);
        }
        
        if(n2>n1 && n1>n3)
        {
        System.out.println("Los numeros de mayor a menor son: " +n2 + n1 + n3);
        }
        
        if(n3>n2 && n2>n1)
        {
        System.out.println("Los numeros de mayor a menor son: " +n3 +n2 + n1);
        }
        
        if(n2>n3 && n3>n2)
        {
        System.out.println("Los numeros de mayor a menor son: " +n2 +n3 + n1);
        }
        
        if(n3>n1 && n1>n2)
        {
        System.out.println("Los numeros de mayor a menor son: " +n3 +n1 + n2);
        }
        
        else
        {
            System.out.println("Datos incorrectos ");
        }
        
     }
    
}
