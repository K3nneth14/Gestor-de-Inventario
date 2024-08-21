/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestordeinventario;

/**
 *
 * @author Kenneth
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear proveedores
        Proveedor proveedor1 = new Proveedor("Proveedor 1");
        Proveedor proveedor2 = new Proveedor("Proveedor 2");

        // Crear productos
        Producto producto1 = new ProductoElectrónico("Laptop", 1000.00, 10, proveedor1, 2);
        Producto producto2 = new ProductoAlimenticio("Pan", 1.50, 100, proveedor2, "2024-12-31");

        // Agregar productos a proveedores
        proveedor1.agregarProducto(producto1);
        proveedor2.agregarProducto(producto2);

        // Crear categorías
        Categoria categoriaElectrónicos = new Categoria("Electrónicos");
        Categoria categoriaAlimentos = new Categoria("Alimentos");

        categoriaElectrónicos.agregarProducto(producto1);
        categoriaAlimentos.agregarProducto(producto2);

        // Crear calculador y gestor
        CalculadorDePrecio calculador = new CalculadorDePrecioConDescuento(0.10); // 10% descuento
        Descuento descuento = new Descuento(0.05); // 5% descuento adicional
        GestorDeInventario gestor = new GestorDeInventario(calculador, descuento);

        // Calcular precio total
        double precioTotal = gestor.calcularPrecioTotal(Arrays.asList(producto1, producto2));
        System.out.println("Precio total del inventario: " + precioTotal);
    }
}

