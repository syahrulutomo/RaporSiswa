package raporsiswa;

import java.util.ArrayList;

/**
 *
 * @author syahrul
 */
public class MataPelajaran {
    
    private String namaPelajaran;
    private ArrayList<Double> nilai = new ArrayList<Double>();
    
    
    public void setNamaPelajaran(String pel)
    {
        namaPelajaran = pel;
    }
    
    public void tambahNilai(double n)
    {
        nilai.add(n);
    }
    
    public String getNamaPelajaran()
    {
        return namaPelajaran;    
    }
    
    public ArrayList<Double> getNilai()
    {
        return nilai;
    }
    
}


