/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestordeinventario;

/**
 *
 * @author Kenneth
 */
import java.util.List;

public class CalculadorDePrecioPorCategoria implements CalculadorDePrecio {
    private Categoria categoria;

    public CalculadorDePrecioPorCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : categoria.getProductos()) {
            if (productos.contains(producto)) {
                total += producto.getPrecio() * producto.getCantidad();
            }
        }
        return total;
    }
}
