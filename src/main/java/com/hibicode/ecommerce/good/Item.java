package com.hibicode.ecommerce.good;

public class Item {

    private int quantidade;
    private Produto produto;

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double valorTotal() {
        return quantidade * produto.getValor();
    }

}
