// Class Member mewarisi class User
public class Member extends User {

  // Constructor Member memanggil constructor dari parent class User
  public Member(String nama) {
    super(nama);
  }

  // Mmethod tampilkanAkses() di-override khusus untuk Member
  @Override
  public void tampilkanAkses() {
    System.out.println("Member dapat menelusuri lagu, melihat detail lagu tertentu, serta menghitung rata-rata durasi.");
  }

  // Method untuk melihat daftar lagu yang ada di dalam array playlist
  public void lihatDaftarLagu(Lagu[] listLagu, int jumlahLagu) {
    if (jumlahLagu == 0) {
      System.out.println("Playlist kosong. Belum ada lagu yang tersedia.");
      return;
    }

    System.out.println("\n Daftar Lagu di Playlist ");
    for (int i = 0; i < jumlahLagu; i++) {
      System.out.println((i + 1) + ". " + listLagu[i].getJudul() + " - " + listLagu[i].getArtis());
    }
  }

  // Method untuk mencari lagu berdasarkan judul memakai linear search
  public void cariLagu(Lagu[] listLagu, int jumlahLagu, String judulCari) {
    boolean ditemukan = false;
    System.out.println("\n Hasil Pencarian untuk: '" + judulCari + "' ");
    
    // Melakukan iterasi pada array untuk mencocokkan judul
    for (int i = 0; i < jumlahLagu; i++) {
      // Menggunakan equalsIgnoreCase agar pencarian tidak sensitif terhadap huruf besar/kecil
      if (listLagu[i].getJudul().equalsIgnoreCase(judulCari)) {
        listLagu[i].tampilkanInfo();
        ditemukan = true;
        break; // Berhenti mencari jika lagu sudah ditemukan
      }
    }

    if (!ditemukan) {
      System.out.println("Maaf, lagu dengan judul '" + judulCari + "' tidak ditemukan di playlist.");
    }
  }

  // Method untuk menghitung dan menampilkan rata-rata durasi semua lagu
  public void hitungRataRataDurasi(Lagu[] listLagu, int jumlahLagu) {
    if (jumlahLagu == 0) {
      System.out.println("\nTidak dapat menghitung rata-rata durasi karena playlist kosong.");
      return;
    }

    double totalDurasi = 0;
    // Mengambil nilai durasi dari setiap objek lagu dan menjumlahkannya
    for (int i = 0; i < jumlahLagu; i++) {
      totalDurasi += listLagu[i].getDurasi();
    }

    double rataRata = totalDurasi / jumlahLagu;
    System.out.printf("\n=> Rata-rata durasi lagu dalam playlist: %.2f menit\n", rataRata);
  }
}
