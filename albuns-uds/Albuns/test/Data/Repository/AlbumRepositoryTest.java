/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Domain.Argument.Album.AdicionarAlbumResponse;
import Domain.Argument.Album.AlbumResponse;
import Domain.Argument.Album.EditarAlbumResponse;
import Domain.Entity.Album;
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
public class AlbumRepositoryTest {
    
    public AlbumRepositoryTest() {
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
     * Test of AdicionarAlbum method, of class AlbumRepository.
     */
    @Test
    public void testAdicionarAlbum() {
        System.out.println("AdicionarAlbum");
        Album album = null;
        AlbumRepository instance = new AlbumRepository();
        AdicionarAlbumResponse expResult = null;
        AdicionarAlbumResponse result = instance.AdicionarAlbum(album);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditarAlbum method, of class AlbumRepository.
     */
    @Test
    public void testEditarAlbum() {
        System.out.println("EditarAlbum");
        Album album = null;
        int id = 0;
        AlbumRepository instance = new AlbumRepository();
        EditarAlbumResponse expResult = null;
        EditarAlbumResponse result = instance.EditarAlbum(album, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverAlbum method, of class AlbumRepository.
     */
    @Test
    public void testRemoverAlbum() {
        System.out.println("RemoverAlbum");
        int id = 0;
        AlbumRepository instance = new AlbumRepository();
        instance.RemoverAlbum(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class AlbumRepository.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        AlbumRepository instance = new AlbumRepository();
        AlbumResponse expResult = null;
        AlbumResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
