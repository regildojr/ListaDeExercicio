import java.util.Scanner; 
public class Prefeitura {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	float salario = 0.0f;
	float prestacao = 0.0f;
	
	System.out.println("Digite o seu salario: ");
	salario = input.nextFloat();
	
	System.out.println("Digite o valor da prestacao: ");
	prestacao = input.nextFloat();
	
	if(prestacao / salario < 0.3){
		System.out.println("Emprestimo feito com sucesso");

	} else {
		System.out.println("Emprestimo não concluido");
	}
	System.out.println("Acabou");
	
	input.close();
}
}