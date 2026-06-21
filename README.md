# playlist-oop-group-4
1. Penerapan Inheritance
Dalam program sistem manajemen playlist, konsep inheritance diterapkan untuk menciptakan hierarki user dan menghindari duplikasi kode.
Parent Class dibuat class User sebagai kelas induk yang memiliki atribut nama (dengan access modifier protected agar bisa diakses anak kelasnya) serta sebuah method dasar tampilkanAkses().
Child Class, Class Admin dan Member dibuat sebagai kelas turunan yang mewarisi class User.
Karena mewarisi User, Admin maupun Member secara otomatis memiliki atribut nama tanpa perlu mendeklarasikannya ulang. Pada constructor Admin dan Member memanggil constructor milik parent class menggunakan super(nama). Ini merepresentasikan hubungan "is-a" (Admin adalah seorang User, dan Member adalah seorang User), namun masing-masing anak kelas dapat memiliki method tambahannya sendiri (seperti tambahLagu pada Admin dan hitungRataRataDurasi pada Member).

2. Penerapan Polymorphism
Polymorphism yang diterapkan dalam program ini adalah tipe Dynamic Polymorphism (Method Overriding). Konsep ini memungkinkan child class memberikan implementasi yang spesifik pada method yang sudah didefinisikan oleh parent class-nya.
Pada parent class User, terdapat method tampilkanAkses() yang secara default mencetak informasi umum. Lalu, method ini dioverride oleh class Admin dan Member dengan menambahkan anotasi @Override.
Pada class Admin, method tersebut diubah untuk menampilkan teks "Admin dapat menambahkan lagu baru...", sedangkan pada class Member diubah menjadi "Member dapat melihat daftar lagu, ... mencari lagu, dan menghitung rata-rata durasi.".
Dengan polimorfisme, meskipun Admin dan Member merupakan turunan dari entitas yang sama (User), ketika pemanggilan method tampilkanAkses() dilakukan pada objek yang berbeda, output yang dihasilkan akan secara dinamis menyesuaikan dengan peran spesifik dari objek tersebut.
