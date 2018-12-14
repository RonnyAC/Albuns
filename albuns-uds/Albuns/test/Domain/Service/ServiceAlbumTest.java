/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Domain.Argument.Album.AdicionarAlbumRequest;
import Domain.Argument.Album.AdicionarAlbumResponse;
import Domain.Argument.Album.AlbumResponse;
import Domain.Argument.Album.EditarAlbumRequest;
import Domain.Argument.Album.EditarAlbumResponse;
import java.util.List;
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
public class ServiceAlbumTest {
    
    public ServiceAlbumTest() {
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
     * Test of Adicionar method, of class ServiceAlbum.
     */
    @Test
    public void testAdicionar() {
        System.out.println("Adicionar");
        AdicionarAlbumRequest request = null;
        ServiceAlbum instance = new ServiceAlbum();
        AdicionarAlbumResponse expResult = null;
        AdicionarAlbumResponse result = instance.Adicionar(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class ServiceAlbum.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        EditarAlbumRequest request = null;
        int id = 0;
        ServiceAlbum instance = new ServiceAlbum();
        EditarAlbumResponse expResult = null;
        EditarAlbumResponse result = instance.Editar(request, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Remover method, of class ServiceAlbum.
     */
    @Test
    public void testRemover() {
        System.out.println("Remover");
        int id = 0;
        ServiceAlbum instance = new ServiceAlbum();
        instance.Remover(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class ServiceAlbum.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        ServiceAlbum instance = new ServiceAlbum();
        AlbumResponse expResult = null;
        AlbumResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Listar method, of class ServiceAlbum.
     */
    @Test
    public void testListar() {
        System.out.println("Listar");
        ServiceAlbum instance = new ServiceAlbum();
        List<AlbumResponse> expResult = null;
        List<AlbumResponse> result = instance.Listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
