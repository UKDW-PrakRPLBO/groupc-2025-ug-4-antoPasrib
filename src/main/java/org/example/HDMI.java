package org.example;

public class HDMI extends Colokan{
    public HDMI(double promiseBandwidth, int harga, String merk) {
        super(promiseBandwidth, harga, merk);
    }

    @Override
    public double getRealBandwidth() {
        double hargaPasar = 50000;
        double rasio = this.getHarga() / hargaPasar;
        if (rasio < 1) {
            return rasio * this.getPromiseBandwidth();
        } else {
            return getPromiseBandwidth();
        }
    }
}
