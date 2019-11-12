package com.example.tugas2.Model;

public class tugas2 {
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

    public tugas2(String sepatu, int urut) {
        this.Sepatu = sepatu;
        this.urut = urut;
    }

    public void setUrut(int urut) {
        this.urut = urut;
    }
}
