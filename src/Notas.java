import java.util.Scanner;
public class Notas {

public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	float nota1;
	float nota2;
	float[] me=new float[6];
	float met=0;
	int aprovados=0,reprovados=0,fn=0;
	for(int i=0;i<6;i++) {
		System.out.println("1º nota:");
		nota1=input.nextFloat();
		System.out.println("2º nota:");
		nota2=input.nextFloat();
		me[i]=(nota1+nota2)/2;
		if(me[i]<3) {
			reprovados=reprovados+1;
		}else if(me[i]<7){
			fn=fn+1;
		}else {
			aprovados=aprovados+1;
		}
	}
	input.close();
	for(int i=0;i<6;i++) {
		System.out.println("Aluno"+(i+1)+" media= "+me[i]);
		met=me[i]+met;
		if(me[i]<3) {
			System.out.println("Reprovado");
		}else if(me[i]<7){
			System.out.println("Final");
		}else {
			System.out.println("Aprovado");
		}
	}
	met=met/6;
	System.out.println("Media da classe="+met);
	System.out.println("Aprovados="+aprovados);
	System.out.println("Final="+fn);
	System.out.println("Reprovados="+reprovados);
}
}