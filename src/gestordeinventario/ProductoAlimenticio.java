/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestordeinventario;

/**
 *
 * @author Kenneth
 */
public class ProductoAlimenticio extends Producto {
    private String fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, String fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return String.format("Alimenticio: %s, Precio: %.2f, Fecha de Caducidad: %s", getNombre(), getPrecio(), fechaDeCaducidad);
    }
}
