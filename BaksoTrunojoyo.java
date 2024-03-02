package baksotrunojoyo;
import java.util.Scanner;

//Class Pembeli
class cPembeli{
    private String nama;
    private String Nomer;
    cPembeli(String n,String Nmr){
        nama=n;
        Nomer=Nmr;
        System.out.println("pembeli "+nama+" Dibuat...");
    }
    public void setnama(String n){
        nama=n;
    }
    public void setNomer(String N){
        Nomer = N;
    }
    public String getnama (){
        return nama;
    }
    public String getNomer () {
        return Nomer;
    }
    public String ToString(){
        return nama+"["+Nomer+"]";
    }
}

//Class Makanan
class cMakanan{
    private String namaMakanan;
    private int hargaMakanan;
    cMakanan(String n, int h){
        namaMakanan=n; hargaMakanan=h;
        System.out.println("Menu "+namaMakanan+" diproses..");
    }
    public void setHargaMakanan(int h){
        hargaMakanan=h;
    }
    public String getNamaMakanan(){
        return namaMakanan;
    }
    public int getHargaMakanan(){
        return hargaMakanan;
    }
    public String ToString(){
        return namaMakanan+"["+hargaMakanan+"]";
    }
}

//Class Minuman
class cMinuman{
    private String namaMinuman;
    private int hargaMinuman;
    
    cMinuman(String n,int h){
        namaMinuman=n; hargaMinuman=h;
        System.out.println("Menu "+namaMinuman+" diproses");
    }
    public void setHargaMinuman(int h){
         hargaMinuman=h;
    }
    public String getNamaMinuman(){
        return namaMinuman;
    }
     public int getHargaMinuman(){
       return hargaMinuman;
     }
     public String ToString(){
         return namaMinuman+"["+hargaMinuman+"]";
     }
}
public class BaksoTrunojoyo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cMakanan[] daftarMakanan = new cMakanan[8];
        cMinuman[] daftarMinuman = new cMinuman[5];
        cPembeli[] daftarPembeli = new cPembeli[7];
        int totalTransaksi = 0;
        
        cMakanan makan = new cMakanan("Pentol halus",17000);
        cMinuman minum = new cMinuman("Es Teh",15000);
        cPembeli Pb = new cPembeli("Budi","5");
        int pilih=0,pilih3;
        
        //Menu Utama
        do{
            System.out.println("\n===BAKSO TRUNOJOYO====");
            System.out.println("|   1.Makanan        |");
            System.out.println("|   2.Minuman        |");
            System.out.println("|   3.Pembeli        |");
            System.out.println("|   4.selesai        |");
            System.out.println("======================");
            System.out.println("pilih = ");
            pilih = sc.nextInt();
            switch(pilih) {
                
                //Sub Menu 1 (Makanan)
                case 1:
                    pilih3=0;
                    do{
                            System.out.println("=======Menu Makanan======");
                            System.out.println("|   1.Buat data Makanan |");
                            System.out.println("|   2.Lihat Menu        |");
                            System.out.println("|   3.ubah data         |");
                            System.out.println("|   4.Kembali           |");
                            System.out.println("=========================");
                            System.out.println("Pilih = ");
                            pilih3=sc.nextInt();
                            switch(pilih3){
                                
                                //Buat data Makanan
                                case 1:
                                    System.out.println("Nama Makanan = ");
                                    String n = sc.next();
                                    System.out.print("harga = ");
                                    int h =sc.nextInt();
                                    makan = new cMakanan(n,h);
                                    break;
                                
                                //Lihat Menu    
                                case 2:
                                    String t = makan.toString();
                                    System.out.println("Menu : "+t);
                                    break;
                                
                                //Ubah data    
                                case 3:
                                    System.out.println("Harga Baru makanan = ");
                                    int hb = sc.nextInt();
                                    makan.setHargaMakanan(hb);
                                    break;
                                
                                //Kembali Menu Utama    
                                case 4:
                                    System.out.println("Kembali ke Menu Utama..");
                                    break;
                                
                            }
                    }while(pilih3!=4);
                    break;
                    
                //Sub Menu 2(Minuman)    
                case 2:
                    pilih3=0;
                    do{
                        System.out.println("=========Minuman=========");
                        System.out.println("|   1.Buat data Minuman |");
                        System.out.println("|   2.Lihat data        |");
                        System.out.println("|   3.ubah data         |");
                        System.out.println("|   4.kembali           |");
                        System.out.println("=========================");
                        System.out.println("pilih=");
                        pilih3=sc.nextInt();
                        switch(pilih3){
                            
                        //Buat data Minuman    
                            case 1:
                                System.out.println("Nama minuman = ");
                                String n = sc.next();
                                System.out.print("harga = ");
                                int h = sc.nextInt();
                                minum = new cMinuman (n,h);
                                break;
                                
                        //Lihat Menu Minuman        
                            case 2:
                                String m= minum.toString();
                                System.out.println("Minuman +"+m);
                                break;
                                
                        //Ubah data        
                            case 3:
                                System.out.print("harga baru = ");
                                int hb = sc.nextInt();
                                minum.setHargaMinuman(hb);
                                break;
                                
                        //Kembali Ke Menu Utama        
                            case 4:
                                System.out.println("KEMBALI KE MENU UTAMA");
                                break;
                        }
                    }while(pilih3!=4);
                    break;
                    
                //Sub Menu Pembeli    
                case 3:
                    System.out.println("=========Pembeli=========");
                    System.out.println("|   1.Buat data Pembeli |");
                    System.out.println("|   2.lihat data        |");
                    System.out.println("|   3.ubah data         |");
                    System.out.println("|   4.kembali           |");
                    System.out.println("=========================");
                    int pilihPembeli = sc.nextInt();
                    switch(pilihPembeli){
                        
                    //Buat data Pembeli    
                        case 1:
                            System.out.println("Nama Pembeli = ");
                            String NamaPembeli = sc.next();
                            System.out.print("Nomer Pembeli = ");
                            String NomerPembeli = sc.next();
                           Pb = new cPembeli(NamaPembeli,NomerPembeli);
                           break;
                           
                    //Lihat data pembeli       
                        case 2:
                        String p = Pb.toString();
                            System.out.println("Pembeli: " + p);
                            break;
                    
                    //Ubah Data Pembeli        
                        case 3:
                            System.out.println("Nama Baru pembeli");
                            String nb = sc.next();
                            Pb.setnama(nb);
                            System.out.println("Nomer Baru pembeli");
                            String nn = sc.next();
                            Pb.setNomer(nn);
                            break;
                            
                        //Kembali Ke Menu Utama    
                        case 4:
                                  System.out.println("Kembali ke menu utama");
                                  break;
               
                        
                    }  
                    break;
                case 4 :
                    System.out.println("Terima kasih sudah pesan");
                    System.out.println("Total transaksi: " + totalTransaksi);
            }
        if(pilih==1){
           totalTransaksi += makan.getHargaMakanan();
        } else if (pilih == 2){
            totalTransaksi += minum.getHargaMinuman();
        }
        }while (pilih != 4);
    }    
}
