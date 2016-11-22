package raporsiswa;

import java.util.Date;

/**
 *
 * @author syahrul
 */
public class Main {
    public static void main(String[] args) {
        Siswa andi = new Siswa();
        andi.setNamaSiswa("Andi");
        andi.setALamat("Kudus");
        andi.settglLahir(new Date(1990,02,28));
        andi.setNamaOrtu("Isman");
        
        MataPelajaran ips = new MataPelajaran();
        ips.setNamaPelajaran("IPS");
        ips.tambahNilai(90);
        ips.tambahNilai(70);
        ips.tambahNilai(65);
        MataPelajaran ipa = new MataPelajaran();
        ipa.tambahNilai(77);
        ipa.tambahNilai(72);
        ipa.tambahNilai(86);
        
        
        System.out.println("Nama: "+andi.getNamaSiswa());
        System.out.println("Nama Ortu: "+andi.getNamaOrtu());
        System.out.println("Alamat: "+andi.getAlamat());
        System.out.println("Tgl Lahir: "+andi.getTglLahir());
        System.out.println("----------------------------------------");
        System.out.println("Nilai "+andi.getNamaSiswa()+" pada pelajaran "
                        +ips.getNamaPelajaran()+" adalah "+ips.getNilai());
        System.out.println("Nilai "+andi.getNamaSiswa()+" pada pelajaran "
                        +ips.getNamaPelajaran()+" adalah "+ipa.getNilai());
        
    }
    
}
