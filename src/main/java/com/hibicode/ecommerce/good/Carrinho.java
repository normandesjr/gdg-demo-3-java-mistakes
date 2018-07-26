package com.hibicode.ecommerce.good;

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

    public double total() {
        return itens.stream().mapToDouble(Item::valorTotal).sum();
    }

}
