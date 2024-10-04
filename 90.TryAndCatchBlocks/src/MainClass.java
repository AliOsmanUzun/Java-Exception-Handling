
public class MainClass {
	public static void main(String[] args) {
		
	/*	Exception'lari yakalamak için try ve catch bloklarını kullanıyoruz.
	 try {
	  	// Exception oluşturabilecek kodlar
	 }
	 
	 
	 catch ( Exception_Türü e ) 
	 	// Exception durumunda yapılacak işlemler
	  
	 	
	 */
		
		// int a = 30/0; // Unchecked Exception , ArithmeticException hatası aldım
		
		// int [] a = {1,2,3,4,5,};
		
		// System.out.println(a[6]); // Unchecked Exception , ArrayIndexOutOfBoundsException hatası aldım.
		
		
	try {
		// Exception Oluşturabilecek Kod Bloğum
		@SuppressWarnings("unused")
		int a = 25/0; // Arithmetic Exception
	}
	catch (Exception e) { // Super Class'ı olan Exception class'ınıda kullanabilirim burada
		// Try kod bloğumdaki kod bloğu Arithmetic Exception hatası verirse catch bloğundaki kodlarım çalışacak
		System.out.println("Bir sayı 0'a bölünemez.");
	} 
	
	try {
	int [] sayilar = {1,2,3,4,5};	
	System.out.println(sayilar[10]); // 10. indexde değer olmadığı için runtime exception alıcam
								 // ArrayİndexOutOfBoundsException super class'ı Exception ,İndexOutOfBoundsException
			
	} catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace(); // Bu metod bize exception'ın bize java tarafındaki mesajını iletiyor direkt olarak
							// Ayrıca bize  bu exception'ın hangi exception sınıfı kaynaklı olduğunu gösteriyor
	}
	
	// Normalde exception aldığımızda exceptiondan sonraki kod blokları çalışmıyor
	// Ama try ve  catch bloklarını kullandıktan sonra hata bile alsak onlardan sonraki kod blokları
	// çalışmaya devam ediyor.
	// Exception Handling yaptığımızda programımız exceptionı yakaladığımız için artık durmayacak çalışmaya devam edecek
	// Mantığı bu aslında hatayı yakalayıp programımızın sorunsuz bir şekilde çalışmaya devam etmesi
	
	
	
	
	try {
		@SuppressWarnings("unused")
		int b = 50/0;
		int[] a = {1,2,3,4};
		System.out.println(a[4]);
		
		
		
		// Burada 2 tane exception hatası fırlatılacak birisi ArrayIndexOutOfBoundsException
		// Diğeri ise ArithmeticException bu 2 exception içinde ayrı ayrı catch'ler yazmamız gerekiyor
		// Çünkü amaç hatalarımızı daha özele indirmek bunun amacı kullanıcı veya programcıya daha iyi bir geri dönüş sağlamak
		// Tek bir catch bloğu kullanarakda bu hataları tespit edebiliriz ancak ozaman genel bir tespit yapmış oluruz.
	}
	catch(ArithmeticException e){
		System.out.println("Bir sayı sıfıra bölünemez!!!");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array'in boyutunu aştınız...");
	}
	
	catch(Exception e) { // Ortak exception sınıfı en alta yazıldı 
		e.printStackTrace();
	}
	
	// Eğer belirlenen bir hatayı özel olarak spesifik şekilde yazmak istiyorsak catch bloğunda 
	// Burada ortak bir class'ı ortak bir hatayı yani bu durumda Exception class'ı oluyor en alta yazmamız gerekiyor
	// Kısaca catch blokları özelden genele doğru gitmeli
	// VE BİR CATCH BLOĞU ÇALIŞIRSA EĞER ONUN ALTINDAKİ CATCH BLOKLARI ÇALIŞMIYOR KESİNLİKLE 
	System.out.println("Program çalışmaya kaldığı yerden devam ediyor");
	
	}
}
