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
public class NumerosIguales {
    public static void main(String[] args)
    {
        int n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Capture el primer numero");
        n1=scanner.nextInt();
        
        System.out.println("Capture el segundo numero");
        n2=scanner.nextInt();
        
        if(n1==n2)
               System.out.println("Los numeros son iguales");
        
        else
        {
                 System.out.println("Los numeros no soin iguales");

        }
 
            
        
        
       
    }
    
}
