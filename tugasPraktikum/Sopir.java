package tugasPraktikum;

public class Sopir {

    String Nama;
    String SIM;
    String Alamat;
    String gajiHarian;

    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        Nama = nama;
    }

    public String getSIM() {
        return SIM;
    }
    public void setSIM(String SIM) {
        this.SIM = SIM;
    }

    public String getAlamat() {
        return Alamat;
    }
    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getGajiHarian() {
        return gajiHarian;
    }
    public void setGajiHarian(String gajiHarian) {
        this.gajiHarian = gajiHarian;
    }

    public String toString() {
        return "Nama \t\t\t\t: " + this.getNama()+
                "\nNo. SIM \t\t\t: " + this.getSIM()+
                "\nAlamat \t\t\t\t: " + this.getAlamat()+
                "\nGaji per Hari \t\t: " + this.getGajiHarian();
    }
}
