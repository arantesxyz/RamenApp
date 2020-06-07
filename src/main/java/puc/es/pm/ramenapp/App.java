package puc.es.pm.ramenapp;

import puc.es.pm.ramenapp.entities.Pedido;
import puc.es.pm.ramenapp.entities.impl.CraftPedido;
import puc.es.pm.ramenapp.entities.impl.CraftPrato;
import puc.es.pm.ramenapp.items.Carne;
import puc.es.pm.ramenapp.items.Extra;
import puc.es.pm.ramenapp.items.Tamanho;
import puc.es.pm.ramenapp.restaurante.Restaurante;
import puc.es.pm.ramenapp.restaurante.impl.RamenShop;
import puc.es.pm.ramenapp.users.Cliente;
import puc.es.pm.ramenapp.users.impl.CraftCliente;
import puc.es.pm.ramenapp.utils.Logger;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class App {
    private static NumberFormat FORMATTER = new DecimalFormat("#0.00");
    public static Logger CLIENT_LOGGER = new Logger("CLIENTE");
    public static Logger SYS_LOGGER = new Logger("SISTEMA");


    public static Restaurante restaurante = new RamenShop();

    public static void main(String[] args) {
        novoPedidoExemplo();
    }

    private static void novoPedidoExemplo() {
        final Cliente cliente = new CraftCliente();

        final Pedido pedido = new CraftPedido(cliente);

        pedido.addPrato(new CraftPrato(
                Tamanho.MEDIO.wrap(),
                Carne.BOI.wrap(),
                Extra.TOFU.wrap(2),
                Extra.CHILLI.wrap(1)
        ));

        CLIENT_LOGGER.log("O valor é de R$" + FORMATTER.format(pedido.getTotal()));

        restaurante.abrirPedido(pedido);
        SYS_LOGGER.log(String.format("Pedido #%d criado com sucesso!", pedido.getId()));

        pedido.pronto();

        // Simulando que cliente pegou o pedido
        restaurante.fecharPedido(pedido);
        SYS_LOGGER.log(String.format("Pedido #%d entregue e adicionado ao balanço!", pedido.getId()));
    }
}