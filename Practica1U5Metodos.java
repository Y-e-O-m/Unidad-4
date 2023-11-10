/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1.u5.metodos;

/**
 *
 * @author yeomn
 */
public class Practica1U5Metodos {

    /**
     * @param args the command line arguments
     */
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int resta (int a, int b){
        return a - b;
    }
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    public static double division(double a, double b) {
        return a / b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = Practica1U5Metodos.sumar(5, 10); //llamando al metodo estatico
        System.out.println("La suma es: " + resultado);
        
        int resultado2 = Practica1U5Metodos.resta(5, 10); //llamando al metodo estatico
        System.out.println("La resta es: " + resultado2);
        
        int resultado3 = Practica1U5Metodos.multiplicacion (5, 10); //llamando al metodo estatico
        System.out.println("La multiplicacion es: " + resultado3);
        
        double resultado4 = Practica1U5Metodos.division (5, 10); //llamando al metodo estatico
        System.out.println("La division es: " + resultado4);
    }
    
}
    
    

