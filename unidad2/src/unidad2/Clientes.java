package unidad2;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Zzzz
 */
public class Clientes extends DetalleVentas {

    long cedulaCliente;
    String nombreYapellidos;
    String genero;
    String fechaNacimiento;
    long celular;
    String email;
    String direccion;
    String estado;
    public Nodo inicio, fin;

    public Clientes() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregarAlFinal(Clientes clientes) {
        Nodo nuevoNodo = new Nodo(clientes);
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
            JOptionPane.showMessageDialog(null, "cedula : " + actual.getClientes().getCedulaCliente());
            JOptionPane.showMessageDialog(null, "Nombre completo : " + actual.getClientes().getNombreYapellidos());
            JOptionPane.showMessageDialog(null, "genero : " + actual.getClientes().getGenero());
            JOptionPane.showMessageDialog(null, "fecha de nacimiento : " + actual.getClientes().getFechaNacimiento());
            JOptionPane.showMessageDialog(null, "celular : " + actual.getClientes().getCelular());
            JOptionPane.showMessageDialog(null, "Email : " + actual.getClientes().getEmail());
            JOptionPane.showMessageDialog(null, "Dirección : " + actual.getClientes().getDireccion());
            JOptionPane.showMessageDialog(null, "Estado : " + actual.getClientes().getEstado());
            JOptionPane.showMessageDialog(null, "Cantidad a comprar : " + actual.getClientes().getCantidadAcomprar());

            actual = actual.getSiguiente();
        }
    }

    public void clientesVip(int cedulaCliente, int cantidadAcomprar) {
        Nodo actual = inicio;

        while (actual != null && actual.getClientes().getCedulaCliente()!= cedulaCliente) {
            actual = actual.getSiguiente();
        }

        if (actual != null) {

            if (cantidadAcomprar > 0) {
                actual.getClientes().setEstado("VIP");
                JOptionPane.showMessageDialog(null, "Estado actualizado con éxito. Estado: " + actual.getClientes().getEstado());
            
        } else {

            JOptionPane.showMessageDialog(null, "No se encontró el cliente con la cédula " + cedulaCliente);
        }
    }
    }
    public Clientes(long cedula, String nombreYapellidos, String genero, String fechaNacimiento, long celular, String email, String direccion, String estado, int cantidadAcomprar) {
        this.cedulaCliente = cedula;
        this.nombreYapellidos = nombreYapellidos;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.email = email;
        this.direccion = direccion;
        this.estado = estado;
        this.cantidadAcomprar = cantidadAcomprar;
    }

    public long getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(long cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreYapellidos() {
        return nombreYapellidos;
    }

    public void setNombreYapellidos(String nombreYapellidos) {
        this.nombreYapellidos = nombreYapellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
