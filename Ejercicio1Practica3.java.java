package Clase3BooleanosyMetodos;

import java.util.Scanner;

public class Ejercicio1Practica3 {
    //1. Escribir un método que reciba un número y retorne su doble
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int  num = input.nextInt();

        int resul= obtenerDoble(num);
        System.out.println("El doble es " + resul);
    }

    public static int obtenerDoble (int num){

        return num * 2;
    }

}