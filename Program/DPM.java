/* Class DPM sebagai child dari class Mahasiswa*/
public class DPM extends Mahasiswa
{
    /*Attributes*/
    private String jabatan;

    /*Constructors*/
    public DPM(String nik, String nama, String jenis_kelamin, String nim, int buku, int laptop, String jabatan)
    {
        super(nik, nama, jenis_kelamin, nim, buku, laptop);
        this.jabatan = jabatan;
    }

    /*Getter dan setter untuk setiap attribute pada class DPM*/
    public String get_jabatan()
    {
        return this.jabatan;
    }
    public void set_jabatan(String jabatan)
    {
        this.jabatan = jabatan;
    }

    /*Methods milik class DPM */
    public static void baik()
    {
        System.out.println("Apresiasi terhadap semua anggota BEM, kedepannya mohon dipertahankan.");
    }

    public static void kurang()
    {
        System.out.println("Terdapat banyak evaluasi untuk kegiatan ini, kedepannya mohon diperbaiki.");
    }
    
}
