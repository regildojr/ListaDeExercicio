import java.util.Scanner;

public class AumentoSalarial {

private static Scanner scanner;
public static void main(String [] args) {

float salario = 0;
float aumento = 0;
float aumento1 = 0;
System.out.println("Qual o valor salario recebido ?");
scanner = new Scanner(System.in);
salario = scanner.nextFloat();
System.out.println("qual e o aumento percentual ?");
aumento = scanner.nextFloat(); 
String num = "" + aumento;
num = num.replace(".", "");
num = "1." + num;
float a = Float.parseFloat(num);
float salarioaumento = salario * a;
float valorAumento = salarioaumento - salario;
System.out.println("Valor aumento: " + valorAumento + "; Salario novo:  " + salarioaumento);
}
}
public class AumentoSalarial {

}
