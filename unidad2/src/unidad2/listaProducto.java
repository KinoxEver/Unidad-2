package unidad2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Zzzz
 */
public class listaProducto extends Productos {

    List<Productos> productos;
    int verificarCodigo;

    public listaProducto() {
    }

    public List<Productos> lista1() {

        List<Productos> listaProductos = new ArrayList<>();
        Productos producto1 = new Productos(800, 20, 11, "bollo de maíz", "maizal", "amarillo", "unidades", "granos", 15000, 10000, 10);
        listaProductos.add(producto1);
        JOptionPane.showMessageDialog(null, "código : " + producto1.getCodigo());
        JOptionPane.showMessageDialog(null, "Unidades disponibles : " + producto1.getUnidadesDisponibles());
        JOptionPane.showMessageDialog(null, "Unidades compradas : " + producto1.getUnidadesCompradas());
        JOptionPane.showMessageDialog(null, "Nombre : " + producto1.getNombre());
        JOptionPane.showMessageDialog(null, "Marca : " + producto1.getMarca());
        JOptionPane.showMessageDialog(null, "color : " + producto1.getColor());

        JOptionPane.showMessageDialog(null, "Marca : " + producto1.getMarca());
        JOptionPane.showMessageDialog(null, "Color : " + producto1.getColor());

        JOptionPane.showMessageDialog(null, "categoría : " + producto1.getCategoria());
        JOptionPane.showMessageDialog(null, "Precio de venta : " + producto1.getPrecioDeVenta());
        JOptionPane.showMessageDialog(null, "precio de compra : " + producto1.getPrecioDeCompra());
        JOptionPane.showMessageDialog(null, "descuento máximo : " + producto1.getPorcentajeDeDescuentoMaximo());

        return listaProductos;

    }

    public int getVerificarCodigo() {
        return verificarCodigo;
    }

    public void setVerificarCodigo(int verificarCodigo) {
        this.verificarCodigo = verificarCodigo;
    }

    public void editarProducto(int codigo) {

    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public listaProducto(List<Productos> productos) {
        this.productos = productos;
    }

}
