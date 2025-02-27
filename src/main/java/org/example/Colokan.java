package org.example;

public abstract class Colokan {
    private double promiseBandwidth;
    private int harga;
    private String merk;

    public Colokan(double promiseBandwidth, int harga, String merk) {
        this.promiseBandwidth = promiseBandwidth;
        this.harga = harga;
        this.merk = merk;
    }
    public double getPromiseBandwidth() {
        return promiseBandwidth;
    }
    public void setPromiseBandwidth(double promiseBandwidth) {
        this.promiseBandwidth = promiseBandwidth;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public abstract double getRealBandwidth();
}
