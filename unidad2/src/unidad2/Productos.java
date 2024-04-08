package unidad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author Zzzz
 */
public class Productos {

    public int codigo;
    public int unidadesDisponibles;
    public int unidadesCompradas;
    public String nombre;
    public String marca;
    public String color;
    public String metricasDeMedidas;
    public String categoria;
    public int precioDeVenta;
    public int precioDeCompra;
    public int porcentajeDeDescuentoMaximo;
    public Nodo inicio, fin;

    public Productos() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregarAlFinal(Productos producto) {
        Nodo nuevoNodo = new Nodo(producto);
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
            JOptionPane.showMessageDialog(null, "código : " + actual.getProducto().getCodigo());
            JOptionPane.showMessageDialog(null, "Unidades disponibles : " + actual.getProducto().getUnidadesDisponibles());
            JOptionPane.showMessageDialog(null, "Unidades compradas : " + actual.getProducto().getUnidadesCompradas());
            JOptionPane.showMessageDialog(null, "Nombre : " + actual.getProducto().getNombre());
            JOptionPane.showMessageDialog(null, "Marca : " + actual.getProducto().getMarca());
            JOptionPane.showMessageDialog(null, "color : " + actual.getProducto().getColor());

            JOptionPane.showMessageDialog(null, "La metrica de medida es: : " + actual.getProducto().getMetricasDeMedidas());
            JOptionPane.showMessageDialog(null, "Categoría : " + actual.getProducto().getCategoria());
            JOptionPane.showMessageDialog(null, "Precio de venta: " + actual.getProducto().getPrecioDeVenta());
            JOptionPane.showMessageDialog(null, "Precio de compra : " + actual.getProducto().getPrecioDeCompra());
            JOptionPane.showMessageDialog(null, "Porcentaje de descuento máximo : " + actual.getProducto().getPorcentajeDeDescuentoMaximo());

            actual = actual.getSiguiente();
        }
    }

    public void editarDatos(int codigo, int precioCompra, int porcentajeDescuentoMaximo, int unidadesExistencia) {

        Nodo actual = inicio;

        while (actual != null && actual.getProducto().getCodigo() != codigo) {
            actual = actual.getSiguiente();
        }

        if (actual != null) {
            Productos productoActualizado = actual.getProducto();
            productoActualizado.setPrecioDeCompra(precioCompra);
            productoActualizado.setPrecioDeVenta((int) (precioCompra * 1.4));
            productoActualizado.setPorcentajeDeDescuentoMaximo(porcentajeDescuentoMaximo);
            productoActualizado.setUnidadesDisponibles(unidadesExistencia);
        }

    }

    public Boolean buscarNodo(int unidadesDisponibles) {

        Nodo actual = inicio;

        while (actual != null && actual.getProducto().getUnidadesDisponibles() != unidadesDisponibles) {
            actual = actual.getSiguiente();
        }

        return actual != null;

    }

    public List<Map<String, Object>> ordenar() {

        List<Map<String, Object>> productosFiltradosAgrupados = new ArrayList<>();

        Nodo actual = inicio;
        while (actual != null) {

            if (actual.getProducto().getUnidadesDisponibles() > 0) {

                Map<String, Object> productoMap = new HashMap<>();
                productoMap.put("codigo", actual.getProducto().getCodigo());
                productoMap.put("nombre", actual.getProducto().getNombre());
                productoMap.put("categoria", actual.getProducto().getCategoria());
                productosFiltradosAgrupados.add(productoMap);
            }
            actual = actual.getSiguiente();
        }

        Collections.sort(productosFiltradosAgrupados, (producto1, producto2)
                -> producto1.get("nombre").toString().compareTo(producto2.get("nombre").toString()));

        Map<String, List<Map<String, Object>>> productosAgrupadosPorCategoria = productosFiltradosAgrupados.stream()
                .collect(Collectors.groupingBy(producto -> producto.get("categoria").toString()));

        List<Map<String, Object>> listaProductosAgrupados = new ArrayList<>();
        for (Map.Entry<String, List<Map<String, Object>>> entry : productosAgrupadosPorCategoria.entrySet()) {
            Map<String, Object> categoriaMap = new HashMap<>();
            categoriaMap.put("categoria", entry.getKey());
            categoriaMap.put("productos", entry.getValue());
            listaProductosAgrupados.add(categoriaMap);
        }

        return listaProductosAgrupados;
    }

    public void disminuirUnidadesDisponibles(int unidadesVendidas, int codigo) {

        if (unidadesVendidas <= 0) {
            throw new IllegalArgumentException("Las unidades vendidas deben ser un valor positivo");
        }

        Nodo actual = inicio;
        while (actual != null && actual.getProducto().getCodigo() != codigo) {
            actual = actual.getSiguiente();
        }

        if (actual != null) {

            actual.getProducto().setUnidadesDisponibles(actual.getProducto().getUnidadesDisponibles() - unidadesCompradas);

            actual.getProducto().setUnidadesCompradas(actual.getProducto().getUnidadesCompradas() + unidadesCompradas);

            JOptionPane.showMessageDialog(null, "Unidades disponibles actualizadas con éxito. Unidades vendidas : " + actual.getProducto().getUnidadesCompradas());
        } else {

            JOptionPane.showMessageDialog(null, "No se encontró el producto con el código " + codigo);
        }

    }

    public void MenoresA5unidades() {

        Nodo actual = inicio;

        while (actual != null) {

            if (actual.getProducto().getUnidadesDisponibles() < 5) {
                System.out.println("Estos son los valores que tiene menos de 5 unidades"
                        + "\n:");

                JOptionPane.showMessageDialog(null, "Código: " + actual.getProducto().getCodigo());
                System.out.println("Código: " + actual.getProducto().getCodigo());
                JOptionPane.showMessageDialog(null, "Nombre: " + actual.getProducto().getNombre());
                System.out.println("Nombre: " + actual.getProducto().getNombre());
                JOptionPane.showMessageDialog(null, "marca: " + actual.getProducto().getMarca());
                System.out.println("marca: " + actual.getProducto().getMarca());
                JOptionPane.showMessageDialog(null, "Unidades disponibles: " + actual.getProducto().getUnidadesDisponibles());
                System.out.println("Unidades disponibles: " + actual.getProducto().getUnidadesDisponibles());
            }

            actual = actual.getSiguiente();
        }

        if (actual == null) {
            JOptionPane.showMessageDialog(null, "No se encontraron productos con unidades compradas menores a 5");
        }
    }

    public int DineroInvertido() {

        int totalDineroInvertido = 0;
        Nodo actual = inicio;

        while (actual != null) {
            totalDineroInvertido += actual.getProducto().getUnidadesCompradas() * actual.getProducto().getPrecioDeCompra();
            actual = actual.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "Total dinero invertido: $" + totalDineroInvertido);
        return totalDineroInvertido;

    }

    public Productos(int codigo, int unidadesDisponibles, int unidadesCompradas, String nombre, String marca, String color, String metricasDeMedidas, String categoria, int precioDeVenta, int precioDeCompra, int porcentajeDeDescuentoMaximo) {
        this.codigo = codigo;
        this.unidadesDisponibles = unidadesDisponibles;
        this.unidadesCompradas = unidadesCompradas;
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.metricasDeMedidas = metricasDeMedidas;
        this.categoria = categoria;
        this.precioDeVenta = precioDeVenta;
        this.precioDeCompra = precioDeCompra;
        this.porcentajeDeDescuentoMaximo = porcentajeDeDescuentoMaximo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public int getUnidadesCompradas() {
        return unidadesCompradas;
    }

    public void setUnidadesCompradas(int unidadesCompradas) {
        this.unidadesCompradas = unidadesCompradas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMetricasDeMedidas() {
        return metricasDeMedidas;
    }

    public void setMetricasDeMedidas(String metricasDeMedidas) {
        this.metricasDeMedidas = metricasDeMedidas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(int precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public int getPrecioDeCompra() {
        return precioDeCompra;
    }

    public void setPrecioDeCompra(int precioDeCompra) {
        this.precioDeCompra = precioDeCompra;
    }

    public int getPorcentajeDeDescuentoMaximo() {
        return porcentajeDeDescuentoMaximo;
    }

    public void setPorcentajeDeDescuentoMaximo(int porcentajeDeDescuentoMaximo) {
        this.porcentajeDeDescuentoMaximo = porcentajeDeDescuentoMaximo;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

}
