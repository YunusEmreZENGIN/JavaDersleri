package Default;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String kadi,sifre;
		
		System.out.print("Lütfen Kullanıcı Adınızı Giriniz:");
		kadi = input.nextLine();
		
		System.out.print("Lütfen Şifrenizi Giriniz:");
		sifre = input.nextLine();
		
		if(kadi.equals("java") && sifre.equals("123")) {
			System.out.println("Tebrikler Başarılı Bir Şekilde Giriş Yaptınız.");
			
		}
		else if((kadi.equals("java")) && !(sifre.equals("123"))) {
			System.out.println("Şifreniz hatalı Lütfen Tekrar Deneyiniz!!!");
		}
		else if(!(kadi.equals("java")) && (sifre.equals("123"))) {
			System.out.println("Kullanıcı Adiniz Hatalı Lütfen Tekrar Deneyiniz!!!");
		}
		
		
		
	}

}
