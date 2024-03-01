package finalproject;
import java.util.Scanner;
import java.util.ArrayList;
public class FinalProject {
    public static void main(String[] args) {
        cProduk p = new cProduk();
        cProduk p2 = new cProduk("kaos polos hitam",30000,10);
        Scanner sc = new Scanner(System.in);
        ArrayList<cTransaksi> transaksiList = new ArrayList<>();
        int pilih=0;
        do{
            System.out.println("\nMenu APP");
            System.out.println("1.Produk");
            System.out.println("2.Pembeli");
            System.out.println("3.Transaksi");
            System.out.println("4.Exit");
            System.out.print("Pilih =");
            pilih=sc.nextInt();
            switch(pilih){
            //Sub Menu 1 (Produk)    
                case 1:
                    System.out.println("[Produk]");
                    System.out.println("  1.Tambah");
                    System.out.println("  2.Ubah");
                    System.out.println("  3.Hapus");
                    System.out.println("  4.Detail");
                    System.out.println("  Pilih = ");
                    int pilih2=sc.nextInt();
                    switch(pilih2){
                        case 1:
                            sc=new Scanner(System.in);
                            System.out.print("Nama = ");
                            String nm=sc.nextLine();
                            System.out.print("Harga = ");
                            int hg=sc.nextInt();
                            System.out.print("Stok = ");
                            int st=sc.nextInt();
                            p2 = new cProduk(nm,hg,st);
                            break;    
                        case 2:
                            System.out.print("  Stok Baru = ");
                            st=sc.nextInt();
                            System.out.println("Yakin Ubah?");
                            System.out.println("  1.Ya");
                            System.out.println("  2.Batal");
                            System.out.println(" Jawab = ");
                            int jwb=sc.nextInt();
                            if(jwb==1){
                                p2.setStok(st);
                                System.out.println("Ubah stok berhasil..");
                            }else{
                                System.out.println("Ubah stok batal");
                            }
                            break;
                        case 3:
                            System.out.print("  Nama = ");
                            nm=sc.next();
                            if(nm.equalsIgnoreCase(p2.getNama())){
                                System.out.println("Yakin Hapus?");
                                System.out.println("1.Ya");
                                System.out.println("2.Batal");
                                System.out.println("Jawab = ");
                                jwb=sc.nextInt();
                                if(jwb==1){
                                    p2=null;
                                    System.out.println("Hapus sukses..");
                                }
                                else{
                                    System.out.println("Batal hapus!");
                                }
                            }else{
                                System.out.println("Produk tidak ada!");
                            }
                            break;
                        case 4:
                            if(p2!=null) 
                            System.out.println(p2.toString());
                            else System.out.println("Object Kosong");
                    }
                    break;
                
                //Sub Menu 2 (Pembeli)    
                case 2:
                    sc = new Scanner(System.in);
                    System.out.println("\n[Beli Produk]");
                    if(p2 !=null){
                    System.out.println("Produk yang tersedia: ");
                    System.out.println(p2.toString());
                    System.out.print("Jumlah yang ingin dibeli: ");}
                    int jumlahBeli = sc.nextInt();
                    if(jumlahBeli > p2.getStok()){
                        System.out.println("Maaf Stok tidak mencukupi");
                    }else{
                        System.out.println("Tidak ada produk yang tersedia untuk dibeli.");
                    }
                    break;
                    
                //Sub Menu 3(Transaksi)    
                case 3:
                    System.out.println("\n[Daftar Transaksi]");
                    if(!transaksiList.isEmpty()){
                    for(cTransaksi transaksi : transaksiList){
                     System.out.println(transaksi.toString());
                    }
                     }else{
                        System.out.println("Belum ada transaksi.");
                    }
                    break;
                    
                //Sub Menu 4    
                case 4:
                    System.out.println("Terima Kasih...");
            }
        }while(pilih!=4);
    }
}    
