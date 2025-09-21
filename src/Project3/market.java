package Project3;

import java.util.Scanner;

public class market {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] isimler = {"Domates", "Biber", "Patlıcan", "Turşu"};
        double[] fiyatlar = {20.0, 30.0, 40.0, 50.0};
        int[] stoklar = {5, 6, 7, 8};
        int toplam = 0;
        String cikis;

        do {
            System.out.println("Ürün seçiniz: (Çıkmak için Q'ya basınız...)");
            for (int i = 0; i < isimler.length; i++) {
                System.out.println(i + 1 + ".ürün: " + isimler[i] + " " + fiyatlar[i] + "TL " + stoklar[i] + " adet var...");
            }
            System.out.println("Hangi ürünü almak istersiniz? (1-4 arası seçim yapınız) : ");
            int urunSecim = scanner.nextInt() - 1;
            System.out.println("Kaç adet almak istersiniz? : ");
            int urunAded = scanner.nextInt();

            if (stoklar[urunSecim] >= urunAded) {
                toplam += (int) (urunAded * (fiyatlar[urunSecim]));
                stoklar[urunSecim] -= urunAded;
                System.out.println("Ödemeniz gereken tutar: " + toplam);
            } else System.out.println("Stok yetersiz. " + stoklar[urunSecim]);
            System.out.println("Alışverişe devam etmek ister misiniz? (Çıkmak için Q'ya basın.)");
            scanner.nextLine();
            cikis = scanner.nextLine().toLowerCase();
        } while (!cikis.equalsIgnoreCase("q"));
    }
}

