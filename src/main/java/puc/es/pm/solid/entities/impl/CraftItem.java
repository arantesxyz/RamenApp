package puc.es.pm.solid.entities.impl;

import puc.es.pm.solid.entities.Item;

public abstract class CraftItem implements Item {
    private String nome;
    private int quantidade;
    private double preco;

    public CraftItem(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
