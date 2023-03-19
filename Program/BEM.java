/* Class BEM sebagai child dari class Mahasiswa*/
public class BEM extends Mahasiswa
{
    /*Attributes*/
    private String jabatan;
    private String proker[];
    private String inovasi[];

    /*Constructors*/
    public BEM(String nik, String nama, String jenis_kelamin, String nim, int buku, int laptop, String jabatan, String proker[], String inovasi[])
    {
        super(nik, nama, jenis_kelamin, nim, buku, laptop);
        this.jabatan = jabatan;
        this.proker = proker;
        this.inovasi = inovasi;
    }

    /*Getter dan setter untuk setiap attribute pada class BEM*/
    public String get_jabatan()
    {
        return this.jabatan;
    }
    public void set_jabatan(String jabatan)
    {
        this.jabatan = jabatan;
    }

    public String[] get_proker()
    {
        return this.proker;
    }
    public void set_proker(String proker[])
    {
        this.proker = proker;
    }

    public String[] get_inovasi()
    {
        return this.inovasi;
    }
    public void set_inovasi(String inovasi[])
    {
        this.inovasi = inovasi;
    }

    /*Methods milik class BEM */
    public static void program(String nama, String proker)
    {
        System.out.println(nama + " telah melaksanakan " + proker);
    }

    public static void inovasi(String nama, String inovasi)
    {
        System.out.println(nama + " memiliki inovasi baru yaitu " + inovasi);

    }
    public static void inovasi2(String nama)
    {
        System.out.println(nama + " melaksanakan salah satu inovasinya");
    }
}
