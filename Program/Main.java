//Library yang digunakan
import java.util.ArrayList;

//Class Main
public class Main {
    public static void main(String[] args)
    {
        /*Deklarasi list untuk setiap class  yang akan digunakan*/
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        ArrayList<BEM> listBEM = new ArrayList<>();
        ArrayList<DPM> listDPM = new ArrayList<>();
        ArrayList<Asisten> listAsisten = new ArrayList<>();
        ArrayList<Dosen> listDosen = new ArrayList<>();

        /*Mengisi data pada class Mahasiswa*/
        Mahasiswa temp1 = new Mahasiswa("1", "Afri", "M", "2102101", 5, 1);
        listMahasiswa.add(temp1);
        Mahasiswa temp2 = new Mahasiswa("2", "Anin", "P", "2102102", 3, 1);
        listMahasiswa.add(temp2);
        
        /*Mengisi data pada class BEM*/
        String[] proker = {"Kaderisasi", "Upgrading", "Inaugurasi"};
        String[] inovasi = {"Meningkatkan kualitas mahasiwa di bidang non-akademik", "Meningkatkan kualitas lulusan"};
        BEM temp3 = new BEM("3", "Rapi", "M", "2102103", 2, 1, "Ketua BEM", proker, inovasi);
        listBEM.add(temp3);

        /*Mengisi data pada class DPM*/
        DPM temp4 = new DPM("4", "Alga", "M", "2102104", 8, 2, "Bidang Evaluasi DPM");
        listDPM.add(temp4);
        
        /*Mengisi data pada class Asisten*/
        Asisten temp5 = new Asisten("5", "Bulan", "M", "2102105", 4, 4, "Struktur Data");
        listAsisten.add(temp5);
        Asisten temp6 = new Asisten("6", "Najmi", "P", "2102106", 9, 2, "Struktur Data");
        listAsisten.add(temp6);
        
        /*Mengisi data pada class Dosen*/
        Dosen temp7 = new Dosen("7", "Rose", "P", "19017399", 6, 3, listAsisten);
        listDosen.add(temp7);
        
        /*Menampilkan seluruh data yang telah dimasukkan dari tiap class*/
        int no = 1;
        System.out.println("== Daftar Mahasiswa ==");
        for(int i = 0; i < listMahasiswa.size(); i++)
        {
            System.out.println(Integer.toString(no) + ". " + listMahasiswa.get(i).get_nama());
            System.out.println("   NIM           : " + listMahasiswa.get(i).get_nim());
            System.out.println("   Jenis Kelamin : " + listMahasiswa.get(i).get_jenis());
            System.out.println("   Status        : Mahasiswa Regular");
            no++;
        }
        for(int i = 0; i < listBEM.size(); i++)
        {
            System.out.println(Integer.toString(no) + ". " + listBEM.get(i).get_nama());
            System.out.println("   NIM           : " + listBEM.get(i).get_nim());
            System.out.println("   Jenis Kelamin : " + listBEM.get(i).get_jenis());
            System.out.println("   Status        : " + listBEM.get(i).get_jabatan());
            System.out.println("   Program Kerja : " );
            for(int j = 0; j < proker.length; j++)
            {
                System.out.println("   - " + listBEM.get(i).get_proker()[j]);
            }
            System.out.println("   Inovasi:");
            for(int j = 0; j < inovasi.length; j++)
            {
                System.out.println("   - " + listBEM.get(i).get_inovasi()[j]);
            }
            no++;
        }
        for(int i = 0; i < listDPM.size(); i++)
        {
            System.out.println(Integer.toString(no) + ". " + listDPM.get(i).get_nama());
            System.out.println("   NIM           : " + listDPM.get(i).get_nim());
            System.out.println("   Jenis Kelamin : " + listDPM.get(i).get_jenis());
            System.out.println("   Status        : " + listDPM.get(i).get_jabatan());
            no++;
        }
        for(int i = 0; i < listAsisten.size(); i++)
        {
            System.out.println(Integer.toString(no) + ". " + listAsisten.get(i).get_nama());
            System.out.println("   NIM           : " + listAsisten.get(i).get_nim());
            System.out.println("   Jenis Kelamin : " + listAsisten.get(i).get_jenis());
            System.out.println("   Status        : Asisten " + listAsisten.get(i).get_mata_kuliah());
            no++;
        }
        System.out.println();
        System.out.println("== Daftar Dosen ==");
        for(int i = 0; i < listDosen.size(); i++)
        {
            System.out.println(Integer.toString(i+1) + ". " + listDosen.get(i).get_nama());
            System.out.println("   NIP           : " + listDosen.get(i).get_nip());
            System.out.println("   Jenis Kelamin : " + listDosen.get(i).get_jenis());
            System.out.println("   Status        : Dosen");
            System.out.println("   Asisten       :");
            for(int j = 0; j < listAsisten.size(); j++)
            {
                System.out.println("   - " + listDosen.get(i).get_asisten().get(j).get_nama());
            }
        }

        /*Menampilkan berbagai methods dari tiap class */
        System.out.println();
        System.out.println("== Contoh penggunaan method pada class Human ==");
        Human.makan(listMahasiswa.get(0).get_nama());
        Human.minum(listMahasiswa.get(0).get_nama());
        Human.tidur(listMahasiswa.get(0).get_nama());

        System.out.println();
        System.out.println("== Contoh penggunaan method pada class Mahasiswa ==");
        Mahasiswa.belajar(listMahasiswa.get(1).get_nama(), "DPBO");
        Mahasiswa.kelas(listMahasiswa.get(1).get_nama(), "DPBO");
        Mahasiswa.tugas(listMahasiswa.get(1).get_nama(), "TP 1 DPBO");

        System.out.println();
        System.out.println("== Contoh penggunaan method pada class BEM ==");
        BEM.program(listBEM.get(0).get_nama(), "UPGRADING 1");
        BEM.inovasi(listBEM.get(0).get_nama(), "membuat sekretariat baru");
        BEM.inovasi2(listBEM.get(0).get_nama());

        System.out.println();
        System.out.println("== Contoh penggunaan method pada class DPM ==");
        DPM.baik();
        DPM.kurang();

        System.out.println();
        System.out.println("== Contoh penggunaan method pada class Asisten ==");
        Asisten.mengajar(listAsisten.get(0).get_nama(), listAsisten.get(0).get_mata_kuliah());
        Asisten.tugas(listAsisten.get(0).get_nama(), "Latihan 2");

        System.out.println();
        System.out.println("== Contoh penggunaan method pada class Dosen ==");
        Dosen.mengajar(listDosen.get(0).get_nama(), "DPBO");
        Dosen.beri_tugas(listDosen.get(0).get_nama(), "Latihan");
        Dosen.nilai(listDosen.get(0).get_nama(), 92, listMahasiswa.get(1).get_nama());


    }

}
