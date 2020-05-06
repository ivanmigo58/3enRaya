package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tablero[][];
        String turno = " X ";
        boolean exit = false;
        int contadorTurno = 0;


        // Defino el tamaño del tablero
        tablero = new String[Tablero.filas][Tablero.columas];

        // Relleno el tablero
        for (int i = 0; i < Tablero.filas; i++) {
            for (int j = 0; j < Tablero.columas; j++) {
                tablero[i][j] = " _ ";
            }
        }

        while (!exit) {
            // Turno
            System.out.println("---------------");
            System.out.println("Turno de : " + turno);
            System.out.println("---------------");

            // Fila y columna de donde quiere colocar la ficha
            System.out.print("Dime la posicion de la fila de donde quieres colocar la ficha: ");
            int filaFicha = scanner.nextInt();
            System.out.print("Dime la posicion de la columna de donde quieres colocar la ficha: ");
            int columnaFicha = scanner.nextInt();
            System.out.println("");

            // Siempre que la posicion no este ocupada, guardo la ficha
            if (tablero[filaFicha-1][columnaFicha-1] == " _ ") {
                tablero[filaFicha - 1][columnaFicha - 1] = turno;

            } else {
                System.out.println("ERROR! La posicion ya esta ocupada.");
            }

            // Imprimo el tablero
            for (int i = 0; i < Tablero.filas; i++) {
                for (int j = 0; j < Tablero.columas; j++) {
                    System.out.print(tablero[i][j]);
                }
                System.out.println("");
            }
            contadorTurno++;



            // Comprobamos el ganador

           if (contadorTurno >= 5) {
               // Primemra linea horizontal
               if (!tablero[0][0].equals(" _ ") && !tablero[0][1].equals(" _ ") && !tablero[0][2].equals(" _ ")) {
                   if (tablero[0][0].equals(tablero[0][1]) && tablero[0][1].equals(tablero[0][2])) {
                       System.out.println("Ha ganado " + turno + " !!!");
                       exit = true;
                   }
               }

               // Segunda linea horizontal
               if (!tablero[1][0].equals(" _ ") && !tablero[1][1].equals(" _ ") && !tablero[1][2].equals(" _ ")) {
                   if (tablero[1][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[1][2])) {
                       System.out.println("Ha ganado " + turno + " !!!");
                       exit = true;
                   }
               }

               // Tercera linea
               if (!tablero[2][0].equals(" _ ") && !tablero[2][1].equals(" _ ") && !tablero[2][2].equals(" _ ")) {
                   if (tablero[2][0].equals(tablero[2][1]) && tablero[2][1].equals(tablero[2][2])) {
                       System.out.println("Ha ganado " + turno + " !!!");
                       exit = true;
                   }
               }

               // Primera columna
               if (!tablero[0][0].equals(" _ ") && !tablero[1][0].equals(" _ ") && !tablero[2][0].equals(" _ ")) {
                   if (tablero[0][0].equals(tablero[1][0]) && tablero[1][0].equals(tablero[2][0])) {
                       System.out.println("Ha ganado " + turno + " !!!");
                       exit = true;
                   }
               }

               // Segunda columna
               if (!tablero[0][1].equals(" _ ") && !tablero[1][1].equals(" _ ") && !tablero[2][1].equals(" _ ")) {
                   if (tablero[0][1].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][1])) {
                       System.out.println("Ha ganado " + turno + " !!!");
                       exit = true;
                   }
               }

               // Tercera columna
               if (!tablero[0][2].equals(" _ ") && !tablero[1][2].equals(" _ ") && !tablero[2][2].equals(" _ ")) {
                   if (tablero[0][2].equals(tablero[1][2]) && tablero[1][2].equals(tablero[2][2])) {
                       System.out.println("Ha ganado " + turno + " !!!");
                       exit = true;
                   }
               }

               // Primera diagonal
               if (!tablero[0][0].equals(" _ ") && !tablero[1][1].equals(" _ ") && !tablero[2][2].equals(" _ ")) {
                   if (tablero[0][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][2])) {
                       System.out.println("Ha ganado " + turno + " !!!");
                       exit = true;
                   }
               }

               // Segunda diagonal
               if (!tablero[2][0].equals(" _ ") && !tablero[1][1].equals(" _ ") && !tablero[0][3].equals(" _ ")) {
                   if (tablero[2][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[0][3])) {
                       System.out.println("Ha ganado " + turno + " !!!");
                       exit = true;
                   }
               }
           }

            // Cambio el turno
            if (turno.equals(" X ")) turno = " O ";
            else turno = " X ";

        }

    }

}