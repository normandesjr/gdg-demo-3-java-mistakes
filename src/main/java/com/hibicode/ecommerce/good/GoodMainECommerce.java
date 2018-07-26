package com.hibicode.ecommerce.good;

public class GoodMainECommerce {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(new Item(12, new Produto("Heineken", 3.99)));
        carrinho.adicionar(new Item(2, new Produto("Colorado", 11.99)));
        carrinho.adicionar(new Item(24, new Produto("Stella", 2.99)));

        System.out.println(carrinho.total());

    }

}
