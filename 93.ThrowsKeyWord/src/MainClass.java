import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException  {
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen yaşınızı giriniz : ");
		int age = scanner.nextInt();
		
		mekanKontrol(age);
		// Exception hatası main metodu imzasında tanımlanırsa :
		// Bu java dosyasını başkası api olarak kullancaksa bu sefer main metodundaki IOException'ı bu api'yi kullanan
		// kişinin kendisinin yakalaması gerekiyor.
		// Zaten biz bunu api'ye dönüştürdüğümüz ve kullanıcı bunu kullanmaya çalıştığı zaman orada hata verecek
		
		// Checked bir exception fırlattığım için java bunu ön görüyor ve bunu ExceptionHandling yapmam konusunda 
		// beni uyarıyor
		
		
		
		// throws anahtar kelimesini checked exception sınıfları ile kullanıyoruz
		// Bir metod içerisinde checked exception fırlatacaksak bunu metod imzasında özellikle belirtmemiz gerekiyor
		
		scanner.close();
			
	}
	public static void mekanKontrol(int age) throws IOException  { // Bu metot IOException fırlatır 
		if (age<18) {
			throw new IOException();// Unchecked Exception RunTime esnasında oluşuyor
		}
		else {
			System.out.println("Mekana giriş yapabilirsiniz." + " Yaş : " + age);
		}
	}

}
