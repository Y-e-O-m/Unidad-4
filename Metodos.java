/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author yeomn
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero1 = 1;
        double numero2 = 2;

     
        double suma = sumar(numero1, numero2);
        double resta = restar(numero1, numero2);
        double multiplicacion = multiplicar(numero1, numero2);

        
        double division = 0;
        if (numero2 != 0) {
            division = dividir(numero1, numero2);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }

    
    public static double sumar(double a, double b) {
        return a + b;
    }

    
    public static double restar(double a, double b) {
        return a - b;
    }

 
    public static double multiplicar(double a, double b) {
        return a * b;
    }

  
    public static double dividir(double a, double b) {
   
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
        
    }
    
}
    

