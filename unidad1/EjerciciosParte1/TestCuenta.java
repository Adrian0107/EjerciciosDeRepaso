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
public class TestCuenta {
    public static void main(String[] args) {
         
        Cuenta cuentapedro = new Cuenta("Pedro");
        Cuenta cuentafer = new Cuenta("Fernando",300);
         
        cuentapedro.ingresar(300);
        cuentafer.ingresar(400);
       
        cuentapedro.retirar(500);
        cuentafer.retirar(100);
        
        System.out.println(cuentapedro); 
        System.out.println(cuentafer);
         
    }
    
}
