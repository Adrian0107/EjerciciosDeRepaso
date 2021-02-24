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
public class AdivinaNumero {
    public static void main(String[] args)
        {
            
            int n,m=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Capture un numero");
        n=scanner.nextInt();
        
        
         while(n!=m)
                {
                  
        System.out.println("Capture un numero para empezar a adivinar");
        m=scanner.nextInt();
        if(n>m)
        {
            System.out.println("El numero que acabas de ingresar es menor");
            
        }
        
        if(m>n)
        {
            System.out.println("El numero que acabas de ingresar es mayor");
            
        }
        
        if(m ==n)
        {
            System.out.println("El numero que acabas de ingresar es igual, felicidades");
        }
        
        
                    
                    
                    
                }
        
        
        
        
        }
}
