import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		// Kendi exception class'ımızı oluşturmak için bu class'ı bir exception sınıfından türetmemiz gerekiyor
		// Bu class Exception olabilir , RuntimeException olabilir ,  IOException olabilir vs....
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen yaşınızı giriniz : ");
		int age = scanner.nextInt();
		// Class'ım bir UncheckedException class olduğu için Java hata fırlatacağını göremiyor
		// Bu yüzden ExceptionHandling görevi bana kalıyor.
		try {
		mekanKontrol(age); // exception fırlatabilecek kod bloğum
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
			// Böyle bir kullanımda Constructor'a girdiğimiz string değer direkt olarak ekranda çıktı olarak belirecek
		}
		scanner.close();
	}
	public static void mekanKontrol(int age) {
		if (age<18) {
			throw new InvalidAgeException("Invalid Age");
			// InvalideAgeException sınıfımdan bir tane exception fırlattım throw anahtar kelimesi ile 
		}
		else {
			System.out.println("Mekana Hoşgeldiniz" + " Yaş : " + age);
		}
	}
}
