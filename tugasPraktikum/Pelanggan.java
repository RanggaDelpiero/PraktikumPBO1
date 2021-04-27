package tugasPraktikum;

public class Pelanggan {

    String noKTP;
    String Nama;
    String Alamat;

    public String getNoKTP() {
        return noKTP;
    }
    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        Nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }
    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String toString() {
        return "Nama \t\t\t\t: " + this.getNama()+
                "\nNo. KTP \t\t\t: " + this.getNoKTP()+
                "\nAlamat \t\t\t\t: " + this.getAlamat();
    }
}
