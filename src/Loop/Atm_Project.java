package Loop;
import java.util.Scanner;
public class Atm_Project {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int right = 3;
		String userName, password;
		int select;
		int balance = 1500;
			while(right > 0 ) {
				System.out.print("Kullanıcı Adınız: ");
				userName = inp.nextLine();
				System.out.print("Şifreniz: ");
				password = inp.nextLine();
				
				if (userName.equals("patika") && password.equals("2113")) {
					System.out.println("Sisteme başarıyla girişiniz sağlandı.");
					
					do {
						System.out.print("1-Para Yatırma\n" 
								+"2-Para Çekme\n"
								+"3-Bakiye Sorgulama\n" + "4-Çıkış Yap\n"
								+"Şimdi yapmak istediğiniz işlemi giriniz: ");
						select = inp.nextInt();
						// Switch part start
						switch(select) {
						case 1:
							System.out.print("Yatırmak istediğiniz tutar: ");
							int price = inp.nextInt();
							balance += price;
						break;
						case 2:
							System.out.print("Çekmek istediğiniz tutar: ");
							int fee= inp.nextInt();
							if (fee > balance) {
								System.out.println("Bakiyeniz Yetersiz.");
							}else {
								balance -= fee;
							}
						break;
						case 3:
							System.out.println("Bakiyeniz:" + balance);
							break;
						} 
						// Switch part end
						 
					} while(select != 4);
					
				System.out.println("Çıkışınız Güvenli bir şekilde yapıldı.\n"+"Tekrar görüşmek üzere...");
				break;	
				
				} else {
					right--;
					System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.");
					if (right == 0) {
	                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
					}
					System.out.println("Kalan Hakkınız: " + right);
			}
		}

	}
}
