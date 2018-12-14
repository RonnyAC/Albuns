/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Domain.Argument.Figurinha.AdicionarFigurinhaResponse;
import Domain.Argument.Figurinha.EditarFigurinhaResponse;
import Domain.Argument.Figurinha.FigurinhaResponse;
import Domain.Entity.Figurinha;
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
public class FigurinhaRepositoryTest {
    
    public FigurinhaRepositoryTest() {
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
     * Test of AdicionarFigurinha method, of class FigurinhaRepository.
     */
    @Test
    public void testAdicionarFigurinha() {
        System.out.println("AdicionarFigurinha");
        Figurinha figurinha = null;
        FigurinhaRepository instance = new FigurinhaRepository();
        AdicionarFigurinhaResponse expResult = null;
        AdicionarFigurinhaResponse result = instance.AdicionarFigurinha(figurinha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditarAlbum method, of class FigurinhaRepository.
     */
    @Test
    public void testEditarAlbum() {
        System.out.println("EditarAlbum");
        Figurinha figurinha = null;
        int id = 0;
        FigurinhaRepository instance = new FigurinhaRepository();
        EditarFigurinhaResponse expResult = null;
        EditarFigurinhaResponse result = instance.EditarAlbum(figurinha, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverAlbum method, of class FigurinhaRepository.
     */
    @Test
    public void testRemoverAlbum() {
        System.out.println("RemoverAlbum");
        int id = 0;
        FigurinhaRepository instance = new FigurinhaRepository();
        instance.RemoverAlbum(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class FigurinhaRepository.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        FigurinhaRepository instance = new FigurinhaRepository();
        FigurinhaResponse expResult = null;
        FigurinhaResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
