package com.company;

import java.util.Scanner;

public class Main {


    static Tablero tablero = new Tablero();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String turno = " X ";
        boolean exit = false;

        // Defino el tamaño del tablero
        tablero.tablero = new String[tablero.filas][tablero.columas];

        // Relleno el tablero
       tablero.rellenarTablero(tablero);

        while (!exit) {
            juego(turno);
            comprobarGanador(turno, exit);

            // Cambio el turno
            if (turno.equals(" X ")) turno = " O ";
            else turno = " X ";

        }
    }


    static void juego(String turno) {
        Scanner scanner = new Scanner(System.in);
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
        if (tablero.tablero[filaFicha-1][columnaFicha-1] == " _ ") {
            tablero.tablero[filaFicha - 1][columnaFicha - 1] = turno;

        } else {
            System.out.println("ERROR! La posicion ya esta ocupada.");
        }

        // Imprimo el tablero
        for (int i = 0; i < tablero.filas; i++) {
            for (int j = 0; j < tablero.columas; j++) {
                System.out.print(tablero.tablero[i][j]);
            }
            System.out.println("");
        }



    }


    static void comprobarGanador(String turno, boolean exit) {


            // Primemra linea horizontal
            if (!tablero.tablero[0][0].equals(" _ ") && !tablero.tablero[0][1].equals(" _ ") && !tablero.tablero[0][2].equals(" _ ")) {
                if (tablero.tablero[0][0].equals(tablero.tablero[0][1]) && tablero.tablero[0][1].equals(tablero.tablero[0][2])) {
                    System.out.println("Ha ganado " + turno + " !!!");
                    exit = true;
                }
            }

            // Segunda linea horizontal
            if (!tablero.tablero[1][0].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[1][2].equals(" _ ")) {
                if (tablero.tablero[1][0].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[1][2])) {
                    System.out.println("Ha ganado " + turno + " !!!");
                    exit = true;
                }
            }

            // Tercera linea
            if (!tablero.tablero[2][0].equals(" _ ") && !tablero.tablero[2][1].equals(" _ ") && !tablero.tablero[2][2].equals(" _ ")) {
                if (tablero.tablero[2][0].equals(tablero.tablero[2][1]) && tablero.tablero[2][1].equals(tablero.tablero[2][2])) {
                    System.out.println("Ha ganado " + turno + " !!!");
                    exit = true;
                }
            }

            // Primera columna
            if (!tablero.tablero[0][0].equals(" _ ") && !tablero.tablero[1][0].equals(" _ ") && !tablero.tablero[2][0].equals(" _ ")) {
                if (tablero.tablero[0][0].equals(tablero.tablero[1][0]) && tablero.tablero[1][0].equals(tablero.tablero[2][0])) {
                    System.out.println("Ha ganado " + turno + " !!!");
                    exit = true;
                }
            }

            // Segunda columna
            if (!tablero.tablero[0][1].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[2][1].equals(" _ ")) {
                if (tablero.tablero[0][1].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[2][1])) {
                    System.out.println("Ha ganado " + turno + " !!!");
                    exit = true;
                }
            }

            // Tercera columna
            if (!tablero.tablero[0][2].equals(" _ ") && !tablero.tablero[1][2].equals(" _ ") && !tablero.tablero[2][2].equals(" _ ")) {
                if (tablero.tablero[0][2].equals(tablero.tablero[1][2]) && tablero.tablero[1][2].equals(tablero.tablero[2][2])) {
                    System.out.println("Ha ganado " + turno + " !!!");
                    exit = true;
                }
            }

            // Primera diagonal
            if (!tablero.tablero[0][0].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[2][2].equals(" _ ")) {
                if (tablero.tablero[0][0].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[2][2])) {
                    System.out.println("Ha ganado " + turno + " !!!");
                    exit = true;
                }
            }

            // Segunda diagonal
            if (!tablero.tablero[2][0].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[0][2].equals(" _ ")) {
                if (tablero.tablero[2][0].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[0][2])) {
                    System.out.println("Ha ganado " + turno + " !!!");
                    exit = true;
                }
            }

        }

    }

