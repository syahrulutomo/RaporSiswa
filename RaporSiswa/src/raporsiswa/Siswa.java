package raporsiswa;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author syahrul
 */
public class Siswa {
   
    private String namaSiswa ;
    private Date tglLahir ;
    private String alamat ;
    private String namaOrtu ;
    
    public void setNamaSiswa(String nama)
    {
        namaSiswa = nama;
    }
    
    public void settglLahir(Date tgl)
    {
        tglLahir = tgl;
    }
    
    public void setALamat(String alamat)
    {
        this.alamat =  alamat;
    }
    
    public void setNamaOrtu(String namaOrtu)
    {
        this.namaOrtu = namaOrtu;
    }
    
    public String getNamaSiswa()
    {
        return namaSiswa;
    }
    
    public Date getTglLahir()
    {
        return tglLahir;
    }
    
    public String getAlamat()
    {
        return alamat;
    }
    
    public String getNamaOrtu()
    {
        return namaOrtu;
    }
    
}
