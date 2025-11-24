package tp8.parte1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Hidalgo
 */
public class Pedido implements Pagable {

    private List<Producto> pedido;
    private EstadosPago estado;

    public Pedido() {
        this.pedido = new ArrayList<>();
        estado = EstadosPago.NOPAGADO;
    }
    
    public void agregarProducto(Producto producto) {
        pedido.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : pedido) {
            total += producto.calcularTotal();
        }
        return total;
    }

    @Override
    public void setEstadoPagado(Notificable cliente) {
        this.estado = EstadosPago.PAGADO;
        cliente.notificar(Notificaciones.PAGOEXITOSO);
    }

    @Override
    public void setEstadoNoPagado(Notificable cliente) {
        this.estado = EstadosPago.NOPAGADO;
        cliente.notificar(Notificaciones.PAGORECHAZADO);
    }
    
    @Override
    public EstadosPago getEstadoPago() {
        return estado;
    }
       
}