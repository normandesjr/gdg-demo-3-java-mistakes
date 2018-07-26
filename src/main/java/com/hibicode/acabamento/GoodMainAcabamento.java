package com.hibicode.acabamento;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

public class GoodMainAcabamento {

    enum Cor { BRANCO, AMARELO, PRETO };
    static List<Piso> pisos = Arrays.asList(new Piso("Porcelanato A"), new Piso("Azulejo B"));

    public static void main(String[] args) {
        pisos.stream().forEach(GoodMainAcabamento::imprimirCoresPorPiso);
    }

    public static void imprimirCoresPorPiso(Piso piso) {
        for (Cor cor : Cor.values()) {
            System.out.println("Piso: " + piso.getNome() + " cor: " + cor);
        }
    }

}
