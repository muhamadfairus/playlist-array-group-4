// Class Member mewarisi class User
public class Member extends User {

    // Constructor Member memanggil constructor parent
    public Member(String nama) {
        super(nama);
    }

    // Polymorphism: override method dari User
    @Override
    public void tampilkanAkses() {
        System.out.println(
            "Member dapat melihat daftar lagu, melihat detail lagu, mencari lagu, dan menghitung rata-rata durasi.");
    }

    // Method untuk melihat daftar lagu
    public void lihatDaftarLagu(Lagu[] listLagu, int jumlahLagu) {
        if (jumlahLagu == 0) {
        System.out.println("Belum ada lagu dalam playlist.");
        return;
        }

        System.out.println("Daftar Lagu:");

        for (int i = 0; i < jumlahLagu; i++) {
        System.out.println((i + 1) + ". " + listLagu[i].getJudul());
        }
    }

    // Method untuk mencari lagu berdasarkan judul
    public void cariLagu(Lagu[] listLagu, int jumlahLagu, String judulCari) {

        boolean ditemukan = false;

        for (int i = 0; i < jumlahLagu; i++) {
        if (listLagu[i].getJudul().equalsIgnoreCase(judulCari)) {

            System.out.println("Lagu ditemukan:");
            listLagu[i].tampilkanInfo();

            ditemukan = true;
            break;
        }
        }

        if (!ditemukan) {
        System.out.println("Lagu dengan judul \"" + judulCari + "\" tidak ditemukan.");
        }
    }

    // Method untuk melihat detail lagu tertentu
    public void lihatDetailLagu(Lagu[] listLagu, int jumlahLagu, String judulCari) {

        boolean ditemukan = false;

        for (int i = 0; i < jumlahLagu; i++) {
        if (listLagu[i].getJudul().equalsIgnoreCase(judulCari)) {

            System.out.println("Detail Lagu:");
            listLagu[i].tampilkanInfo();

            ditemukan = true;
            break;
        }
        }

        if (!ditemukan) {
        System.out.println("Lagu dengan judul \"" + judulCari + "\" tidak ditemukan.");
        }
    }

    // Method untuk menghitung rata-rata durasi lagu
    public void hitungRataRataDurasi(Lagu[] listLagu, int jumlahLagu) {

        if (jumlahLagu == 0) {
        System.out.println("Belum ada lagu dalam playlist.");
        return;
        }

        double totalDurasi = 0;

        for (int i = 0; i < jumlahLagu; i++) {
        totalDurasi += listLagu[i].getDurasi();
        }

        double rataRata = totalDurasi / jumlahLagu;

        System.out.printf("Rata-rata durasi lagu: %.2f menit\n", rataRata);
    }
}