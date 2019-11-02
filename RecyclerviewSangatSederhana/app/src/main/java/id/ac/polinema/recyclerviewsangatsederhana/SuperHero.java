package id.ac.polinema.recyclerviewsangatsederhana;

public class SuperHero {
    public String heroName;
    public int gambar;

    public SuperHero(String heroName,int gambar) {
        this.heroName = heroName;
        this.gambar = gambar;
    }

    public String getHeroName() {
        return heroName;
    }

    public int getGambar() {
        return gambar;
    }

    public void setHeroName(String heroName, int gambar) {
        this.heroName = heroName;
        this.gambar = gambar;
    }
}
