/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Domain.Argument.Colecao.AdicionarColecaoRequest;
import Domain.Argument.Colecao.AdicionarColecaoResponse;
import Domain.Argument.Colecao.ColecaoResponse;
import Domain.Argument.Colecao.EditarColecaoRequest;
import Domain.Argument.Colecao.EditarColecaoResponse;
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
public class ServiceColecaoTest {
    
    public ServiceColecaoTest() {
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
     * Test of Adicionar method, of class ServiceColecao.
     */
    @Test
    public void testAdicionar() {
        System.out.println("Adicionar");
        AdicionarColecaoRequest request = null;
        ServiceColecao instance = new ServiceColecao();
        AdicionarColecaoResponse expResult = null;
        AdicionarColecaoResponse result = instance.Adicionar(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class ServiceColecao.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        EditarColecaoRequest request = null;
        int id = 0;
        ServiceColecao instance = new ServiceColecao();
        EditarColecaoResponse expResult = null;
        EditarColecaoResponse result = instance.Editar(request, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Remover method, of class ServiceColecao.
     */
    @Test
    public void testRemover() {
        System.out.println("Remover");
        int id = 0;
        ServiceColecao instance = new ServiceColecao();
        instance.Remover(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class ServiceColecao.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        ServiceColecao instance = new ServiceColecao();
        ColecaoResponse expResult = null;
        ColecaoResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
