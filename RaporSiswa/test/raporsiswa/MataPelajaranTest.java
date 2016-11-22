/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raporsiswa;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author syahrul
 */
public class MataPelajaranTest {
    
    public MataPelajaranTest() {
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
     * Test of getNamaPelajaran method, of class MataPelajaran.
     */
    @Test
    public void testGetNamaPelajaran() {
        System.out.println("getNamaPelajaran");
        String mapel ="IPS";
        
        MataPelajaran instance = new MataPelajaran();
        instance.setNamaPelajaran("IPS");
       
        String expResult = mapel;
        String result = instance.getNamaPelajaran();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNilai method, of class MataPelajaran.
     */
    @Test
    public void testGetNilai() {
        System.out.println("getNilai");
        MataPelajaran instance = new MataPelajaran();
        instance.tambahNilai(100);
        instance.tambahNilai(90);
        instance.tambahNilai(80);
        instance.tambahNilai(70);
        
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(100.0);
        expResult.add(90.0);
        expResult.add(80.0);
        expResult.add(70.0);
        
        ArrayList<Double> result = instance.getNilai();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNamaPelajaran method, of class MataPelajaran.
     */
    @Test
    public void testSetNamaPelajaran() {
        System.out.println("setNamaPelajaran");
        String pel = "IPS";
        MataPelajaran instance = new MataPelajaran();
        instance.setNamaPelajaran(pel);
    }

    /**
     * Test of tambahNilai method, of class MataPelajaran.
     */
    @Test
    public void testTambahNilai() {
        System.out.println("tambahNilai");
        double n = 90;
        MataPelajaran instance = new MataPelajaran();
        instance.tambahNilai(n);
        
    }
    
}
