import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tabuada = 0;
		
		while(true){
			System.out.println("Qual tabuada você quer? (Digite -1 para parar)?");
			tabuada = input.nextInt();
			
			if(tabuada == -1){
				break;
				
			}
			
			for (int i = 1; i<=10; i++){
				System.out.printf("%d x %d = %d%n", tabuada, i, tabuada * i);
				
			}
			
			System.out.println();
		}
		
		System.out.println("%ntUsuário terminou.%n");
		
		input.close();
	}
}