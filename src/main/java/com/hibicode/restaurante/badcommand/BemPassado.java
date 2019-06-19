package com.hibicode.restaurante.badcommand;

public class BemPassado implements PontoCarne {

    @Override
    public void assar() {
        System.out.println("Perdeu a carne, mas o cliente tem razãoa!");
    }
}
