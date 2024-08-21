/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestordeinventario;

/**
 *
 * @author Kenneth
 */
public class ProductoElectrónico extends Producto {
    private int garantia;

    public ProductoElectrónico(String nombre, double precio, int cantidad, Proveedor proveedor, int garantia) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

    @Override
    public String getDetalles() {
        return String.format("Electrónico: %s, Precio: %.2f, Garantía: %d años", getNombre(), getPrecio(), garantia);
    }
}
