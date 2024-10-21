package Default;
import java.util.Scanner;
public class ucakbileti {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int km,yas,tip;
		double normalFiyat,yasİndirimi,tipİndirimi;
		
		System.out.print("Lütfen Gideceğiniz Kmyi Giriniz:");
		km= input.nextInt();
		
		System.out.print("\nLütfen Yaşınızı Giriniz:");
		yas = input.nextInt();
		
		System.out.print("\nLütfen Bilet Tipini Giriniz: (1-(Gidiş)  -  (2-(Gidiş/Dönüş))):");
		tip = input.nextInt();
		
		if(km>0 && yas>0 && (tip==1 || tip==2)) {
			
			normalFiyat = (km*0.10);
			if(yas<12) {
				yasİndirimi=normalFiyat*0.5;
				
			}
			else if(yas>=12 && yas<=24) {
				yasİndirimi = normalFiyat*0.1;
				
			}
			else if(yas>=65) {
				yasİndirimi = normalFiyat*0.3;
				
			}
			else {
				yasİndirimi = 0;
			}
			normalFiyat-=yasİndirimi;
			if(tip ==2) {
				tipİndirimi = normalFiyat*0.2;
				normalFiyat =(normalFiyat-tipİndirimi)*2;
			}
			System.out.println("Bilet Tutarınız:" + normalFiyat + "$");
			
			
			
		}
		else {
			System.out.println("Girdiğiniz Bilgiler Hatalıdır Lütfen Kontrol Ediniz!!!");
		}
		
		
		
	}

}
