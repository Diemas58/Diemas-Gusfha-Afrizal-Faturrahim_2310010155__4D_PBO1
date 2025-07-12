package Cryptocurrency;

//class
public class Solana extends CryptoAsset {

    //constructor
    public Solana(double jumlah) {
        //inheritance
        super("Solana", jumlah);
    }

    //polymorphism (overriding)
    @Override
    public double getHargaPasar() {
        return 140; // harga pasar SOL (contoh nilai tetap)
    }
}