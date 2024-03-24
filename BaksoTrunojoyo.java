package baksotrunojoyo;
import java.util.Scanner;
public class BaksoTrunojoyo {
public static void main(String[] args) {
    cProduk p = new cProduk();
        cProduk p2 = new cProduk("Sepatu",150000,10);
        cPembeli pb = new cPembeli("Budi","Surabaya");
        cProduk produk[] = new cProduk[3];
        cTransaksi tr = new cTransaksi();
        Scanner sc = new Scanner(System.in);
        produk[0]=new cProduk("Pentolhalus",150000,5);
        produk[1]=new cProduk("Pentolkasar",50000,5);
        produk[2]=new cProduk("Siomay",100000,5);
        int pilih=0;
        
        //Fitur Login
        boolean loggedIn = false;
        String username, password;
        System.out.println("=== Login ===");
        do {
            System.out.print("Username: ");
            username = sc.nextLine();
            System.out.print("Password: ");
            password = sc.nextLine();
            if (username.equals("damar") && password.equals("294")) {
                loggedIn = true;
                System.out.println("Login berhasil!\n");
            } else {
                System.out.println("Username atau password salah. Silakan coba lagi.\n");
            }
        } while (!loggedIn);
        
        //Main Menu
        do{
            System.out.println("\n====Bakso Trunojoyo===");
            System.out.println("| 1. Produk          |");
            System.out.println("| 2. Pembeli         |");
            System.out.println("| 3. Transaksi       |");
            System.out.println("| 4. Exit            |");
            System.out.println("======================");
            System.out.print("Pilih = ");
            pilih=sc.nextInt();
            switch(pilih){
                //Menu App(Produk)
                case 1:
                    System.out.println("=====Produk=====");
                    System.out.println("|  1. Tambah   |");
                    System.out.println("|  2. Ubah     |");
                    System.out.println("|  3. Hapus    |");
                    System.out.println("|  4. Detail   |");
                    System.out.println("================");
                    System.out.print("  Pilih = ");
                    int pilih2=sc.nextInt();
                    switch(pilih2){
                        case 1:
                            sc=new Scanner(System.in);
                            System.out.print("  Nama = ");
                            String nm=sc.nextLine();
                            System.out.print("  Harga = ");
                            int hg=sc.nextInt();
                            System.out.print("  Stok = ");
                            int st=sc.nextInt();
                            p2 = new cProduk(nm,hg,st);
                            break;
                        case 2:
                            System.out.print("  Stok Baru = ");
                            st = sc.nextInt();
                            System.out.println("  Yakin ubah?");
                            System.out.println("  1. Ya");
                            System.out.println("  2. Batal");
                            System.out.print("  Jawab = ");
                            int jwb = sc.nextInt();
                            if(jwb == 1) {
                                p2.setStok(st);
                                System.out.println("  Ubah stok berhasil!");
                            } else {
                                System.out.println("  Ubah stok batal!");
                            }
                            break;
                        case 3:
                            System.out.println("  Nama = ");
                            nm=sc.next();
                            if(nm.equalsIgnoreCase(p2.getNama())){
                                System.out.println("Yakin hapus?");
                                System.out.println("1. Ya");
                                System.out.println("2. Tidak");
                                System.out.print("Jawab = ");
                                jwb=sc.nextInt();
                                if(jwb==1){
                                    p2=null;
                                    System.out.println("Hapus Sukses..");
                                }
                                else{
                                    System.out.println("Batal Hapus!");
                                }
                            }else{
                                System.out.println("Produk tidak ada!");
                            }
                            break;
                        case 4:
                            if(p2 != null)
                                System.out.println(p2.toString()); 
                            else 
                                System.out.println("Objek Kosong!");
                            break;
                    }
                    break;
                    
                //Menu App(Pembeli)    
                case 2:
                System.out.println("==========Pembeli==========");    
                System.out.println("| 1. Tambah Pembeli Baru  |");
                System.out.println("| 2. Lihat Daftar Pembeli |");
                System.out.println("| 3. Hapus Pembeli        |");
                System.out.println("==========================");
                System.out.print("Pilih = ");
                int pilihPembeli = sc.nextInt();
                switch(pilihPembeli) {
                    case 1:
                        System.out.print("Masukkan Nama Pembeli: ");
                        String namaPembeli = sc.next();
                        System.out.print("Masukkan Alamat Pembeli: ");
                        String alamatPembeli = sc.next();
                        cPembeli pembeliBaru = new cPembeli(namaPembeli, alamatPembeli);
                        System.out.println("Pembeli berhasil ditambahkan!");
                        break;
                    case 2:
                        System.out.println("Daftar Pembeli:");
                        break;
                    case 3:
                        System.out.print("Masukkan Nama Pembeli yang Akan Dihapus: ");
                        String namaPembeliHapus = sc.next();
                        System.out.println("Pembeli berhasil dihapus!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        break;
                }
                break;
                
                //Menu App(Transaksi)
                case 3:
                    System.out.println("==Transaksi==");
                    System.out.println("| 1. Tambah |");
                    System.out.println("| 2. Ubah   |");
                    System.out.println("| 3. Hapus  |");
                    System.out.println("| 4. Cetak  |");
                    System.out.println("=============");
                    System.out.print("  Pilih = ");
                    pilih2=sc.nextInt();
                    switch(pilih2){
                        case 1:
                            System.out.print("Nama = ");
                            String n = sc.next();
                            pb = new cPembeli(n);
                            tr.setPembeli(pb);
                            String pr;
                            int j = 0, pilih3=0;
                            do{
                                System.out.println("Produk");
                                System.out.println("1. Sepatu");
                                System.out.println("2. Sandal");
                                System.out.println("3. Tas");
                                System.out.println("4. Selesai");
                                System.out.print("Pilih = ");
                                pilih3=sc.nextInt();
                                switch(pilih3) {
                                    case 1:
                                        System.out.println("Jumlah = ");
                                            if (sc.hasNextInt()) {
                                                j = sc.nextInt();
                                                if (j > 0 && j <= produk[0].getStok()) {
                                                    tr.tambahProduk(produk[0], j);
                                                    System.out.println("Tambah sukses!");
                                                } else {
                                                    System.out.println("Jumlah tidak valid atau melebihi stok yang tersedia!");
                                                }
                                            } else {
                                                System.out.println("Input tidak valid!");
                                                sc.next(); // Mengonsumsi input yang tidak valid agar tidak terjebak dalam loop
                                            }
                                            break;
                                    case 2:
                                        if (produk.length > 1 && produk[1] != null) {
                                            tr.tambahProduk(p, j);
                                            System.out.println("Tambah sukses!");
                                        } else {
                                            System.out.println("Produk tidak tersedia atau tidak valid!");
                                        }
                                        break;
                                    case 3:
                                        if (produk.length > 2 && produk[2] != null) {
                                        tr.tambahProduk(p, j);
                                        System.out.println("Tambah sukses!");
                                    } else {
                                        System.out.println("Produk tidak tersedia atau tidak valid!");
                                    }
                                    break;
                                    case 4:
                                        System.out.println("Kembali..");
                                }
                            }while(pilih3!=4);
                            
                            /*
                            System.out.print("Produk = ");
                            String pr = sc.next();
                            System.out.print("Jumlah = ");
                            int j = sc.nextInt();
                            if(pr.equalsIgnoreCase(p2.getNama())){
                                int t = j*p2.getharga();
                                
                                tr.setProduk(p2);
                                tr.setJumlah(j);
                                tr.setTotal(t);
                                System.out.println("Transaksi sukses..");
                            }
                            else{
                                System.out.println("Produk tidak ada!");
                            }
                            */
                            break;

                        case 2:
                            System.out.println("Nama Produk = ");
                            pr=sc.next();
                            for(int i = 0; i < tr.getidxprd(); i++) {
                                if(pr.equalsIgnoreCase(tr.getProduk()[i].getNama())){
                                    System.out.println("Jumlah Baru = ");
                                    j = sc.nextInt();
                                    System.out.println("Yakin Ubah?");
                                    System.out.println("1.Ya\n2.Batal");
                                    System.out.print("Jawab = ");
                                    int jwb=sc.nextInt();
                                    if(jwb==1){
                                        tr.setJumlah(j);
                                        tr.setTotal(j*tr.getProduk()[i].getHarga());
                                        System.out.println("Ubah sukses...");
                                        break;
                                    }
                                    else System.out.println("Ubah batal!");
                                    break;
                                }
                                else System.out.println("Produk tidak ada!");
                            }    
                            break;
                        case 3:
                            System.out.println("Nama Produk = ");
                            pr=sc.next();
                            tr.hapusProduk(pr);
                            break;
                        case 4:
                            if(tr!=null){
                                System.out.println("Pembeli : "+tr.getPembeli().getNama());
                                tr.lihatTransaksi();
                                //System.out.println("Produk : "+tr.getProduk().getNama());
                                //System.out.println("Jumlah : "+tr.getJumlah());
                                //System.out.println("Harga : "+tr.getProduk().getharga());
                                //System.out.println("Total : "+tr.getTotal());
                            }
                            else System.out.println("Transaksi Kosong!");
                    }
                    break;
                    
                //Menu App(Exit)    
                case 4:
                    System.out.println("Terima Kasih..");
            }
        }while(pilih!=4);
    }
    
}
