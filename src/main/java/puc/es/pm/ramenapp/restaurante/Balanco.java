package puc.es.pm.ramenapp.restaurante;

import puc.es.pm.ramenapp.entities.Pedido;

import java.util.Set;

public interface Balanco {
    void addPedido(Pedido pedido);
    Set<Pedido> getPedidos();
}
