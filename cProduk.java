package baksotrunojoyo;
public class cProduk {
    //data
    private String nama, kode;
    private int harga, stok;
    //method
    cProduk(){
    }
    cProduk(String n, int h, int s){
        nama=n; harga=h; stok=s;
        
    }
    public void setHarga(int h){ harga=h; }
    public void setStok(int s){ stok=s;}
    public String getNama(){ return nama; }
    public int getHarga(){ return harga; }
    public int getStok(){ return stok; }
    public String toString(){
        return nama+" harga:"+harga+" stok:"+stok;
    }
}
