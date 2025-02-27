package org.example;

public class VGA extends Colokan{
    public VGA(double promiseBandwidth, int harga, String merk) {
        super(promiseBandwidth, harga, merk);
    }
    public double getRealBandwidth() {
        double hargaPasar = 30000;
        double rasio = this.getHarga() / hargaPasar;
        if (rasio < 1) {
            return rasio * this.getPromiseBandwidth();
        } else {
            return this.getPromiseBandwidth();
        }
    }
}
