package puc.es.pm.solid.entities.impl;

import puc.es.pm.solid.entities.Pedido;
import puc.es.pm.solid.entities.items.Bebida;

import java.util.Set;

public class CraftPedido implements Pedido {
    private Set<CraftPrato> pratos;
    private Set<Bebida> bebidas;

    public CraftPedido(Set<CraftPrato> pratos, Set<Bebida> bebidas) {
        this.pratos = pratos;
        this.bebidas = bebidas;
    }
}