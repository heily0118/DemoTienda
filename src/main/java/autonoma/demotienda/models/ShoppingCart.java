/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demotienda.models;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ShoppingCart {
    
    private User user;
    private ArrayList<Product>productos;
    
    private int id;

    public ShoppingCart(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Product searchProduct(int id){
        for (Product producto : productos){
            if (producto.getId() == id){
                System.out.println("El producto " + id + "ha sido encontrado");
                return producto;
            }
        }
        return null; 
    }
    
    
}
