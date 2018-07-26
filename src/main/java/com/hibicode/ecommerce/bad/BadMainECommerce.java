package com.hibicode.ecommerce.bad;

public class BadMainECommerce {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.getItens().add(new Item(12, new Produto("Heineken", 3.99)));
        carrinho.getItens().add(new Item(2, new Produto("Colorado", 11.99)));
        carrinho.getItens().add(new Item(24, new Produto("Stella", 2.99)));

        double total = carrinho.getItens().stream().mapToDouble(i -> i.getQuantidade() * i.getProduto().getValor()).sum();
        System.out.println(total);
    }

}
