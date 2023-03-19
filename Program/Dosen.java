//Library yang digunakan
import java.util.ArrayList;

/* Class Dosen sebagai child dari class Human*/
public class Dosen extends Human
{
    /*Attributes*/
    private String nip;
    private int spidol;
    private int laptop;
    protected ArrayList<Asisten> asisten;

    /*Constructors*/
    public Dosen(String nik, String nama, String jenis_kelamin, String nip, int spidol, int laptop, ArrayList<Asisten> asisten)
    {
        super(nik, nama, jenis_kelamin);
        this.nip = nip;
        this.spidol = spidol;
        this.laptop = laptop;
        this.asisten = asisten;
    }

    /*Getter dan setter untuk setiap attribute pada class Dosen*/
    public String get_nip()
    {
        return this.nip;
    }
    public void set_nip(String nip)
    {
        this.nip = nip;
    }

    public int get_spidol()
    {
        return this.spidol;
    }
    public void set_spidol(int spidol)
    {
        this.spidol = spidol;
    }

    public int get_laptop()
    {
        return this.laptop;
    }
    public void set_laptop(int laptop)
    {
        this.laptop = laptop;
    }

    public ArrayList<Asisten> get_asisten()
    {
        return this.asisten;
    }
    public void set_asisten(ArrayList<Asisten> asisten)
    {
        this.asisten = asisten;
    }

    /*Methods milik class Dosen */
    public static void mengajar(String nama, String mata_kuliah)
    {
        System.out.println(nama + " sedang mengajar " + mata_kuliah);
    }

    public static void beri_tugas(String nama, String tugas)
    {
        System.out.println(nama + " memberi tugas " + tugas + " kepada mahasiswa");

    }
    public static void nilai(String nama, int nilai, String namamhs)
    {
        System.out.println(nama + " memberi nilai " + nilai + " kepada " + namamhs);
    }

}
