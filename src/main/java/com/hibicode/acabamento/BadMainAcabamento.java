package com.hibicode.acabamento;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;

public class BadMainAcabamento {

    static List<Piso> pisos = Arrays.asList(new Piso("Porcelanato A"), new Piso("Azulejo B"));

    public static void main(String[] args) {
        Collection<Cor> cores = EnumSet.allOf(Cor.class);

        pisos.stream().forEach(p -> {
            cores.stream().forEach(c -> {
                System.out.println("Piso: " + p.getNome() + " cor: " + c);
            });
        });
    }

    enum Cor {BRANCO, AMARELO, PRETO}

}
