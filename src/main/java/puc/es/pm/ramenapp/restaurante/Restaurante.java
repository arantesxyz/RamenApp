package puc.es.pm.ramenapp.restaurante;

import puc.es.pm.ramenapp.entities.Pedido;

import java.util.Set;

public interface Restaurante {
    void abrirPedido(Pedido pedido);
    void fecharPedido(Pedido pedido);
    Set<Pedido> getPedidos();
}
