package puc.es.pm.solid.entities;

import puc.es.pm.solid.entities.items.Bebida;

import java.util.Set;

public class Pedido {
    private Set<Prato> pratos;
    private Set<Bebida> bebidas;

    public Pedido(Set<Prato> pratos, Set<Bebida> bebidas) {
        this.pratos = pratos;
        this.bebidas = bebidas;
    }

    public Set<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(Set<Prato> pratos) {
        this.pratos = pratos;
    }

    public Set<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(Set<Bebida> bebidas) {
        this.bebidas = bebidas;
    }
}