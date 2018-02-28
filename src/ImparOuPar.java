
import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int valor = 0;

	for (int i=0; i<10; i++){
		System.out.printf("Digite o %dº valor: ", i + 1);
		valor = input.nextInt();
		
		if (valor % 2 == 0){
			System.out.println("O valor par");
			
		} else{
			System.out.println("O valor impar");
		}
		
	}
		System.out.println("%nFim.%n");
		
		input.close();
	}
}