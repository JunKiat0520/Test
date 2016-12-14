/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Member;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author This PC
 */
public class MemberBusinessTierTest {
    
    public MemberBusinessTierTest() {
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
     * Test of CreateMember method, of class MemberBusinessTier.
     */
    @Test
    public void testCreateMember() throws Exception {
        System.out.println("CreateMember");
        String password = "!!Q123123";
        String secret_pass = "!!Q123123";
        String name = "123123123";
        String ic = "960520-10-5163";
        String hp = "0102727180";
        String address = "123123121231231231233123";
        MemberBusinessTier instance = new MemberBusinessTier();
        String expResult = "M145";
        String result = instance.CreateMember(password, secret_pass, name, ic, hp, address);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of RetrieveMember method, of class MemberBusinessTier.
     */


    /**
     * Test of DeleteMember method, of class MemberBusinessTier.
     */
    @Test
    public void testDeleteMember() throws Exception {
        System.out.println("DeleteMember");
        String id = "M143";
        MemberBusinessTier instance = new MemberBusinessTier();
        boolean expResult = true;
        boolean result = instance.DeleteMember(id);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of UpdateMember method, of class MemberBusinessTier.
     */
    @Test
    public void testUpdateMember() throws Exception {
        System.out.println("UpdateMember");
       String name = "123123123";
        String ic = "960520-10-5163";
        String hp = "0102727180";
        String address = "123123121231231231233123";
        String id="M107";
        MemberBusinessTier instance = new MemberBusinessTier();
        boolean expResult = true;
        boolean result = instance.UpdateMember(name, id, hp, address, ic);
        assertEquals(expResult, result);
   
    }
    
}
