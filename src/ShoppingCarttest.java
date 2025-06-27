/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ejercicio_01.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adria
 */
public class ShoppingCarttest {

  private ShoppingCart cart;

   

  public ShoppingCarttest() {

    this.cart = new ShoppingCart();

  }

   

  @Test

  public void addProduct_con_precio_negativo () {

    //ShoppingCart cart = new ShoppingCart();

    cart.addProduct(10.0);

    cart.addProduct(20.0);

    assertEquals(2,cart.getProductCount());

    assertEquals(30.0,cart.getTotal(),0.001);

  }

   

  @Test

    public void addProduct_con_precio_negativo_unhappy () {

    //ShoppingCart cart = new ShoppingCart();

    Exception exception = assertThrows(IllegalArgumentException.class,()->{

       

     cart.addProduct(00.0);  

       

    });

    //cart.addProduct(20.0);

    assertEquals("Price must be positive",exception.getMessage());

    //assertEquals(30.0,cart.getTotal(),0.001);

  }



}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
