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

    @Test
    public void PruebaExitosa() {
        System.out.println("getUser");
        ShoppingCart instance = null;
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    
    
}
