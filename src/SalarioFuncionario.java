import java.util.Scanner;
public class SalarioFuncionario {

public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float salario;
		String nome;
		do{
			System.out.println("Informe o nome do funcionario:");
			nome=input.nextLine();
			System.out.println("Informe o salario do funcionario:");
			salario=input.nextFloat();
			input.nextLine();
			if(salario<500) {
				salario=(float) (salario+(salario*0.2));
				System.out.println(nome+" foi reajustado para :R$"+salario);
			}else {
				System.out.println(nome+" sem direito para ter aumento.");
			}
		}while(nome.equalsIgnoreCase("fim")==false);
		input.close();
		}
}