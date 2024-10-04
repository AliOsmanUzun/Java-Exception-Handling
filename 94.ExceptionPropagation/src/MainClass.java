
public class MainClass {

	public static void ucuncu_fonksiyon() {
			int a = 58/0;
			System.out.println("merhaba");// önceki kodda hata fırlatıldığı için bu kod bloğu çalışmıyor
			
	}
	
	public static void ikinci_fonksiyon() {
		try {
		ucuncu_fonksiyon();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception hatası alındı");
		}
		}
		
	
	public static void birinci_fonksiyon() {
		ikinci_fonksiyon();
	}
	public static void main(String[] args) {
		
	// İç içe fonksiyonlarda exception nasıl yakalanır
	
	// Bu işleme ExceptionPropagation deniyor.
		
	birinci_fonksiyon();
	
	// Bir stack'imiz var diye düşünelim bunun
	// Bu stack'in içerisinde ki ilk eleman main() metodu , ardından birinci_fonksiyon metodumuz
	// ondan sonra ikinci_fonksiyon metodumuz son olarak stack'te ucuncu_fonksiyon metodu yer alıyor.
	
	// Bu stack'te eğer bir exception varsa stack en dıştan içe doğru exception handle ediline kadar 
	// boşalmaya devam ediyor
	// Eğer hiç bir evre exception yakalanmaz ise program hata fırlatıyor.
	
	}

}
