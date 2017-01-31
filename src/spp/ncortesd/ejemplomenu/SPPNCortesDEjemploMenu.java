/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ncortesd.ejemplomenu;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class SPPNCortesDEjemploMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int opEntrada;
        double lado, resultado;
        Scanner kb = new Scanner (System.in);
        //Desplegar Menú
        System.out.println("Calculadora de áreas, perímetros y volúmenes");
        System.out.println("Introduzca la opción deseada");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetros");
        System.out.println("3. Calcular volúmenes");
        System.out.println("4. Salir");
        opEntrada = kb.nextInt ();
        
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al cálculo de áreas");
                //Llamamos el método para solicitar datos
                //Lo que devuelve lo guardamos en la variable lado
                lado= mensajePedirdatos();
                resultado= Math.pow(lado,2);
                System.out.println("El área del cuadrado es "+ resultado);
                break;
            case 2:
                System.out.println("Bienvenido al cálculo de perímetros");
                lado= mensajePedirdatos();
                resultado= lado*4;
                System.out.println("El resultado del perímetro es " + resultado);
                break;
            case 3:
                System.out.println("Bienvenido al cálculo de volúmenes");
                //Podemos omitir la variable, sustituyendo el valor de lado por 
                //lo de static double
                resultado= Math.pow(mensajePedirdatos(),3);
                System.out.println("El resultado del volumen es "+ resultado);
                break;
            default:
                System.out.println("Adiós");
       
        }
                         
    }
    
    static double mensajePedirdatos (){
        //Variables
        double lado;
        Scanner kb= new Scanner (System.in);
        System.out.println("Introduce el lado del cuadrado");
        lado= kb.nextDouble();
        return lado;
    }
    
}
