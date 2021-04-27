package tugasPraktikum;

public class Mobil {

    String noPol;
    String Tahun;
    String Warna;
    String hargaSewa;

    public String getNoPol() {
        return noPol;
    }
    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }

    public String getTahun() {
        return Tahun;
    }
    public void setTahun(String tahun) {
        Tahun = tahun;
    }

    public String getWarna() {
        return Warna;
    }
    public void setWarna(String warna) {
        Warna = warna;
    }

    public String getHargaSewa() {
        return hargaSewa;
    }
    public void setHargaSewa(String hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public String toString() {
        return "No. Polisi \t\t\t: " + this.getNoPol()+
                "\nTahun \t\t\t\t: " + this.getTahun()+
                "\nWarna \t\t\t\t: " + this.getWarna()+
                "\nHarga Sewa per Hari : " + this.getHargaSewa();
    }
}
