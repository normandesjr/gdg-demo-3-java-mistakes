package com.hibicode.restaurante.goodcommand;

public class BemPassado implements PontoCarne {

    @Override
    public void assar() {
        System.out.println("Perdeu a carne, mas o cliente tem razão!");
    }
}
