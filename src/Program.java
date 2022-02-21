import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X1, Y1, X2, Y2;
		double D;
		
		System.out.println("Digite o primeiro numero da coordenada: ");
		X1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero da coordenada: ");
		X2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro numero da coordenada: ");
		Y1 = sc.nextDouble();
		
		System.out.println("Digite o quarto numero da coordenada: ");
		Y2 = sc.nextDouble();
		
		D = (Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2)));
		
		System.out.printf("A dist�ncia � %.2f: ", D);

		
		sc.close();
	}

}
