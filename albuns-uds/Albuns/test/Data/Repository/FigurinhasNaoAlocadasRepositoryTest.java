/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.EditarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.FigurinhasNaoAlocadasResponse;
import Domain.Entity.FigurinhasNaoAlocadas;
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
public class FigurinhasNaoAlocadasRepositoryTest {
    
    public FigurinhasNaoAlocadasRepositoryTest() {
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
     * Test of AdicionarFigurinhasNaoAlocadas method, of class FigurinhasNaoAlocadasRepository.
     */
    @Test
    public void testAdicionarFigurinhasNaoAlocadas() {
        System.out.println("AdicionarFigurinhasNaoAlocadas");
        FigurinhasNaoAlocadas figurinhasNaoAlocadas = null;
        FigurinhasNaoAlocadasRepository instance = new FigurinhasNaoAlocadasRepository();
        AdicionarFigurinhasNaoAlocadasResponse expResult = null;
        AdicionarFigurinhasNaoAlocadasResponse result = instance.AdicionarFigurinhasNaoAlocadas(figurinhasNaoAlocadas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditarAlbum method, of class FigurinhasNaoAlocadasRepository.
     */
    @Test
    public void testEditarAlbum() {
        System.out.println("EditarAlbum");
        FigurinhasNaoAlocadas figurinhasNaoAlocadas = null;
        int id = 0;
        FigurinhasNaoAlocadasRepository instance = new FigurinhasNaoAlocadasRepository();
        EditarFigurinhasNaoAlocadasResponse expResult = null;
        EditarFigurinhasNaoAlocadasResponse result = instance.EditarAlbum(figurinhasNaoAlocadas, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverAlbum method, of class FigurinhasNaoAlocadasRepository.
     */
    @Test
    public void testRemoverAlbum() {
        System.out.println("RemoverAlbum");
        int id = 0;
        FigurinhasNaoAlocadasRepository instance = new FigurinhasNaoAlocadasRepository();
        instance.RemoverAlbum(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class FigurinhasNaoAlocadasRepository.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        FigurinhasNaoAlocadasRepository instance = new FigurinhasNaoAlocadasRepository();
        FigurinhasNaoAlocadasResponse expResult = null;
        FigurinhasNaoAlocadasResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
