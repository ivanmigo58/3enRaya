package com.company;

import java.util.Scanner;

public class TresEnRaya {
    Scanner scanner = new Scanner(System.in);

    static Tablero tablero = new Tablero();

    String turno;
    private boolean exit;
    private boolean ganador;

    public void iniciarJuego() {
        turno = " X ";
        exit = false;
        ganador = false;

        tablero.tablero = new String[tablero.filas][tablero.columas];
        tablero.rellenarTablero(tablero);

        while (!exit) {
            //crearTablero();
            rellenarTablero();

            comprobarGanador();

            cambioTurno();

            if (ganador) {
                volverAJugar();
            }
        }
    }

  /*  private void crearTablero() {
        // Defino el tamaño del tablero
        tablero.tablero = new String[tablero.filas][tablero.columas];

        // Relleno el tablero
        tablero.rellenarTablero(tablero);
    }*/


    private void rellenarTablero() {
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
        if (tablero.tablero[filaFicha - 1][columnaFicha - 1] == " _ ") {
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


    private void comprobarGanador() {
        // Primemra linea horizontal
        if (!tablero.tablero[0][0].equals(" _ ") && !tablero.tablero[0][1].equals(" _ ") && !tablero.tablero[0][2].equals(" _ ")) {
            if (tablero.tablero[0][0].equals(tablero.tablero[0][1]) && tablero.tablero[0][1].equals(tablero.tablero[0][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;
            }
        }

        // Segunda linea horizontal
        if (!tablero.tablero[1][0].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[1][2].equals(" _ ")) {
            if (tablero.tablero[1][0].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[1][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;
            }
        }

        // Tercera linea
        if (!tablero.tablero[2][0].equals(" _ ") && !tablero.tablero[2][1].equals(" _ ") && !tablero.tablero[2][2].equals(" _ ")) {
            if (tablero.tablero[2][0].equals(tablero.tablero[2][1]) && tablero.tablero[2][1].equals(tablero.tablero[2][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }

        // Primera columna
        if (!tablero.tablero[0][0].equals(" _ ") && !tablero.tablero[1][0].equals(" _ ") && !tablero.tablero[2][0].equals(" _ ")) {
            if (tablero.tablero[0][0].equals(tablero.tablero[1][0]) && tablero.tablero[1][0].equals(tablero.tablero[2][0])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }

        // Segunda columna
        if (!tablero.tablero[0][1].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[2][1].equals(" _ ")) {
            if (tablero.tablero[0][1].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[2][1])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }

        // Tercera columna
        if (!tablero.tablero[0][2].equals(" _ ") && !tablero.tablero[1][2].equals(" _ ") && !tablero.tablero[2][2].equals(" _ ")) {
            if (tablero.tablero[0][2].equals(tablero.tablero[1][2]) && tablero.tablero[1][2].equals(tablero.tablero[2][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }

        // Primera diagonal
        if (!tablero.tablero[0][0].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[2][2].equals(" _ ")) {
            if (tablero.tablero[0][0].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[2][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }

        // Segunda diagonal
        if (!tablero.tablero[2][0].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[0][2].equals(" _ ")) {
            if (tablero.tablero[2][0].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[0][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }
    }


    private void cambioTurno() {
        // Cambio el turno
        if (turno.equals(" X ")) turno = " O ";
        else turno = " X ";
    }


    private void volverAJugar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quieres volver a jugar? (s/n) ");
        String volveraJugar = scanner.next();
        System.out.println(" ");

        if (volveraJugar.equals("s")) {
            iniciarJuego();
        } else {
            exit = true;
        }
    }
}
