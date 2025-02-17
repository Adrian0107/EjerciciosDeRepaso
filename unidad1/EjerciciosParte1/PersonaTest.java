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
public class PersonaTest {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el nombre");
        String nombre = scanner.next();
 
        System.out.println("Introduce la edad");
        int edad = scanner.nextInt();
 
        System.out.println("Introduce el sexo");
        char sexo = scanner.next().charAt(0);
 
        System.out.println("Introduce el peso");
        double peso = scanner.nextDouble();
 
        System.out.println("Introduce la altura");
        double altura = scanner.nextDouble();
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
 
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);
 
        persona2.setPeso(90.5);
        persona2.setAltura(1.80);
 
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());
 
        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());
 
        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
    }
 
    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.PESOIDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.BAJOPESO:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.SOBREPESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }
 
    public static void MuestraMayorDeEdad(Persona p) {
 
        if (p.esMayorDeEdad())
        {
            System.out.println("La persona es mayor de edad");
        } 
        else
        {
            System.out.println("La persona no es mayor de edad");
        }
    }
    
    
    
}
