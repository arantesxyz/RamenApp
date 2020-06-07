package puc.es.pm.ramenapp.users.impl;

import puc.es.pm.ramenapp.App;
import puc.es.pm.ramenapp.entities.Pedido;
import puc.es.pm.ramenapp.users.Cliente;

public class CraftCliente implements Cliente {
    public CraftCliente() { }

    // Observer
    public void notificar(Pedido pedido) {
        App.CLIENT_LOGGER.log(String.format("O pedido número %d está pronto!", pedido.getId()));
    }
}
