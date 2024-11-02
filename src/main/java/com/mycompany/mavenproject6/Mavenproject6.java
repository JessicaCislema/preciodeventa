/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject6 {

    public static void main(String[] args) {
      /*double calificacion; 
         
       Scanner teclado = new Scanner(System.in);
      
       System.out.println("INGRESE LA CALIFICACION DEL ALUMNO: ");
        calificacion = teclado.nextDouble();

        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("El alumno tiene A");
        }else if (calificacion >= 80 && calificacion < 90 ){
            System.out.println("El alumno tiene B");
           
           }
        System.out.println("============EJERCICIO 7");
        
        double preciosd;
        double preciocd;
        
         System.out.println("INGRESE EL PRECIO DEL PRODUCTO");
         preciosd = teclado.nextDouble();
         
         if(preciosd>100){
             preciocd= (preciosd-(preciosd*0.20));
             System.out.println("El valor del producto es SIN DESCUENTO " + preciosd + " El valor CON DESCUENTO es " + preciocd);
           } else if (preciosd<=100){
               preciocd = (preciosd - (preciosd*0.10));
               System.out.println("El valor del producto SIN DESCUENTO " + preciosd + "El valor CON DESCUENTO es " + preciocd);
           }
*/
       
        //EJERCICIO 8
        Scanner teclado = new Scanner(System.in);
        char letra;

        System.out.println("Ingresar letra: ");

        letra = teclado.nextLine().charAt(0); //ingresar un caracter
        switch (letra) {
            case 'A':
                System.out.println("LA LETRA INGRESADA ES UNA VOCAL");
                break;
            case 'b':
                System.out.println("LA LETRA ES UNA CONSONANTE");
                break;
                
        }
        }
}

