public class BujurSangkar extends BidangDuaDimensi {
    private int sisi;

    BujurSangkar(int sisi) {
        super("Bujur Sangkar");
        this.sisi = sisi;
    }

    @Override
    public void luas() {
        System.out.println("Luas " + getNama() + ": " + (sisi * sisi));
    }
}
