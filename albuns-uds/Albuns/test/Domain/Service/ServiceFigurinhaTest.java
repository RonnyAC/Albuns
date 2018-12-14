/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Domain.Argument.Figurinha.AdicionarFigurinhaRequest;
import Domain.Argument.Figurinha.AdicionarFigurinhaResponse;
import Domain.Argument.Figurinha.EditarFigurinhaRequest;
import Domain.Argument.Figurinha.EditarFigurinhaResponse;
import Domain.Argument.Figurinha.FigurinhaResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ronny
 */
public class ServiceFigurinhaTest {
    
    public ServiceFigurinhaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Adicionar method, of class ServiceFigurinha.
     */
    @Test
    public void testAdicionar() {
        System.out.println("Adicionar");
        AdicionarFigurinhaRequest request = null;
        ServiceFigurinha instance = new ServiceFigurinha();
        AdicionarFigurinhaResponse expResult = null;
        AdicionarFigurinhaResponse result = instance.Adicionar(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class ServiceFigurinha.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        EditarFigurinhaRequest request = null;
        int id = 0;
        ServiceFigurinha instance = new ServiceFigurinha();
        EditarFigurinhaResponse expResult = null;
        EditarFigurinhaResponse result = instance.Editar(request, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Remover method, of class ServiceFigurinha.
     */
    @Test
    public void testRemover() {
        System.out.println("Remover");
        int id = 0;
        ServiceFigurinha instance = new ServiceFigurinha();
        instance.Remover(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class ServiceFigurinha.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        ServiceFigurinha instance = new ServiceFigurinha();
        FigurinhaResponse expResult = null;
        FigurinhaResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
