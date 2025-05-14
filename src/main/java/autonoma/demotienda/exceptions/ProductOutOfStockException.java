/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demotienda.exceptions;

/**
 *
 * @author Maria Paz Puerta
 */
public class ProductOutOfStockException extends RuntimeException {

    public ProductOutOfStockException() {
        super("No hay productos por comprar");
    }
    
}
