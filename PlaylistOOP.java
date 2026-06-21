/**
 * Team Assignment 1 - Group 4
 * Members:
 * - DEAN PANDEHEN SAHAY [2902760536]
 * - ADAM NUR HIDAYAT [2902801012]
 * - ACHMAD ALIF NASRULLOH [2902775065]
 * - LUKMAN NUL HAKIM [2902765562]
 * - MUHAMAD FAIRUS [2902792090]
 */

public class PlaylistOOP {
  // Array untuk menyimpan daftar lagu
  private static Lagu[] listLagu = new Lagu[10];

  public static void main(String[] args) {

    int jumlahLagu = 0;

    // Membuat objek Admin dan Member
    Admin admin = new Admin("Andi");
    Member member = new Member("Budi");

    // Menampilkan hak akses
    admin.tampilkanAkses();
    member.tampilkanAkses();

    System.out.println();

    // Admin menambahkan lagu
    jumlahLagu = admin.tambahLagu(
        listLagu,
        jumlahLagu,
        "Monokrom",
        "Tulus",
        3.50);

    jumlahLagu = admin.tambahLagu(
        listLagu,
        jumlahLagu,
        "Interaksi",
        "Tulus",
        4.00);

    System.out.println();

    // Member melihat daftar lagu
    member.lihatDaftarLagu(listLagu, jumlahLagu);

    System.out.println();

    // Member mencari lagu
    member.cariLagu(listLagu, jumlahLagu, "Monokrom");

    System.out.println();

    // Mencari lagu yang tidak ada
    member.cariLagu(listLagu, jumlahLagu, "Hujan");

    System.out.println();

    // Member melihat detail lagu
    member.lihatDetailLagu(listLagu, jumlahLagu, "Monokrom");

    System.out.println();

    // Member menghitung rata-rata durasi lagu
    member.hitungRataRataDurasi(listLagu, jumlahLagu);
  }

  public static Lagu[] getListLagu() {
    return listLagu;
  }
}
