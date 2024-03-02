package baksotrunojoyo;
import java.util.Scanner;

//Class Pembeli
class Pembeli {
    private String nama;
    private String nomer;

    Pembeli(String n, String nom) {
        nama = n;
        nomer = nom;
        System.out.println("Pembeli " + nama + " Dibuat...");
    }

    public void setNama(String n) {
        nama = n;
    }

    public void setNomer(String nom) {
        nomer = nom;
    }

    public String getNama() {
        return nama;
    }

    public String getNomer() {
        return nomer;
    }

    public String toString() {
        return nama + "[" + nomer + "]";
    }
}

//Class Makanan
class Makanan {
    private String namaMakanan;
    private int hargaMakanan;

    Makanan(String n, int h) {
        namaMakanan = n;
        hargaMakanan = h;
        System.out.println("Menu " + namaMakanan + " diproses..");
    }

    public void setHargaMakanan(int h) {
        hargaMakanan = h;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public int getHargaMakanan() {
        return hargaMakanan;
    }

    public String toString() {
        return namaMakanan + "[" + hargaMakanan + "]";
    }
}

//Class Minuman
class Minuman {
    private String namaMinuman;
    private int hargaMinuman;

    Minuman(String n, int h) {
        namaMinuman = n;
        hargaMinuman = h;
        System.out.println("Menu " + namaMinuman + " diproses");
    }

    public void setHargaMinuman(int h) {
        hargaMinuman = h;
    }

    public String getNamaMinuman() {
        return namaMinuman;
    }

    public int getHargaMinuman() {
        return hargaMinuman;
    }

    public String toString() {
        return namaMinuman + "[" + hargaMinuman + "]";
    }
}

public class BaksoTrunojoyo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Makanan[] daftarMakanan = new Makanan[8];
        Minuman[] daftarMinuman = new Minuman[5];
        Pembeli[] daftarPembeli = new Pembeli[7];
        int totalTransaksi = 0;

        Makanan makan = new Makanan("Pentol halus", 17000);
        Minuman minum = new Minuman("Es Teh", 15000);
        Pembeli pembeli = new Pembeli("Budi", "5");
        int pilih = 0, pilih3;

        // Menu Utama
        do {
            System.out.println("\n===BAKSO TRUNOJOYO====");
            System.out.println("|   1.Makanan        |");
            System.out.println("|   2.Minuman        |");
            System.out.println("|   3.Pembeli        |");
            System.out.println("|   4.Selesai        |");
            System.out.println("======================");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch (pilih) {

                // Sub Menu 1 (Makanan)
                case 1:
                    pilih3 = 0;
                    do {
                        System.out.println("=======Menu Makanan======");
                        System.out.println("|   1.Buat data Makanan |");
                        System.out.println("|   2.Lihat Menu        |");
                        System.out.println("|   3.Ubah data         |");
                        System.out.println("|   4.Kembali           |");
                        System.out.println("=========================");
                        System.out.print("Pilih = ");
                        pilih3 = sc.nextInt();
                        switch (pilih3) {

                            // Buat data Makanan
                            case 1:
                                System.out.print("Nama Makanan = ");
                                String nMakanan = sc.next();
                                System.out.print("Harga = ");
                                int hMakanan = sc.nextInt();
                                makan = new Makanan(nMakanan, hMakanan);
                                break;

                            // Lihat Menu
                            case 2:
                                String tMakanan = makan.toString();
                                System.out.println("Menu : " + tMakanan);
                                break;

                            // Ubah data
                            case 3:
                                System.out.print("Harga Baru makanan = ");
                                int hbMakanan = sc.nextInt();
                                makan.setHargaMakanan(hbMakanan);
                                break;

                            // Kembali Menu Utama
                            case 4:
                                System.out.println("Kembali ke Menu Utama..");
                                break;

                        }
                    } while (pilih3 != 4);
                    break;

                // Sub Menu 2(Minuman)
                case 2:
                    pilih3 = 0;
                    do {
                        System.out.println("=========Minuman=========");
                        System.out.println("|   1.Buat data Minuman |");
                        System.out.println("|   2.Lihat data        |");
                        System.out.println("|   3.Ubah data         |");
                        System.out.println("|   4.Kembali           |");
                        System.out.println("=========================");
                        System.out.print("Pilih = ");
                        pilih3 = sc.nextInt();
                        switch (pilih3) {

                            // Buat data Minuman
                            case 1:
                                System.out.print("Nama minuman = ");
                                String nMinuman = sc.next();
                                System.out.print("Harga = ");
                                int hMinuman = sc.nextInt();
                                minum = new Minuman(nMinuman, hMinuman);
                                break;

                            // Lihat Menu Minuman
                            case 2:
                                String mMinuman = minum.toString();
                                System.out.println("Minuman : " + mMinuman);
                                break;

                            // Ubah data
                            case 3:
                                System.out.print("Harga baru = ");
                                int hbMinuman = sc.nextInt();
                                minum.setHargaMinuman(hbMinuman);
                                break;

                            // Kembali Ke Menu Utama
                            case 4:
                                System.out.println("Kembali ke menu utama");
                                break;
                        }
                    } while (pilih3 != 4);
                    break;

                // Sub Menu Pembeli
                case 3:
                    System.out.println("=========Pembeli=========");
                    System.out.println("|   1.Buat data Pembeli |");
                    System.out.println("|   2.Lihat data        |");
                    System.out.println("|   3.Ubah data         |");
                    System.out.println("|   4.Kembali           |");
                    System.out.println("=========================");
                    System.out.print("Pilih = ");
                    int pilihPembeli = sc.nextInt();
                    switch (pilihPembeli) {

                        // Buat data Pembeli
                        case 1:
                            System.out.print("Nama Pembeli = ");
                            String namaPembeli = sc.next();
                            System.out.print("Nomer Pembeli = ");
                            String nomorPembeli = sc.next();
                            pembeli = new Pembeli(namaPembeli, nomorPembeli);
                            break;

                        // Lihat data pembeli
                        case 2:
                            String p = pembeli.toString();
                            System.out.println("Pembeli: " + p);
                            break;

                        // Ubah Data Pembeli
                        case 3:
                            System.out.print("Nama Baru pembeli: ");
                            String nb = sc.next();
                            pembeli.setNama(nb);
                            System.out.print("Nomer Baru pembeli: ");
                            String nn = sc.next();
                            pembeli.setNomer(nn);
                            break;

                        // Kembali Ke Menu Utama
                        case 4:
                            System.out.println("Kembali ke menu utama");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih sudah pesan");
                    System.out.println("Total transaksi: " + totalTransaksi);
            }
            if (pilih == 1) {
                totalTransaksi += makan.getHargaMakanan();
            } else if (pilih == 2) {
                totalTransaksi += minum.getHargaMinuman();
            }
        } while (pilih != 4);
    }
}
