/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import com.vaadin.data.util.BeanItemContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pro
 */
public class VehiculeTest {
    
    public VehiculeTest() {
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
     * Test of getMarque method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetMarque() {
        System.out.println("getMarque");
        Vehicule instance = new Vehicule();
        String expResult = "";
        String result = instance.getMarque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModele method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetModele() {
        System.out.println("getModele");
        Vehicule instance = new Vehicule();
        String expResult = "";
        String result = instance.getModele();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Vehicule instance = new Vehicule();
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarque method, of class Vehicule.
     */
    @org.junit.Test
    public void testSetMarque() {
        System.out.println("setMarque");
        String marque = "";
        Vehicule instance = new Vehicule();
        instance.setMarque(marque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModele method, of class Vehicule.
     */
    @org.junit.Test
    public void testSetModele() {
        System.out.println("setModele");
        String modele = "";
        Vehicule instance = new Vehicule();
        instance.setModele(modele);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrix method, of class Vehicule.
     */
    @org.junit.Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double prix = 0.0;
        Vehicule instance = new Vehicule();
        instance.setPrix(prix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Vehicule instance = new Vehicule();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Vehicule.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Vehicule instance = new Vehicule();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVehicules method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetVehicules() {
        System.out.println("getVehicules");
        BeanItemContainer<Vehicule> expResult = null;
        BeanItemContainer<Vehicule> result = Vehicule.getVehicules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVehiculesPrixHaut method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetVehiculesPrixHaut() {
        System.out.println("getVehiculesPrixHaut");
        double prix = 0.0;
        BeanItemContainer<Vehicule> expResult = null;
        BeanItemContainer<Vehicule> result = Vehicule.getVehiculesPrixHaut(prix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVehiculesPrixBas method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetVehiculesPrixBas() {
        System.out.println("getVehiculesPrixBas");
        double prix = 0.0;
        BeanItemContainer<Vehicule> expResult = null;
        BeanItemContainer<Vehicule> result = Vehicule.getVehiculesPrixBas(prix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierControleTechniqueGSB method, of class Vehicule.
     */
    @org.junit.Test
    public void testVerifierControleTechniqueGSB() {
        System.out.println("verifierControleTechniqueGSB");
        Vehicule instance = new Vehicule(14, "Renault", "Zoe", 24100,20000,true,2014);
        boolean expResult = true;
        boolean result = instance.verifierControleTechniqueGSB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVehiculesConformes method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetVehiculesConformes() {
        System.out.println("getVehiculesConformes");
        BeanItemContainer<Vehicule> expResult = null;
        BeanItemContainer<Vehicule> result = Vehicule.getVehiculesConformes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
