/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalResponse;
import Domain.Argument.AlbumOriginal.AlbumOriginalResponse;
import Domain.Argument.AlbumOriginal.EditarAlbumOriginalResponse;
import Domain.Entity.AlbumOriginal;
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
public class AlbumOriginalRepositoryTest {
    
    public AlbumOriginalRepositoryTest() {
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
     * Test of AdicionarAlbum method, of class AlbumOriginalRepository.
     */
    @Test
    public void testAdicionarAlbum() {
        System.out.println("AdicionarAlbum");
        AlbumOriginal albumOriginal = null;
        AlbumOriginalRepository instance = new AlbumOriginalRepository();
        AdicionarAlbumOriginalResponse expResult = null;
        AdicionarAlbumOriginalResponse result = instance.AdicionarAlbum(albumOriginal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditarAlbum method, of class AlbumOriginalRepository.
     */
    @Test
    public void testEditarAlbum() {
        System.out.println("EditarAlbum");
        AlbumOriginal albumOriginal = null;
        int id = 0;
        AlbumOriginalRepository instance = new AlbumOriginalRepository();
        EditarAlbumOriginalResponse expResult = null;
        EditarAlbumOriginalResponse result = instance.EditarAlbum(albumOriginal, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverAlbum method, of class AlbumOriginalRepository.
     */
    @Test
    public void testRemoverAlbum() {
        System.out.println("RemoverAlbum");
        int id = 0;
        AlbumOriginalRepository instance = new AlbumOriginalRepository();
        instance.RemoverAlbum(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class AlbumOriginalRepository.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        AlbumOriginalRepository instance = new AlbumOriginalRepository();
        AlbumOriginalResponse expResult = null;
        AlbumOriginalResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
