/* Class Mahasiswa sebagai child dari class Human*/
public class Mahasiswa extends Human
{
    /*Attributes*/
    private String nim;
    private int buku;
    private int laptop;

    /*Constructors*/
    public Mahasiswa(String nik, String nama, String jenis_kelamin, String nim, int buku, int laptop)
    {
        super(nik, nama, jenis_kelamin);
        this.nim = nim;
        this.buku = buku;
        this.laptop = laptop;
    }

    /*Getter dan setter untuk setiap attribute pada class Mahasiswa*/
    public String get_nim()
    {
        return this.nim;
    }
    public void set_nim(String nim)
    {
        this.nim = nim;
    }

    public int get_buku()
    {
        return this.buku;
    }
    public void set_buku(int buku)
    {
        this.buku = buku;
    }

    public int get_laptop()
    {
        return this.laptop;
    }
    public void set_laptop(int laptop)
    {
        this.laptop = laptop;
    }

    /*Methods milik class Mahasiswa*/
    public static void belajar(String nama, String mata_kuliah)
    {
        System.out.println(nama + " sedang belajar " + mata_kuliah);
    }

    public static void kelas(String nama, String mata_kuliah)
    {
        System.out.println(nama + " sedang menghadiri kelas " + mata_kuliah);

    }
    public static void tugas(String nama, String tugas)
    {
        System.out.println(nama + " sedang mengerjakan tugas " + tugas);
    }
}
