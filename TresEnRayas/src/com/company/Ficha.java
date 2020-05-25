package com.company;

import java.util.Scanner;

public class Ficha {

    Scanner scanner = new Scanner(System.in);

    public int pedirFila() {
        // Fila y columna de donde quiere colocar la ficha
        System.out.print("Dime la posicion de la fila de donde quieres colocar la ficha: ");
        return scanner.nextInt();
    }

    public int pedirColumna() {
        System.out.print("Dime la posicion de la columna de donde quieres colocar la ficha: ");
        return scanner.nextInt();
    }
}
