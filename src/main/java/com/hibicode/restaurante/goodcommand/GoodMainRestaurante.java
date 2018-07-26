package com.hibicode.restaurante.goodcommand;

import java.util.Scanner;

public class GoodMainRestaurante {

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

        FornoFactory.prepararForno(ponto).assar();
    }

}
