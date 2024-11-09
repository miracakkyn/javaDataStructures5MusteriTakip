package newPkg;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList liste = new LinkedList();
		Scanner scanner = new Scanner(System.in);
		int secim = -1;
		System.out.println("Müşteri Kayıt Programına Hoşgeldiniz...");
		while (secim != 0) {
			System.out.println("_________________________________________________________________");
			System.out.println("1-Müşteri Ekle");
			System.out.println("2-Müşteri Sil");
			System.out.println("3-Müşteri Ara");
			System.out.println("4-Müşteri Yazdır");
			System.out.println("5-Müşteri Güncelle");
			System.out.println("0-Çıkış");
			System.out.println("------------------------------------------------------------------");
			System.out.print("Seçiminiz: ");
			secim = scanner.nextInt();
			if (secim == 1) {
				liste.ekle();
			} else if (secim == 2) {
				liste.sil();
			} else if (secim == 3) {
				liste.ara();
			} else if (secim == 4) {
				liste.yazdır();
			} else if (secim == 5) {
				liste.musteriGuncelle();
			} else if (secim == 0) {
				System.out.println("Programdan Çıkılıyor...");
				break;
			}else {
				System.out.println("Hatalı Seçim!!!");
			}

		}

	}

}
