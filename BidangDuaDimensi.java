public class BidangDuaDimensi {
    private String nama;

    BidangDuaDimensi (String nama) {
        setNama(nama);
    }

    public String getNama() {
        return nama;
    }
     public void setNama(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama bidang: " + nama);
    }

    public void luas() {

    }
}
