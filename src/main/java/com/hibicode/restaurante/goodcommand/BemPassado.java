package com.hibicode.restaurante.goodcommand;

public class BemPassado implements Forno {

    @Override
    public void assar() {
        System.out.println("Perdeu a carne, mas o cliente tem razão!");
    }
}
