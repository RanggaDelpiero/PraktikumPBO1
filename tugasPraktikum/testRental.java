package tugasPraktikum;

public class testRental {

    public static void main(String[] args) {

        Mobil honda = new Mobil();
        honda.setHargaSewa("RP100.000");
        honda.setNoPol("B 2021 TIF");
        honda.setTahun("2021");
        honda.setWarna("Hitam");

        System.out.println("Data Mobil");
        System.out.println(honda);

        Pelanggan pelanggan1 = new Pelanggan();
        pelanggan1.setNama("Rangga");
        pelanggan1.setNoKTP("3171200000");
        pelanggan1.setAlamat("Jakarta Barat");

        System.out.println("Data Pelanggan");
        System.out.println(pelanggan1);

        Sopir sopir1 = new Sopir();
        sopir1.setNama("Mamat");
        sopir1.setSIM("20515020223");
        sopir1.setAlamat("Jakarta Selatan");
        sopir1.setGajiHarian("Rp500.000");

        System.out.println("Data Sopir");
        System.out.println(sopir1);
    }
}
