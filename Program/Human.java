/* Class Human*/
class Human
{
    /*Attributes*/
    protected String nik;
    protected String nama;
    protected String jenis_kelamin;

    /*Constructors*/
    public Human(String nik, String nama, String jenis_kelamin)
    {
        this.nik = nik;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
    }

    /*Getter dan setter untuk setiap attribute pada class Human*/
    public String get_nik()
    {
        return this.nik;
    }
    public void set_nik(String nik)
    {
        this.nik = nik;
    }

    public String get_nama()
    {
        return this.nama;
    }
    public void set_nama(String nama)
    {
        this.nama = nama;
    }

    public String get_jenis()
    {
        return this.jenis_kelamin;
    }
    public void set_jenis(String jenis_kelamin)
    {
        this.jenis_kelamin = jenis_kelamin;
    }

    /*Methods milik class Human */
    public static void makan(String nama)
    {
        System.out.println(nama + " sedang makan");
    }

    public static void minum(String nama)
    {
        System.out.println(nama + " sedang minum");

    }
    public static void tidur(String nama)
    {
        System.out.println(nama + " sedang tidur");
    }

}