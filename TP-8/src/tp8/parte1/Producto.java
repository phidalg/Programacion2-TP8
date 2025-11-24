package tp8.parte1;

/**
 *
 * @author Pedro Hidalgo
 */
public class Producto implements Pagable {

    private String nombre;
    private double precio;
    private EstadosPago estado;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.estado = EstadosPago.NOPAGADO;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public double calcularTotal() {
        return precio;
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