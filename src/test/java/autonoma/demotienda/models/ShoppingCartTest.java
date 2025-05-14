/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package autonoma.demotienda.models;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author USUARIO
 */
public class ShoppingCartTest {
    
    @BeforeEach
    public void setUp(){
        System.out.println("Before Each");
    }
    
    @BeforeAll
    public void ejecucionInicial(){
        System.out.println("Before all");
    }
    
    @Test
    public void pruebaExitosa(){
        System.out.println("Prueba exitosa");
    }
    
    @Test
    public void pruebaErronea(){
        System.out.println("Prueba erronea");
    }
    
   
    
}
