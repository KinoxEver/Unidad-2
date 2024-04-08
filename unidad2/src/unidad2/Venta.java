package unidad2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Zzzz
 */
public class Venta extends DetalleVentas {

    int consecutivo;
    String fecha;
    String AquiPonesDatosCliente;
    int cedulaCliente;
    String medioDePago;
    String modalidad;
    int codigoVenta;
    String estado;
    double promedio;

    public Nodo inicio, fin;

    long confirmar;

    public Venta() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregarAlFinal(Venta venta) {
        Nodo nuevoNodo = new Nodo(venta);
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
            JOptionPane.showMessageDialog(null, "consecutivo : " + actual.getVenta().getConsecutivo());
            JOptionPane.showMessageDialog(null, "fecha: " + actual.getVenta().getFecha());
            JOptionPane.showMessageDialog(null, "descripción del cliente : " + actual.getVenta().getAquiPonesDatosCliente());
            JOptionPane.showMessageDialog(null, "cedula : " + actual.getVenta().getCedulaCliente());
            JOptionPane.showMessageDialog(null, "medio de pago : " + actual.getVenta().getMedioDePago());
            JOptionPane.showMessageDialog(null, "modalidad : " + actual.getVenta().getModalidad());
            JOptionPane.showMessageDialog(null, "código de venta : " + actual.getVenta().getCodigoVenta());
            JOptionPane.showMessageDialog(null, "estado : " + actual.getVenta().getEstado());
            JOptionPane.showMessageDialog(null, "precio de venta : " + actual.getVenta().getPrecioDeVenta());

            actual = actual.getSiguiente();
        }
    }

    public Venta(int consecutivo, String fecha, String AquiPonesDatosCliente, int cedulaCliente, String medioDePago, String modalidad, int codigoVenta, String estado, int precioDeventa) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.AquiPonesDatosCliente = AquiPonesDatosCliente;
        this.cedulaCliente = cedulaCliente;
        this.medioDePago = medioDePago;
        this.modalidad = modalidad;
        this.codigoVenta = codigoVenta;
        this.estado = estado;
        this.precioDeVenta = precioDeventa;

    }

    public void modificarEstadoVenta(int codigoVenta, int precioDeVenta) {

        Nodo actual = inicio;

        while (actual != null && actual.getVenta().getCodigoVenta() != codigoVenta) {
            actual = actual.getSiguiente();
        }

        if (actual != null) {

            if (precioDeVenta > 0) {
                actual.getVenta().setEstado("exito");
                JOptionPane.showMessageDialog(null, "Venta actualizada con éxito. Estado: " + actual.getVenta().getEstado());
            } else {

                JOptionPane.showMessageDialog(null, "Venta cancelada. Precio de venta no válido.");
            }
        } else {

            JOptionPane.showMessageDialog(null, "No se encontró la venta con el código " + codigoVenta);
        }

    }

    public void PromedioDeVenta() {

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay ventas para calcular el promedio");
            return;
        }

        Nodo actual = inicio;
        long sumaPrecioDeVenta = 0;
        int contadorVentas = 0;

        while (actual != null) {
            sumaPrecioDeVenta += actual.getVenta().getPrecioDeVenta();
            contadorVentas++;
            actual = actual.getSiguiente();

        }

        promedio = sumaPrecioDeVenta / contadorVentas;
        JOptionPane.showMessageDialog(null, "el promedio es: " + promedio);

        if (valorTotalApagar > promedio) {
            JOptionPane.showMessageDialog(null, "los clientes que han tenido compras por encima del promedio se les otorgará un descuento del 10%");
        } else if (valorTotalApagar < promedio) {
            JOptionPane.showConfirmDialog(null, "los clientes que han tenido compras por debajo del promedio se les otorgará un descuento del 15%");
        } else if (valorTotalApagar == 0) {
            JOptionPane.showMessageDialog(null, "los clientes que no han hecho compras se les otorgará un descuento del 25%");
        }

    }

    public int TotalDineroGanado() {

        int totalDineroGanado = 0;
        Nodo actual = inicio;

        while (actual != null) {
            totalDineroGanado += actual.getVenta().getConsecutivo() * actual.getVenta().getPrecioDeVenta();
            actual = actual.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "Este es el Total de dinero ganancia que ha obtenido desde el inicio" + totalDineroGanado);
        return totalDineroGanado;
    }

    public void TotalDineroDescuento() {

        int totalDineroDescuento = 0;
        Nodo actual = inicio;

        while (actual != null) {
            totalDineroDescuento += actual.getVenta().getConsecutivo() * (actual.getVenta().getPrecioDeVenta());
            actual = actual.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "El valor total del descuento es: " + totalDineroDescuento);

    }

    public void TotalDineroIVA() {

        int totalDineroIVA = 0;
        Nodo actual = inicio;

        while (actual != null) {
            totalDineroIVA += actual.getVenta().getConsecutivo() * (actual.getVenta().getPrecioDeVenta() * actual.getVenta().getIva());
            actual = actual.getSiguiente();
        }

        JOptionPane.showMessageDialog(null, "Total dinero pagado como impuesto IVA: " + totalDineroIVA);
    }

    public void setentaDelasVentas() {
       int setentaPorCiento;
        int totalDineroGanado = 0;
        Nodo actual = inicio;

        while (actual != null) {
            totalDineroGanado += actual.getVenta().getConsecutivo() * actual.getVenta().getPrecioDeVenta();
            actual = actual.getSiguiente();
        }
        setentaPorCiento = (totalDineroGanado*70)/100;
        JOptionPane.showMessageDialog(null,"El 70% del total ganado es de: "+ setentaPorCiento);
        
        if (valorTotalApagar<setentaPorCiento){
            JOptionPane.showMessageDialog(null,"Los usuarios que han hecho compras menores al 70% de las ventas tendrán un descuento del 35% en su próxima compra");
        
        }
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAquiPonesDatosCliente() {
        return AquiPonesDatosCliente;
    }

    public void setAquiPonesDatosCliente(String AquiPonesDatosCliente) {
        this.AquiPonesDatosCliente = AquiPonesDatosCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}
