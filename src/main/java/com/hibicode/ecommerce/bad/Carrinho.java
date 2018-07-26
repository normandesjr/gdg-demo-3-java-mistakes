package com.hibicode.ecommerce.bad;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Item> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionar(Item item) {
        itens.add(item);
    }

}
