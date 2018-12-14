/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Domain.Argument.Usuario.AdicionarUsuarioRequest;
import Domain.Argument.Usuario.AdicionarUsuarioResponse;
import Domain.Argument.Usuario.EditarUsuarioRequest;
import Domain.Argument.Usuario.EditarUsuarioResponse;
import Domain.Argument.Usuario.UsuarioResponse;
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
public class ServiceUsuarioTest {
    
    public ServiceUsuarioTest() {
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
     * Test of Adicionar method, of class ServiceUsuario.
     */
    @Test
    public void testAdicionar() {
        System.out.println("Adicionar");
        AdicionarUsuarioRequest request = null;
        ServiceUsuario instance = new ServiceUsuario();
        AdicionarUsuarioResponse expResult = null;
        AdicionarUsuarioResponse result = instance.Adicionar(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class ServiceUsuario.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        EditarUsuarioRequest request = null;
        int id = 0;
        ServiceUsuario instance = new ServiceUsuario();
        EditarUsuarioResponse expResult = null;
        EditarUsuarioResponse result = instance.Editar(request, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Remover method, of class ServiceUsuario.
     */
    @Test
    public void testRemover() {
        System.out.println("Remover");
        int id = 0;
        ServiceUsuario instance = new ServiceUsuario();
        instance.Remover(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class ServiceUsuario.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        ServiceUsuario instance = new ServiceUsuario();
        UsuarioResponse expResult = null;
        UsuarioResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
