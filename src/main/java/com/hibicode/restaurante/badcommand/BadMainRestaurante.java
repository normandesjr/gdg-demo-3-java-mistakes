package com.hibicode.restaurante.badcommand;

import java.util.Scanner;

public class BadMainRestaurante {

    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            while (true) {
                preparar(scanner);
            }
        }
    }

    private static void preparar(Scanner scanner) {
        System.out.println("Qual o ponto da sua carne? [1] Mal passado; [2] Bem passado");
        int ponto = scanner.nextInt();

        Forno forno = FornoFactory.prepararForno(ponto);
        if (forno != null) {
            forno.assar();
        } else {
            System.out.println("Desculpa, mas esse não consigo fazer");
        }
    }

}
