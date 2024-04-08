package unidad2;

import javax.swing.JOptionPane;

/**
 *
 * @author Zzzz
 */
public class DetalleVentas {

    int codigoProducto;
    int precioDeVenta;
    int cantidadAcomprar;
    int valoeDeDescuentoAplicado;
    int cobroSinIva;
    int valorAdescontar;
    int valorAcobrarPorIva;
    int valorTotalApagar;
    public Nodo inicio, fin;
    int impuestoIva = 19;
    int iva;

    public DetalleVentas() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregarAlFinal(DetalleVentas detalleVentas) {
        Nodo nuevoNodo = new Nodo(detalleVentas);
        if (inicio == null) {
            inicio = fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
    }

    public void mostrarLista() {
        Nodo actual = inicio;
        while (actual != null) {
            JOptionPane.showMessageDialog(null, "código : " + actual.getDetalleVentas().getCodigoProducto());
            JOptionPane.showMessageDialog(null, "Precio de venta : " + actual.getDetalleVentas().getPrecioDeVenta());
            JOptionPane.showMessageDialog(null, "cantidad a comprar : " + actual.getDetalleVentas().getCantidadAcomprar());

            JOptionPane.showMessageDialog(null, "valor a descontar : " + actual.getDetalleVentas().getValorAdescontar());

            actual = actual.getSiguiente();
        }
    }

    public DetalleVentas(int codigoProducto, int precioDeVenta, int cantidadAcomprar, int valorAdescontar) {
        this.codigoProducto = codigoProducto;
        this.precioDeVenta = precioDeVenta;
        this.cantidadAcomprar = cantidadAcomprar;

        this.valorAdescontar = valorAdescontar;

    }

    public int valorTotal() {

        cobroSinIva = precioDeVenta * cantidadAcomprar;
        JOptionPane.showMessageDialog(null, "El cobro sin iva es de: " + cobroSinIva);
        iva = cobroSinIva * 19;
        JOptionPane.showMessageDialog(null, "El cobro del iva es de : " + iva);
        valorAcobrarPorIva = iva * cantidadAcomprar;
        JOptionPane.showMessageDialog(null, "valor a cobrar por iva : " + valorAcobrarPorIva);
        valoeDeDescuentoAplicado = cobroSinIva - valoeDeDescuentoAplicado;
        JOptionPane.showMessageDialog(null, "valor de descuento aplicad: " + valoeDeDescuentoAplicado);
        valorTotalApagar = cobroSinIva + iva + valoeDeDescuentoAplicado;
        JOptionPane.showMessageDialog(null, "El valor total a cobrar por el producto es: " + valorTotalApagar);
        return iva;
    }

    public long getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public long getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(int precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public long getCantidadAcomprar() {
        return cantidadAcomprar;
    }

    public void setCantidadAcomprar(int cantidadAcomprar) {
        this.cantidadAcomprar = cantidadAcomprar;
    }

    public long getValoeDeDescuentoAplicado() {
        return valoeDeDescuentoAplicado;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public void setValoeDeDescuentoAplicado(int valoeDeDescuentoAplicado) {
        this.valoeDeDescuentoAplicado = valoeDeDescuentoAplicado;
    }

    public long getCobroSinIva() {
        return cobroSinIva;
    }

    public void setCobroSinIva(int cobroSinIva) {
        this.cobroSinIva = cobroSinIva;
    }

    public long getValorAdescontar() {
        return valorAdescontar;
    }

    public void setValorAdescontar(int valorAdescontar) {
        this.valorAdescontar = valorAdescontar;
    }

    public long getValorAcobrarPorIva() {
        return valorAcobrarPorIva;
    }

    public void setValorAcobrarPorIva(int valorAcobrarPorIva) {
        this.valorAcobrarPorIva = valorAcobrarPorIva;
    }

    public long getValorTotalApagar() {
        return valorTotalApagar;
    }

    public void setValorTotalApagar(int valorTotalApagar) {
        this.valorTotalApagar = valorTotalApagar;
    }

}
