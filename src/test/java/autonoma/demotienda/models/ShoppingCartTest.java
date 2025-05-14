/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package autonoma.demotienda.models;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
public class ShoppingCartTest {
    
    public ShoppingCartTest() {
    }

    @org.junit.jupiter.api.Test
    public void testGetUser() {
        System.out.println("getUser");
        ShoppingCart instance = null;
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        ShoppingCart instance = null;
        instance.setUser(user);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testGetProductos() {
        System.out.println("getProductos");
        ShoppingCart instance = null;
        ArrayList<Product> expResult = null;
        ArrayList<Product> result = instance.getProductos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testSetProductos() {
        System.out.println("setProductos");
        ArrayList<Product> productos = null;
        ShoppingCart instance = null;
        instance.setProductos(productos);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testSearchProduct() {
        System.out.println("searchProduct");
        int id = 0;
        ShoppingCart instance = null;
        Product expResult = null;
        Product result = instance.searchProduct(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testAgregarProducto() {
        System.out.println("agregarProducto");
        Product producto = null;
        ShoppingCart instance = null;
        boolean expResult = false;
        boolean result = instance.agregarProducto(producto);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testEliminarProducto() {
        System.out.println("eliminarProducto");
        Product producto = null;
        ShoppingCart instance = null;
        boolean expResult = false;
        boolean result = instance.eliminarProducto(producto);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testObtenerCantidadProductor() {
        System.out.println("obtenerCantidadProductor");
        ShoppingCart instance = null;
        int expResult = 0;
        int result = instance.obtenerCantidadProductor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testCompraProducto() {
        System.out.println("CompraProducto");
        ShoppingCart instance = null;
        instance.CompraProducto();
        fail("The test case is a prototype.");
    }
    
}
