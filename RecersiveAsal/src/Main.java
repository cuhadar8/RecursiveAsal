import java.util.Scanner;

public class Main {
	
	public static void isPrime(int number, int increasingValue) {
		
		if(number == increasingValue) {      //Kullanıcı 2 sayısını girdiğinde doğrudan bu bloğa girecek
			System.out.println(number + " asal sayıdır.");
			return;
		}
		else if(number % increasingValue == 0) {
			System.out.println(number + " asal sayı değildir.");
			return;
		}
		
		isPrime(number, increasingValue+1);  //2'den başlayarak, sayının kendisine gelene kadar bütün değerleri göndermiş oluyoruz
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int number = scanner.nextInt();
		isPrime(number, 2);
	}

}
