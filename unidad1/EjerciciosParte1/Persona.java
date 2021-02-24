/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.unidad1.EjerciciosParte1;

/**
 *
 * @author Usuario
 */
public class Persona {
   
    private final static char SEXOPORDEF = 'H';
    public static final int BAJOPESO = -1;
    public static final int PESOIDEAL = 0;
    public static final int SOBREPESO = 1;
    
    private String nombre;
    private int edad;
    private String RFC;
    private char sexo;
    private double peso;
    private double altura;
 
    public Persona()
    {
        this("", 0, SEXOPORDEF, 0, 0);
    }
 
    public Persona(String nombre, int edad, char sexo)
    {
        this(nombre, edad, sexo, 0, 0);
    }
 
    public Persona(String nombre, int edad, char sexo, double peso, double altura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarRFC();
        this.sexo = sexo;
        comprobarSexo();
    }
    
    public int calcularIMC() 
    {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) 
        {
            return PESOIDEAL;
        } 
        else if (pesoActual < 20)
        {
            return BAJOPESO;
        } 
        else
        {
            return SOBREPESO;
        }
    }
    
    public boolean esMayorDeEdad() 
    {
        boolean mayor = false;
        if (edad >= 18) 
        {
            mayor = true;
        }
        return mayor;
    }
 
    private void comprobarSexo() 
    {
        if (sexo != 'H' && sexo != 'M') 
        {
            this.sexo = SEXOPORDEF;
        }
    }
    
    @Override
    public String toString() 
    {
        String sexo;
        if (this.sexo == 'H')
        {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + RFC + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
 
    private void generarRFC()
    {
        final int divisor = 23;
 
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
        char letraDNI = generaLetraDNI(res);
        RFC = Integer.toString(numDNI) + letraDNI;
    }
 
    private char generaLetraDNI(int res)
    {
        char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        return letras[res];
    }
 
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
 
    public void setEdad(int edad) 
    {
        this.edad = edad;
    }
 
    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }
 
    public void setPeso(double peso) 
    {
        this.peso = peso;
    }
 
    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
    
}
