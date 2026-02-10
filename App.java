import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BidangDuaDimensi[] bentuk = new BidangDuaDimensi[4];
        bentuk[0] = new BujurSangkar(4);
        bentuk[1] = new Lingkaran(6);
        bentuk[2] = new BujurSangkar(5);
        bentuk[3] = new Lingkaran(8);

        int option = 0;

        do {
            System.out.println("1. Daftar Bidang Dua Dimensi");
            System.out.println("2. Hitung Luas");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            option = in.nextInt();
            System.out.println();

            switch (option) {
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                case 1:
                    for (int i = 0; i < bentuk.length; i++) {
                        System.out.printf("%d. ", i + 1);
                        bentuk[i].info();
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nomor bidang: ");
                    int index = in.nextInt() - 1;
                    if (index < 0 || index >= bentuk.length) {
                        System.out.println("Indeks tidak valid");
                        break;
                    }
                    bentuk[index].luas();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;

            }
            System.out.println("\n");
        } while (option != 0);
    }
}
