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
public class Alreves {
        public static void main(String[] args)
        {
            int n, m=0, r;
            Scanner scanner = new Scanner(System.in);
        System.out.println("Capture un numero");
        n=scanner.nextInt();
        
       while(n>0)
       {
           r=n%10;
           m=m*10+r;
           n/=10;
           
       }
        
        System.out.println("Numero al reves: " +m);;
      
        }
}
