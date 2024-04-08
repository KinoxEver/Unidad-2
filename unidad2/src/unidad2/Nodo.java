package unidad2;

/**
 *
 * @author Zzzz
 */
public class Nodo {

    public Productos producto;
    public Nodo siguiente;

    public infoCompra InfoCompra;
    public DetalleVentas detalleVentas;
    public Venta venta;
    public Clientes clientes;

    public Nodo(Productos producto) {
        this.producto = producto;
        this.siguiente = null;
    }

    public Productos getProducto() {
        return producto;
    }

    public Nodo(infoCompra InfoCompra) {
        this.InfoCompra = InfoCompra;
        this.siguiente = null;
    }

    public infoCompra getInCompra() {
        return InfoCompra;
    }

    public Nodo(DetalleVentas detalleVentas) {
        this.detalleVentas = detalleVentas;
        this.siguiente = null;
    }

    public DetalleVentas getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(DetalleVentas detalleVentas) {
        this.detalleVentas = detalleVentas;
    }

    public Nodo(Venta venta) {
        this.venta = venta;
        this.siguiente = null;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Nodo(Clientes clientes) {
        this.clientes = clientes;
        this.siguiente = null;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public infoCompra getInfoCompra() {
        return InfoCompra;
    }

    public void setInfoCompra(infoCompra InfoCompra) {
        this.InfoCompra = InfoCompra;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
