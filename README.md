# TP1DPBOC12023

Saya Indah Resti Fauzi dengan NIM 2103507 mengerjakan Tugas Praktikum 1 DPBO dalam mata kuliah Desain Pemrograman Berorientasi Objek 
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

== Desain Program ==

![Class Diagram](https://user-images.githubusercontent.com/99266430/226151692-572351a9-a1d1-4bf0-822d-25839bf2984a.png)

- Kelas Human memiliki child yaitu class Dosen dan Mahasiswa karena merupakan objek yang sama dan untuk menghindari data yang redundan.
- Kelas Mahasiswa memiliki child yaitu class BEM, DPM, dan Asisten. Karena BEM, DPM, dan Asisten masih menjadi bagian dari mahasiswa, tapi tidak semua mahasiswa merupakan BEM, DPM, dan Asisten.
- Class Dosen composite terhadap class Asisten, yang menunjukan bahwa dosen memiliki asisten yang membantunya dalam menjalankan tugas sebagai dosen.
- Semua Class memiliki getter dan setter serta method yang bisa diakses oleh class nya.
- Laptop tidak dibuat menjadi class berbeda karena bisa saja muncul entitas baru yang tidak memiliki laptop.

== Penjelasan Alur ==
- Membuat list dari setiap class kecuali Human karena semua class merupakan Human
- Mengisi data dari tiap list class dengan hardcode
- Menampilkan output berupa
  1. Data mahasiswa
  2. Data dosen
  3. Methods yang ditampilkan dari tiap class

== Dokumentasi ==
![JAVA 1](https://user-images.githubusercontent.com/99266430/226151965-fc690675-8107-4e17-8909-4baa2a7751b5.png)

![JAVA 2](https://user-images.githubusercontent.com/99266430/226151966-1e3f76e7-f63a-4aa5-a2a7-459ab39b3065.png)
