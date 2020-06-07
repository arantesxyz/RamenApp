package puc.es.pm.ramenapp.restaurante.impl;

import puc.es.pm.ramenapp.entities.Pedido;
import puc.es.pm.ramenapp.restaurante.Restaurante;

import java.util.HashSet;
import java.util.Set;

public class RamenShop implements Restaurante {
    private CraftBalanco balanco;

    private final Set<Pedido> pedidos;

    public RamenShop() {
        this.balanco = new CraftBalanco();
        this.pedidos = new HashSet<>();
    }

    public void abrirPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void fecharPedido(Pedido pedido) {
        pedidos.remove(pedido);
        balanco.addPedido(pedido);
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }
}