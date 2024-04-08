package unidad2;

import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Zzzz
 */
public class infoCompra {

    int consecutivo;
    String fechaa;
    String proveedor;
    int codigoCompra;
    double precioSinIva;
    String cantidadesEnMetrica;
    double impuestoIva = 19;
    double valorPorConceptoIva;
    int totalApagar;
    List<Productos> listaProductos;
    public Nodo inicio, fin;

    infoCompra() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregarAlFinal(infoCompra InfoCompra) {
        Nodo nuevoNodo = new Nodo(InfoCompra);
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
            JOptionPane.showMessageDialog(null, "consecutivo : " + actual.getInfoCompra().getConsecutivo());
            JOptionPane.showMessageDialog(null, "consecutivo : " + actual.getInfoCompra().getFechaa());
            JOptionPane.showMessageDialog(null, "consecutivo : " + actual.getInfoCompra().getProveedor());
            JOptionPane.showMessageDialog(null, "consecutivo : " + actual.getInfoCompra().getCodigoCompra());
            JOptionPane.showMessageDialog(null, "consecutivo : " + actual.getInfoCompra().getPrecioSinIva());
            JOptionPane.showMessageDialog(null, "consecutivo : " + actual.getInfoCompra().getCantidadesEnMetrica());
            JOptionPane.showMessageDialog(null, "consecutivo : " + actual.getInfoCompra().getValorPorConceptoIva());
            JOptionPane.showMessageDialog(null, "consecutivo : " + actual.getInfoCompra().getTotalApagar());
            JOptionPane.showMessageDialog(null, "consecutivo : " + actual.getInfoCompra().getListaProductos());

            actual = actual.getSiguiente();
        }
    }

    public infoCompra(int consecutivo, String fechaa, String proveedor, int codigoCompra, double precioSinIva, String cantidadesEnMetrica, double valorPorConceptoIva, int totalApagar, List<Productos> listaProductos) {
        this.consecutivo = consecutivo;
        this.fechaa = fechaa;
        this.proveedor = proveedor;
        this.codigoCompra = codigoCompra;
        this.precioSinIva = precioSinIva;
        this.cantidadesEnMetrica = cantidadesEnMetrica;
        this.valorPorConceptoIva = valorPorConceptoIva;
        this.totalApagar = totalApagar;
        this.listaProductos = listaProductos;
    }

    public void dineroApagar() {
        double dineroApagar;
        precioSinIva = precioSinIva / 1.21;
        valorPorConceptoIva = valorPorConceptoIva + 1.21;
        dineroApagar = (precioSinIva + valorPorConceptoIva + totalApagar) * impuestoIva;
        JOptionPane.showMessageDialog(null, "El dinero que se debe pagar por producto es: " + dineroApagar);

    }

    public List<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public double getImpuestoIva() {
        return impuestoIva;
    }

    public void setImpuestoIva(double impuestoIva) {
        this.impuestoIva = impuestoIva;
    }

    public double getValorPorConceptoIva() {
        return valorPorConceptoIva;
    }

    public void setValorPorConceptoIva(double valorPorConceptoIva) {
        this.valorPorConceptoIva = valorPorConceptoIva;
    }

    public int getTotalApagar() {
        return totalApagar;
    }

    public void setTotalApagar(int totalApagar) {
        this.totalApagar = totalApagar;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getFechaa() {
        return fechaa;
    }

    public void setFechaa(String fechaa) {
        this.fechaa = fechaa;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public double getPrecio() {
        return precioSinIva;
    }

    public void setPrecio(double precio) {
        this.precioSinIva = precioSinIva;
    }

    public String getCantidadesEnMetrica() {
        return cantidadesEnMetrica;
    }

    public void setCantidadesEnMetrica(String cantidadesEnMetrica) {
        this.cantidadesEnMetrica = cantidadesEnMetrica;
    }

}
