
public class InvalidAgeException  extends ArithmeticException{


// Bir Unchecked Exception sınıfı olan ( yani RuntimeException'dan türeyen ) 
// ArithmeticException Class'ını extend ediyorum
// Biz bir exception extend ettikten sonra artık kendi class'ımızdan direkt olarak bir exception fırlatabiliriz.
//Ayrıca extend ettiğimiz class bir Unchecked exception class'ı olduğu için bu class'ımızda artık bir Unchecked 
// exception class'ı ( Java tarafından ön görülemez )
	
	
	
	
	
	@Override
	public void printStackTrace() {
		System.out.println("Bu bir invalid age hatasıdır... ");
	}


	public InvalidAgeException(String message) {// Hata ekranında mesaj olarak gösterilecek değer bu
		super(message);
	}
	
	
}

