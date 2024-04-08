package unidad2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Zzzz
 */
public class ListaClientes {

    List<Clientes> listicaClientes;

    public ListaClientes() {
    }

    public ListaClientes(List<Clientes> listicaClientes) {
        this.listicaClientes = listicaClientes;
    }

    public Calendar fecha() {
        Calendar calendario = new GregorianCalendar(2024, Calendar.FEBRUARY, 15);
        int año = calendario.get(Calendar.YEAR);
        JOptionPane.showMessageDialog(null, "año" + año);
        int mes = calendario.get(Calendar.MONTH);
        JOptionPane.showMessageDialog(null, "mes" + mes);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        JOptionPane.showMessageDialog(null, "día" + dia);
        return calendario;

    }

    public List<Clientes> clientes1() {

        List<Clientes> listaClientes = new ArrayList<>();
        ListaClientes c1 = new ListaClientes();
        Clientes cliente1 = new Clientes(307888, "Mark zucaritas", "masculino","14 de mayo de 1984", 300158742, "Markzucaritas@lemon.com", "turbaco city", "VIP",10);
        listaClientes.add(cliente1);
        JOptionPane.showMessageDialog(null,"El número de cédula del cliente es: "+ cliente1.getCedulaCliente());
        JOptionPane.showMessageDialog(null,"El completo  del cliente es: "+ cliente1.getNombreYapellidos());
        JOptionPane.showMessageDialog(null,"El género del cliente es: "+ cliente1.getGenero());
        JOptionPane.showMessageDialog(null,"El fecha de nacimiento del cliente es: "+ fecha());
        JOptionPane.showMessageDialog(null,"El número de celular del cliente es: "+ cliente1.getCelular());
        JOptionPane.showMessageDialog(null,"El email del cliente es: "+ cliente1.getEmail());
        JOptionPane.showMessageDialog(null,"La dirección del cliente es: "+ cliente1.getDireccion());
        JOptionPane.showMessageDialog(null,"El estado del cliente es: "+ cliente1.getEstado());
        return listaClientes;
    }

    public List<Clientes> getListicaClientes() {
        return listicaClientes;
    }

    public void setListicaClientes(List<Clientes> listicaClientes) {
        this.listicaClientes = listicaClientes;
    }

}
