package unidad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Zzzz
 *
 */
public class Unidad2 {

    public static void main(String[] args) {

        Productos producto1 = new Productos(544, 3, 5, "queso", "costeño", "blanco", "kilo", "lacteos", 15000, 10000, 10);

        Productos producto2 = new Productos(147, 15, 7, "suero", "costeño", "blanco", "kilo", "lacteos", 5000, 7000, 10);

        Productos listaProductos = new Productos();
        listaProductos.agregarAlFinal(producto1);
        listaProductos.agregarAlFinal(producto2);

        JOptionPane.showMessageDialog(null, "esta es la lista de productos: ");
        listaProductos.mostrarLista();

        listaProductos.editarDatos(147, 2, 5, 4);
        JOptionPane.showMessageDialog(null, "esta es la lista actualizada de producto 2 : ");
        //En este punto llamo al método para ordenar los datos por categoría y demás requermientos
        JOptionPane.showMessageDialog(null, "Datos ordenados : ");
        listaProductos.ordenar();

        listaProductos.mostrarLista();
        JOptionPane.showMessageDialog(null, "A continuación mostramos las unidades que tenemos disponibles con respecto a las vendidas : ");
        listaProductos.disminuirUnidadesDisponibles(5, 544);

        JOptionPane.showMessageDialog(null, "Estos son los productos que tienen una cantidad existente menor a 5 : ");
        listaProductos.MenoresA5unidades();

        JOptionPane.showMessageDialog(null, "A continuación estaremos mostrando el total del dinero invertido desde el principio en los productos");
        listaProductos.DineroInvertido();

        listaProducto lis = new listaProducto();
        infoCompra info1 = new infoCompra(2, "17 de marzo", "limon corp", 2568, 2500, "kilo", 2500, 25000, lis.lista1());
        infoCompra info2 = new infoCompra(5, "15 de marzo", "limon corp", 25538, 220500, "kilo", 2522400, 2245000, lis.lista1());

        infoCompra listaInfo = new infoCompra();
        listaInfo.agregarAlFinal(info1);
        listaInfo.agregarAlFinal(info2);
        JOptionPane.showMessageDialog(null, "Se mostrará la lista de la info de compra : ");
        listaInfo.mostrarLista();
        listaInfo.dineroApagar();

        DetalleVentas detalle1 = new DetalleVentas(53686, 7000, 8, 2554);
        DetalleVentas detalle2 = new DetalleVentas(325468, 5000, 9, 1000);

        DetalleVentas agregarVentas = new DetalleVentas();

        agregarVentas.agregarAlFinal(detalle1);
        agregarVentas.agregarAlFinal(detalle2);
        JOptionPane.showMessageDialog(null, "Se mostrará la lista de la info de Detalle de ventas : ");
        agregarVentas.mostrarLista();
        detalle1.valorTotal();

        Venta venta1 = new Venta(7, "31 de diciembre", "hombre alto y gordito", 1056565, "contra entrega", "envío", 105583, "en proceso", 20000);
        Venta venta2 = new Venta(8, "20 de septiembre", "se llama Mark Zucaritas", 1053321, "Tarjeta (este men tiene plata)", "envío", 10123, "en proceso", 5000);
        Venta ventita = new Venta();
        ventita.agregarAlFinal(venta1);
        ventita.agregarAlFinal(venta2);
        JOptionPane.showMessageDialog(null, "Se mostrará la lista de VENTAS : ");
        ventita.mostrarLista();
        ventita.modificarEstadoVenta(10123, 5);
        ventita.PromedioDeVenta();
        JOptionPane.showMessageDialog(null, "Se mostrará el dinero total de ganancias que ha ganado : ");
        ventita.TotalDineroGanado();

        ventita.TotalDineroDescuento();
        ventita.TotalDineroIVA();
        ventita.setentaDelasVentas();

        Clientes cliente1 = new Clientes(30458, "Elon Musk", "Masculino", "28 de junio de 1971", 300205878, "elonkmusk@tesla.com", "Cartagena de indias", "referido", 7);
        Clientes cliente2 = new Clientes(3658, "mark zuckerberg", "Masculino", "14 de mayo de 1984", 320583658, "markzucaritas@facebook.com", "turbayork", "VIP", 200);
        Clientes agregar = new Clientes();
        agregar.agregarAlFinal(cliente1);
        agregar.agregarAlFinal(cliente2);
        JOptionPane.showMessageDialog(null, "Se mostrará la lista de la info de Clientes : ");
        agregar.mostrarLista();
        JOptionPane.showMessageDialog(null, "Se mostrará el cambio aplicado de referido a vip : ");
        agregar.clientesVip(30458, 1);
         
    }

}
