/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Domain.Argument.Colecao.AdicionarColecaoResponse;
import Domain.Argument.Colecao.ColecaoResponse;
import Domain.Argument.Colecao.EditarColecaoResponse;
import Domain.Entity.Colecao;
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
public class ColecaoRepositoryTest {
    
    public ColecaoRepositoryTest() {
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
     * Test of AdicionarColecao method, of class ColecaoRepository.
     */
    @Test
    public void testAdicionarColecao() {
        System.out.println("AdicionarColecao");
        Colecao colecao = null;
        ColecaoRepository instance = new ColecaoRepository();
        AdicionarColecaoResponse expResult = null;
        AdicionarColecaoResponse result = instance.AdicionarColecao(colecao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditarAlbum method, of class ColecaoRepository.
     */
    @Test
    public void testEditarAlbum() {
        System.out.println("EditarAlbum");
        Colecao colecao = null;
        int id = 0;
        ColecaoRepository instance = new ColecaoRepository();
        EditarColecaoResponse expResult = null;
        EditarColecaoResponse result = instance.EditarAlbum(colecao, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverAlbum method, of class ColecaoRepository.
     */
    @Test
    public void testRemoverAlbum() {
        System.out.println("RemoverAlbum");
        int id = 0;
        ColecaoRepository instance = new ColecaoRepository();
        instance.RemoverAlbum(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetById method, of class ColecaoRepository.
     */
    @Test
    public void testGetById() {
        System.out.println("GetById");
        int id = 0;
        ColecaoRepository instance = new ColecaoRepository();
        ColecaoResponse expResult = null;
        ColecaoResponse result = instance.GetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
