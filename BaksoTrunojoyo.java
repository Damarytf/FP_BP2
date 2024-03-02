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
    private int stokMakanan;

    Makanan(String n, int h, int s) {
        namaMakanan = n;
        hargaMakanan = h;
        stokMakanan = s;
        System.out.println("Menu " + namaMakanan + " diproses..");
    }

    public void setHargaMakanan(int h) {
        hargaMakanan = h;
    }

    public void setStokMakanan(int s) {
        stokMakanan = s;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public int getHargaMakanan() {
        return hargaMakanan;
    }

    public int getStokMakanan() {
        return stokMakanan;
    }

    public void kurangiStokMakanan() {
        stokMakanan--;
    }

    public String toString() {
        return namaMakanan + "[" + hargaMakanan + "]";
    }
}

//Class Minuman
class Minuman {
    private String namaMinuman;
    private int hargaMinuman;
    private int stokMinuman;

    Minuman(String n, int h, int s) {
        namaMinuman = n;
        hargaMinuman = h;
        stokMinuman = s;
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

    public int getStokMinuman() {
        return stokMinuman;
    }

    public void kurangiStokMinuman() {
        stokMinuman--;
    }

    public String toString() {
        return namaMinuman + "[" + hargaMinuman + "]";
    }
}

public class BaksoTrunojoyo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_MAKANAN = 8;
        final int MAX_MINUMAN = 5;
        Makanan[] daftarMakanan = new Makanan[MAX_MAKANAN];
        Minuman[] daftarMinuman = new Minuman[MAX_MINUMAN];
        Pembeli[] daftarPembeli = new Pembeli[7];
        int totalTransaksi = 0;

        Makanan makan = new Makanan("Tahu", 17000, 10);
        Minuman minum = new Minuman("EsJeruk", 15000, 15);
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
                                for (int i = 0; i < MAX_MAKANAN; i++) {
                                    if (daftarMakanan[i] == null) {
                                        System.out.print("Nama Makanan = ");
                                        String nMakanan = sc.next();
                                        System.out.print("Harga = ");
                                        int hMakanan = sc.nextInt();
                                        System.out.print("Stok = ");
                                        int sMakanan = sc.nextInt();
                                        daftarMakanan[i] = new Makanan(nMakanan, hMakanan, sMakanan);
                                        break;
                                    }
                                }
                                break;

                            // Lihat Menu
                            case 2:
                                System.out.println("Daftar Menu Makanan:");
                                for (int i = 0; i < MAX_MAKANAN; i++) {
                                    if (daftarMakanan[i] != null) {
                                        System.out.println(daftarMakanan[i].getNamaMakanan() + ", Harga: " +
                                                daftarMakanan[i].getHargaMakanan() +
                                                ", Stok: " + daftarMakanan[i].getStokMakanan());
                                    }
                                }
                                break;

                            // Ubah data
                            case 3:
                                System.out.println("Nama Makanan yang ingin diubah = ");
                                String nbMakanan = sc.next();
                                for (int i = 0; i < MAX_MAKANAN; i++) {
                                    if (daftarMakanan[i] != null && daftarMakanan[i].getNamaMakanan().equals(nbMakanan)) {
                                        System.out.print("Harga Baru makanan = ");
                                        int hbMakanan = sc.nextInt();
                                        System.out.println("Stok baru = ");
                                        int nsMakanan = sc.nextInt();
                                        daftarMakanan[i].setHargaMakanan(hbMakanan);
                                        daftarMakanan[i].setStokMakanan(nsMakanan);
                                        System.out.println("Data makanan berhasil diubah.");
                                        break;
                                    }
                                }
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
                                for (int i = 0; i < MAX_MINUMAN; i++) {
                                    if (daftarMinuman[i] == null) {
                                        System.out.print("Nama minuman = ");
                                        String nMinuman = sc.next();
                                        System.out.print("Harga = ");
                                        int hMinuman = sc.nextInt();
                                        System.out.print("Stok = ");
                                        int sMinuman = sc.nextInt();
                                        daftarMinuman[i] = new Minuman(nMinuman, hMinuman, sMinuman);
                                        break;
                                    }
                                }
                                break;

                            // Lihat Menu Minuman
                            case 2:
                                System.out.println("Daftar Menu Minuman:");
                                for (int i = 0; i < MAX_MINUMAN; i++) {
                                    if (daftarMinuman[i] != null) {
                                        System.out.println(daftarMinuman[i].getNamaMinuman() + ", Harga: " +
                                                daftarMinuman[i].getHargaMinuman() +
                                                ", Stok: " + daftarMinuman[i].getStokMinuman());
                                    }
                                }
                                break;

                            // Ubah data
                            case 3:
                                System.out.print("Nama Minuman yang ingin diubah = ");
                                String nbMinuman = sc.next();
                                for (int i = 0; i < MAX_MINUMAN; i++) {
                                    if (daftarMinuman[i] != null && daftarMinuman[i].getNamaMinuman().equals(nbMinuman)) {
                                        System.out.print("Harga baru = ");
                                        int hbMinuman = sc.nextInt();
                                        daftarMinuman[i].setHargaMinuman(hbMinuman);
                                        System.out.println("Data minuman berhasil diubah.");
                                        break;
                                    }
                                }
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
                    break;
            }
            if (pilih == 1) {
                for (int i = 0; i < MAX_MAKANAN; i++) {
                    if (daftarMakanan[i] != null) {
                        daftarMakanan[i].kurangiStokMakanan();
                        totalTransaksi += daftarMakanan[i].getHargaMakanan();
                        break;
                    }
                }
            } else if (pilih == 2) {
                for (int i = 0; i < MAX_MINUMAN; i++) {
                    if (daftarMinuman[i] != null) {
                        daftarMinuman[i].kurangiStokMinuman();
                        totalTransaksi += daftarMinuman[i].getHargaMinuman();
                        break;
                    }
                }
            }
        } while (pilih != 4);
    }
}

                                


