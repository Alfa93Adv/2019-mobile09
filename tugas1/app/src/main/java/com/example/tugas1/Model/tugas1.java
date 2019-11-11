package com.example.tugas1.Model;

public class tugas1 {
    public String Sepatu;
    public int urut;

    public String getSepatu() {
        return Sepatu;
    }

    public void setSepatu(String sepatu) {
        Sepatu = sepatu;
    }

    public int getUrut() {
        return urut;
    }

    public tugas1(String sepatu, int urut) {
        this.Sepatu = sepatu;
        this.urut = urut;
    }

    public void setUrut(int urut) {
        this.urut = urut;
    }
}
