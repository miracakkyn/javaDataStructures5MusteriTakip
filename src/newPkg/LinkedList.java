package newPkg;

import java.util.Scanner;

public class LinkedList {
	Scanner scanner = new Scanner(System.in);
	MusteriNode head;
	MusteriNode tail;
	int id;
	String ad;
	String soyad;
	String tel;
	String adres;
	String urun;

	void ekle() {
		System.out.println("Müşteri Bilgilerini Giriniz...");
		System.out.print("ID: 				");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Ad: 			    ");
		ad = scanner.nextLine();
		System.out.print("Soyad: 		    ");
		soyad = scanner.nextLine();
		System.out.print("Telefon Numarası: ");
		tel = scanner.nextLine();
		System.out.print("Adres:            ");
		adres = scanner.nextLine();
		System.out.print("Ürün Adı:         ");
		urun = scanner.nextLine();
		System.out.println();
		MusteriNode eleman = new MusteriNode(id, ad, soyad, tel, adres, urun);

		if (head == null) {
			head = eleman;
			tail = eleman;
			System.out.println("Liste Oluşturuldu" + id + " Numaralı İlk Müşteri Kayıt Edildi");
		} else {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
			System.out.println(id + " Numaralı Müşteri Kayıt Edildi");

		}
	}

	void sil() {
		if (head == null) {
			System.out.println("Liste Boş Silinecek Müşteri Yok...");
		} else {
			System.out.println("Silinecek Müşteri ID Giriniz...");
			System.out.print("ID: 				");
			int gecici = scanner.nextInt();
			scanner.nextLine();
			if (head.next == null && head.id == gecici) {
				head = null;
				tail = null;
				System.out.println(gecici + " Numaralı Müşteri Kaydı Silindi");

			} else if (head.next != null && head.id == gecici) {
				head = head.next;
				head.prev = null;
				System.out.println(gecici + " Numaralı Müşteri Kaydı Silindi");

			} else if (tail.id == gecici) {
				tail = tail.prev;
				tail.next = null;
				System.out.println(gecici + " Numaralı Müşteri Kaydı Silindi");

			} else {
				MusteriNode temp = head;
				while (temp != null) {
					if (temp.id == gecici) {
						temp.prev.next = temp.next;
						temp.next.prev = temp.prev;
						System.out.println(gecici + " Numaralı Müşteri Kaydı Silindi");
						break;
					}
					temp = temp.next;
				}
				System.out.println("Müşteri Kaydı Bulunamadı!!!");
			}
		}

	}

	void yazdır() {
		if (head == null) {
			System.out.println("Müşteri Listesi Boş!!!");
		} else {
			MusteriNode temp = head;
			System.out.println("ID             " + "AD             " + "SOYAD          " + "TEL            "
					+ "ADRES          " + "ÜRÜN           ");
			System.out.println(
					"____________________________________________________________________________________________________________");
			while (temp != null) {
				System.out.println(temp.id + "         " + temp.ad + "         " + temp.soyad + "         " + temp.tel
						+ "         " + temp.adres + "         " + temp.urun);
				temp = temp.next;
			}
		}
	}

	void ara() {
		if (head == null) {
			System.out.println("Müşteri Listesi Boş!!!");
		} else {
			System.out.println("Aranacak Müşteri ID Giriniz...");
			System.out.print("ID: 				");
			int gecici = scanner.nextInt();
			scanner.nextLine();
			MusteriNode temp = head;
			while (temp != null) {
				if (temp.id == gecici) {
					System.out.println(
							"___________________________________________________________________________________________________");
					System.out.println(temp.id + "         " + temp.ad + "         " + temp.soyad + "         "
							+ temp.tel + "         " + temp.adres + "         " + temp.urun);
					break;
				}
				temp = temp.next;
			}
			if(temp==null) {
				System.out.println("Müşteri Kaydı Bulunamadı!!!");
			}
		}
	}

	void musteriGuncelle() {
		if (head == null) {
			System.out.println("Liste Boş Güncellenecek Müşteri Yok");
		} else {
			System.out.println("Güncellenecek Müşteri ID Giriniz...");
			System.out.print("ID: 				");
			int gecici = scanner.nextInt();
			scanner.nextLine();
			MusteriNode temp = head;
			while (temp != null) {
				if (temp.id == gecici) {
					System.out.println(
							"___________________________________________________________________________________________________");
					System.out.println(temp.id + "         " + temp.ad + "         " + temp.soyad + "         "
							+ temp.tel + "         " + temp.adres + "         " + temp.urun);
					System.out.println(
							"----------------------------------------------------------------------------------------------------");
					System.out.println("Müşterinin Hangi Bilgisisni Güncellemek İstiyorsunuz ?");
					System.out.println("1-Ad");
					System.out.println("2-Soyad");
					System.out.println("3-Telefon");
					System.out.println("4-Adres");
					System.out.println("5-Ürün");
					int secim=scanner.nextInt();
					if(secim==1) {
						System.out.print("İsim Giriniz: ");scanner.nextLine();
						String klm=scanner.nextLine();
						temp.ad=klm;
					}else if(secim==2) {
						System.out.print("Soyisim Giriniz: ");scanner.nextLine();
						String klm=scanner.nextLine();
						temp.soyad=klm;
					}else if(secim==3) {
						System.out.print("Telefon Giriniz:");scanner.nextLine();
						String klm=scanner.nextLine();
						temp.tel=klm;
					}else if(secim==4) {
						System.out.print("Adres Giriniz:");scanner.nextLine();
						String klm=scanner.nextLine();
						temp.adres=klm;
					}else if(secim==5) {
						System.out.print("Ürün Giriniz:");scanner.nextLine();
						String klm=scanner.nextLine();
						temp.urun=klm;
					}else {
						System.out.println("Hatalı Seçim!!!");
					}
					System.out.println();
					break;
				}
				temp = temp.next;
			}


		}
	}
}
