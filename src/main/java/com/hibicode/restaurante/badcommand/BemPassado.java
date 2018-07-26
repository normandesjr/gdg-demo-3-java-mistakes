package com.hibicode.restaurante.badcommand;

public class BemPassado implements Forno {

    @Override
    public void assar() {
        System.out.println("Perdeu a carne, mas o cliente tem razãoa!");
    }
}
