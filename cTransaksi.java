package baksotrunojoyo;
import java.util.Scanner;
public class cTransaksi {
    private cPembeli pb1;
    private cProduk prd[];
    private int jumprd[];
    private int totprd[];
    private String kode;
    private String tgl;
    private int idxprd; //index array
    private int maksprd; //maksimum kapasitas array
    private int jumlah;
    private int total;
    cTransaksi(){
        prd=new cProduk[5];
        jumprd=new int [5];
        totprd=new int [5];
        idxprd=0; maksprd=5;
        System.out.println("Default Constructor transaksi");
    }
    public void setPembeli(String n, String a){
        pb1 = new cPembeli (n,a);
    }
    public void setPembeli(cPembeli pb){
        pb1= new cPembeli();
        pb1=pb;
    }
    
    public void setProduk(cProduk p){
        prd[idxprd]=new cProduk();
        prd[idxprd]=p;
    }
    public void setJumlah(int j){jumlah=j; }
    public void setTotal(int t) {total=t; }
    public cPembeli getPembeli(){return pb1; }
    public cProduk[] getProduk(){return prd; }
    public int getJumlah(){return jumlah; }
    public int getTotal(){return total; }
    public int getidxprd(){return idxprd;}
    public void tambahProduk(cProduk p, int j) {
        if (idxprd < maksprd) {
            prd[idxprd] = p;
            jumprd[idxprd] = j;
            totprd[idxprd] = j * p.getHarga();
            idxprd++;
            System.out.println("Tambah sukses..");
        } else {
            System.out.println("Keranjang penuh!");
        }
    }
    public void lihatTransaksi(){
        System.out.println("Daftar Belanja");
        for(int i = 0; i < idxprd; i++){
            System.out.println((i+1)+"."+prd[i].getNama()+" ["+jumprd[i]+"]");
        }
        System.out.println("");
    }
    public void hapusProduk(String np){
        boolean ketemu=false;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < idxprd; i++) {
            if(np.equalsIgnoreCase(prd[i].getNama())){
                ketemu=true;
            System.out.println("Yakin Hapus?");
            System.out.println("1.Ya\n2.Batal");
            System.out.print("Jawab = ");
            int jwb=sc.nextInt();
            if(jwb==1){
                prd[i]=null;
                for (int j = i; j < idxprd; j++) {
                    if(j==idxprd-1){
                        prd[j]=null;
                    }
                    else prd[j]=prd[j+1];
                }
                idxprd--;
                System.out.println("Hapus sukses..");
            }else System.out.println("Batal Hapus!");
            break;
            }
        } 
    }
}