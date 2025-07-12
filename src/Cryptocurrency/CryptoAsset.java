package Cryptocurrency;
//class
public class CryptoAsset {
    //atribut (encapsulation)
    private final String nama;
    private double jumlah;

    //constructor
    public CryptoAsset(String nama, double jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    //mutator
    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    //accessor
    public double getJumlah() {
        return jumlah;
    }

    //accessor
    public String getNama() {
        return nama;
    }

    //polymorphism
    public double getHargaPasar() {
        return 0;
    }

    //polymorphism + accessor
    public double getNilaiAsset() {
        return getJumlah() * getHargaPasar();
    }
}
