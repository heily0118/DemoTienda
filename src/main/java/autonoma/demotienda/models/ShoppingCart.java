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
    private ArrayList<Product> productos;
    


    public ShoppingCart(User user, ArrayList<Product> productos) {
        this.user = user;
        this.productos = productos;
 
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
    
    public Product searchProduct(int id){
        for (Product producto : productos){
            if (producto.getId() == id){
                System.out.println("El producto " + id + "ha sido encontrado");
                return producto;
            }
        }
        return null; 
    }

     public boolean agregarProducto(Product producto) {
        return productos.add(producto);
    }
    
     public boolean eliminarProducto(Product producto){
        return  productos.remove(producto);
         
     }
     
     
     public int obtenerCantidadProductor(){
         return this.productos.size();
     }
    
     public void CompraProducto(){
         
         for (Product producto : productos){
            producto.buy();
         }
     }
    
}
