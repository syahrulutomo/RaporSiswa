/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raporsiswa;

import java.util.ArrayList;
import java.util.Date;
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
public class SiswaTest {
    
    public SiswaTest() {
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
     * Test of setNamaSiswa method, of class Siswa.
     */
    @Test
    public void testSetNamaSiswa() {
        System.out.println("setNamaSiswa");
        String nama = "Andi";
        Siswa instance = new Siswa();
        instance.setNamaSiswa(nama);
        
    }

    /**
     * Test of settglLahir method, of class Siswa.
     */
    @Test
    public void testSettglLahir() {
        System.out.println("settglLahir");
        Date tgl = new Date(1993,11,02);
        Siswa instance = new Siswa();
        instance.settglLahir(tgl);
        
    }

    /**
     * Test of setALamat method, of class Siswa.
     */
    @Test
    public void testSetALamat() {
        System.out.println("setALamat");
        String alamat = "Kudus";
        Siswa instance = new Siswa();
        instance.setALamat(alamat);
        
    }

    /**
     * Test of setNamaOrtu method, of class Siswa.
     */
    @Test
    public void testSetNamaOrtu() {
        System.out.println("setNamaOrtu");
        String namaOrtu = "Sri";
        Siswa instance = new Siswa();
        instance.setNamaOrtu(namaOrtu);
        
    }
    /**
     * Test of getAlamat method, of class Siswa.
     */
    @Test
    public void testGetAlamat() {
        System.out.println("getAlamat");
        String alamatS = "Kudus";
        Siswa instance = new Siswa();
        instance.setALamat(alamatS);
        
        String expResult = alamatS;
        String result = instance.getAlamat();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTglLahir method, of class Siswa.
     */
    @Test
    public void testGetTglLahir() {
        Date tgl = new Date(1993,11,02);
        System.out.println("getTglLahir");
        Date expResult = tgl;
       
        Siswa instance = new Siswa();
        instance.settglLahir(tgl);
        Date result = instance.getTglLahir();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getNamaSiswa method, of class Siswa.
     */
    @Test
    public void testGetNamaSiswa() {
        String nama = "Andi";
        System.out.println("getNamaSiswa");
        String expResult = nama;
        Siswa instance = new Siswa();
        instance.setNamaSiswa(nama);
        String result = instance.getNamaSiswa();
        assertEquals(expResult, result);     
        
    }

    /**
     * Test of getNamaOrtu method, of class Siswa.
     */
    @Test
    public void testGetNamaOrtu() {
        System.out.println("getNamaOrtu");
        
        String nOrtu = "Sri";
        String expResult = nOrtu;
        
        Siswa instance = new Siswa();
        instance.setNamaOrtu(nOrtu);
        String result = instance.getNamaOrtu();
        assertEquals(expResult, result);
    }

    

    

    
    
}
