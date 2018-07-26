package com.hibicode.restaurante.badcommand;

public class FornoFactory {

    public static Forno prepararForno(int ponto) {
        if (ponto == 1) {
            return new MalPassado();
        } else if (ponto == 2) {
            return new BemPassado();
        } else {
            return null;
        }
    }

}