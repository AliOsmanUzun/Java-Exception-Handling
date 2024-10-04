
public class MainClass {
		@SuppressWarnings({ "unused", "null" })
		public static void main(String[] args) {
		
		// Finally blokları try ve catch blokları ile beraber kullanılır. 
		// İçerisinde yer alan kodlar , exception meydana gelsin veya gelmesin her durumda çalıştırılır
		/*
		 finally bloğunun temel amacı, try bloğunda kullanılan kaynakları 
		 (örneğin, dosya, veritabanı bağlantısı, ağ bağlantısı vb.)
		 serbest bırakmak veya kapatmak gibi işlemleri garanti altına almaktır.
		 Böylece, programda bir istisna meydana gelse bile, bu kaynaklar düzgün bir şekilde serbest bırakılır.
		 
		 Genellikle try catch yapısının sonunda kullanılır
		 Yani kısaca try ve catch blokları çalışsada çalışmasada finally bloğu kesinlikle çalışacaktır.
		 Bir exception oluşssun veya oluşmasın yine çalışacak
		 Hatta try ve catch blokları içerisinde return komutu kullanılsa bile finally metodu çalışacaktır.
		 Kodlarımızda muhakkak yapılmasını her halükarda çalışmasını istediğimiz bölümler finally blok içerisinde 
		 kullanabiliyoruz.
		 Dosya kapama , veri tabanı bağlantısını kesme işlemlerini finally bloğu ile kullanıyoruz sıklıkla 
		 */
			
		try {
			int a = 30/0;
			String g = null ;
			System.out.println(g.hashCode());
		}
		catch(ArithmeticException e ) {
			System.out.println("Bir sayıyı 0'a bölemezsiniz...");
			
		} 
		catch(NullPointerException e) {
		System.out.println("Null Referans Hatası Oluştu");
		}
		finally {
			System.out.println("Exception oluşsun oluşmasın buradaki kod her halükarda çalışacak");
		}
		System.out.println("Buradayım");
		// Exception'ı yakalamazsak bile finally bloğu yine çalışır ve çalıştıktan sonra 
		// derleyici exception'ın hatası verir ve prograramı sonlandırır.
			
		}
}
