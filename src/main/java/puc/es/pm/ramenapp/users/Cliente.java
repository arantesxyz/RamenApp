package puc.es.pm.ramenapp.users;

import puc.es.pm.ramenapp.entities.Pedido;

public interface Cliente {
    void notificar(Pedido pedido);
}
