package org.example;

public class TV {
    private Colokan colokan;
    private int resolusi;
    public TV(int resolusi) {
        this.resolusi = resolusi;
    }
    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }
    public int getResolution(){
        return resolusi;
    }
}
