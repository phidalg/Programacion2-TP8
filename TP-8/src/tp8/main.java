package tp8;

import tp8.parte1.Cliente;
import tp8.parte1.Pedido;
import tp8.parte1.Producto;
import tp8.parte1.TarjetaCredito;

/**
 *
 * @author Pedro Hidalgo
 */
public class main {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido();
        Producto p1 = new Producto("Teclado", 1500);
        Producto p2 = new Producto("Monitor", 20000);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        TarjetaCredito tarjeta = new TarjetaCredito(cliente);
        tarjeta.aplicarDescuento(10, 5000, pedido);
        
    }
    
}
