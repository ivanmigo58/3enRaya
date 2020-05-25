package com.company;

import java.util.Scanner;

public class InterfazDeUsuario {

    Scanner scanner = new Scanner(System.in);

    public void mostrarTurno(String turno) {
        // Turno
        System.out.println("---------------");
        System.out.println("Turno de : " + turno);
        System.out.println("---------------");
    }



}
