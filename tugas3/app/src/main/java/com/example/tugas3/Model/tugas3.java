package com.example.tugas3.Model;

public class tugas3 {
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

    public tugas3(String sepatu, int urut) {
        this.Sepatu = sepatu;
        this.urut = urut;
    }

    public void setUrut(int urut) {
        this.urut = urut;
    }
}
