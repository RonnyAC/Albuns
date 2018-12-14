/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasRequest;
import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.EditarFigurinhasNaoAlocadasRequest;
import Domain.Argument.FigurinhasNaoAlocadas.EditarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.FigurinhasNaoAlocadasResponse;
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
public class ServiceFigurinhasNaoAlocadasTest {
    
    public ServiceFigurinhasNaoAlocadasTest() {
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
     * Test of Adicionar method, of class ServiceFigurinhasNaoAlocadas.
     */
    @Test
    public void testAdicionar() {
        System.out.println("Adicionar");
        AdicionarFigurinhasNaoAlocadasRequest request = null;
        ServiceFigurinhasNaoAlocadas instance = new ServiceFigurinhasNaoAlocadas();
        AdicionarFigurinhasNaoAlocadasResponse expResult = null;
        AdicionarFigurinhasNaoAlocadasResponse result = instance.Adicionar(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class ServiceFigurinhasNaoAlocadas.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        EditarFigurinhasNaoAlocadasRequest request = null;
        int id = 0;
        ServiceFigurinhasNaoAlocadas instance = new ServiceFigurinhasNaoAlocadas();
        EditarFigurinhasNaoAlocadasResponse expResult = null;
        EditarFigurinhasNaoAlocadasResponse result = instance.Editar(request, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Remover method, of class ServiceFigurinhasNaoAlocadas.
     */
    @Test
    public void testRemover() {
        System.out.println("Remover");
        int id = 0;
        ServiceFigurinhasNaoAlocadas instance = new ServiceFigurinhasNaoAlocadas();
        instance.Remover(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class ServiceFigurinhasNaoAlocadas.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        ServiceFigurinhasNaoAlocadas instance = new ServiceFigurinhasNaoAlocadas();
        FigurinhasNaoAlocadasResponse expResult = null;
        FigurinhasNaoAlocadasResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
