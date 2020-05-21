package com.company;

import java.util.Scanner;

public class InterfazDeUsario {



    public void pedirFicha() {
        Scanner scanner = new Scanner(System.in);
        // Turno
        System.out.println("---------------");
        System.out.println("Turno de : " + TresEnRaya.turno);
        System.out.println("---------------");

        // Fila y columna de donde quiere colocar la ficha
        System.out.print("Dime la posicion de la fila de donde quieres colocar la ficha: ");
        TresEnRaya.filaFicha = scanner.nextInt();
        System.out.print("Dime la posicion de la columna de donde quieres colocar la ficha: ");
        TresEnRaya.columnaFicha = scanner.nextInt();
        System.out.println("");
    }
}
