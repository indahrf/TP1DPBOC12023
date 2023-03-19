/* Class Asisten sebagai child dari class Mahasiswa*/
public class Asisten extends Mahasiswa
{
    /*Attributes*/
    private String mata_kuliah;

    /*Constructors*/
    public Asisten(String nik, String nama, String jenis_kelamin, String nim, int buku, int laptop, String mata_kuliah)
    {
        super(nik, nama, jenis_kelamin, nim, buku, laptop);
        this.mata_kuliah = mata_kuliah;
    }

    /*Getter dan setter untuk setiap attribute pada class Asisten*/
    public String get_mata_kuliah()
    {
        return this.mata_kuliah;
    }

    public void set_mata_kuliah(String mata_kuliah)
    {
        this.mata_kuliah = mata_kuliah;
    }

    /*Methods milik class Asisten */
    public static void mengajar(String nama, String mata_kuliah)
    {
        System.out.println(nama + " sedang mengajar " + mata_kuliah);
    }

    public static void tugas(String nama, String tugas)
    {
        System.out.println(nama + " memberikan tugas " + tugas + " kepada mahasiswa");
    }
}
