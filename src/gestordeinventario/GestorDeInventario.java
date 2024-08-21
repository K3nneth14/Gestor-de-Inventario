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

public class GestorDeInventario {
    private CalculadorDePrecio calculadorDePrecio;
    private Descuento descuento;

    public GestorDeInventario(CalculadorDePrecio calculadorDePrecio, Descuento descuento) {
        this.calculadorDePrecio = calculadorDePrecio;
        this.descuento = descuento;
    }

    public double calcularPrecioTotal(List<Producto> productos) {
        double precioTotal = calculadorDePrecio.calcularPrecioTotal(productos);
        return descuento.aplicarDescuento(precioTotal);
    }
}
