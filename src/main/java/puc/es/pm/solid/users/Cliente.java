package puc.es.pm.solid.users;

import puc.es.pm.solid.entities.Pedido;

import java.util.Observer;

public interface Cliente extends Observer {
    void novoPedido(Pedido pedido);
    String getName();
}
