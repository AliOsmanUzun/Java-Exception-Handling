import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 throw Anahtar Kelimesi Nedir?

	 throw anahtar kelimesi, Java'da manuel olarak bir istisna (exception) fırlatmak (throw) için kullanılır.
	 Genellikle bir metot içinde, belirli bir koşul karşılandığında bir hata durumu oluşturmak ve
	 bu hatayı dışarıya bildirmek için kullanılır
	 
	 throw anahtar kelimesi, programın belirli bir noktasında bir istisna meydana gelmesi gerektiğinde kullanılır. 
	 Bu, programcıya hatalı bir durum tespit edildiğinde kontrolü eline alma imkanı sağlar.
	 Örneğin, bir metot geçersiz bir argüman aldığında veya belirli bir koşul sağlanmadığında 
	 bir istisna fırlatılabilir

	Throw anahtar kelimesi ile istediğimiz zaman ve durumlarda kendi exceptionlarımızı fırlatabiliriz.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen yaşınızı giriniz : ");
		int age = scanner.nextInt();
		

		// Bu exceptionımızı try catch yapısını kullanarak yakalayabiliriz
		try {
			mekanKontrol(age);
		}
		catch(IllegalArgumentException e) {
			System.out.println("18 yaşından küçük bireyler mekana giriş yapamaz...");
		}
		
		scanner.close();
	}
	public static void mekanKontrol(int age) {
		if (age<18) {
			throw new IllegalArgumentException();
			// Bu istisna bir metodun aldığı argümanın geçersiz veya uygunsuz olduğu durumlarda kullanılır.
			// throw anahtar kelimesini kullanarak bir exception sınıfından nesne oluşturduk
			// ve bu exception objesini belirttiğim koşullar oluşunca fırlatıyorum
		}
		else {
			System.out.println("Mekana giriş yapabilirsiniz." + " Yaş : " + age);
		}
	}
}
