package puc.es.pm.ramenapp.restaurante.impl;

import puc.es.pm.ramenapp.entities.Pedido;
import puc.es.pm.ramenapp.restaurante.Balanco;

import java.util.HashSet;
import java.util.Set;

public class CraftBalanco implements Balanco {
    private Set<Pedido> pedidos;

    public CraftBalanco() {
        this.pedidos = new HashSet<>();
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}
