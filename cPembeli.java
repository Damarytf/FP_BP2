package baksotrunojoyo;
public class cPembeli {
    private String nama;
    private String alamat;
    cPembeli(){
        System.out.println("Default Costructor Pembeli..");
    }
    cPembeli(String n){nama=n;}
    cPembeli(String n, String a){
        nama= n; alamat=a;
        System.out.println("Object "+nama+" dibuat...");
    }
    public String getNama(){return nama;}
    public String getAlamat(){return alamat;}

}
