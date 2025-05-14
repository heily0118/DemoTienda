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

    public ShoppingCart(User user, ArrayList<Product> productos, int id) {
        this.user = user;
        this.productos = productos;
        this.id = id;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Product> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Product> productos) {
        this.productos = productos;
    }
    
     public void agregarProducto(Product producto) {
        productos.add(producto);
    }
    
    
    
}
