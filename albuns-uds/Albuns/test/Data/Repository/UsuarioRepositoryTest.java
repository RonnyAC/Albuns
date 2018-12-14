/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Domain.Argument.Usuario.AdicionarUsuarioResponse;
import Domain.Argument.Usuario.EditarUsuarioResponse;
import Domain.Argument.Usuario.UsuarioResponse;
import Domain.Entity.Usuario;
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
public class UsuarioRepositoryTest {
    
    public UsuarioRepositoryTest() {
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
     * Test of AdicionarUsusario method, of class UsuarioRepository.
     */
    @Test
    public void testAdicionarUsusario() {
        System.out.println("AdicionarUsusario");
        Usuario usuario = null;
        UsuarioRepository instance = new UsuarioRepository();
        AdicionarUsuarioResponse expResult = null;
        AdicionarUsuarioResponse result = instance.AdicionarUsusario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditarAlbum method, of class UsuarioRepository.
     */
    @Test
    public void testEditarAlbum() {
        System.out.println("EditarAlbum");
        Usuario usuario = null;
        int id = 0;
        UsuarioRepository instance = new UsuarioRepository();
        EditarUsuarioResponse expResult = null;
        EditarUsuarioResponse result = instance.EditarAlbum(usuario, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverAlbum method, of class UsuarioRepository.
     */
    @Test
    public void testRemoverAlbum() {
        System.out.println("RemoverAlbum");
        int id = 0;
        UsuarioRepository instance = new UsuarioRepository();
        instance.RemoverAlbum(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class UsuarioRepository.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        UsuarioRepository instance = new UsuarioRepository();
        UsuarioResponse expResult = null;
        UsuarioResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
