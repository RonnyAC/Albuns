/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalRequest;
import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalResponse;
import Domain.Argument.AlbumOriginal.AlbumOriginalResponse;
import Domain.Argument.AlbumOriginal.EditarAlbumOriginalRequest;
import Domain.Argument.AlbumOriginal.EditarAlbumOriginalResponse;
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
public class ServiceAlbumOriginalTest {
    
    public ServiceAlbumOriginalTest() {
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
     * Test of Adicionar method, of class ServiceAlbumOriginal.
     */
    @Test
    public void testAdicionar() {
        System.out.println("Adicionar");
        AdicionarAlbumOriginalRequest request = null;
        ServiceAlbumOriginal instance = new ServiceAlbumOriginal();
        AdicionarAlbumOriginalResponse expResult = null;
        AdicionarAlbumOriginalResponse result = instance.Adicionar(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class ServiceAlbumOriginal.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        EditarAlbumOriginalRequest request = null;
        int id = 0;
        ServiceAlbumOriginal instance = new ServiceAlbumOriginal();
        EditarAlbumOriginalResponse expResult = null;
        EditarAlbumOriginalResponse result = instance.Editar(request, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Remover method, of class ServiceAlbumOriginal.
     */
    @Test
    public void testRemover() {
        System.out.println("Remover");
        int id = 0;
        ServiceAlbumOriginal instance = new ServiceAlbumOriginal();
        instance.Remover(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class ServiceAlbumOriginal.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        ServiceAlbumOriginal instance = new ServiceAlbumOriginal();
        AlbumOriginalResponse expResult = null;
        AlbumOriginalResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
