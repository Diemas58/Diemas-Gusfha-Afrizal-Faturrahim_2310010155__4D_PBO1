package Cryptocurrency;

//class
public class Bitcoin extends CryptoAsset {

    //constructor
    public Bitcoin(double jumlah) {
        //Inheritance
        super("Bitcoin", jumlah);
    }

    //polymorphism (Overriding)
    @Override
    public double getHargaPasar() {
        return 100000; // harga pasar BTC (contoh nilai tetap)
    }
}