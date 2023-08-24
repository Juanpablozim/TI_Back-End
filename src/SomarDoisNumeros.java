import java.util.*;

class SomarDoisNumeros {
	public static void main (String args[]){
		//Declaracao de variaveis
		int num1, num2, soma;
		
		Scanner scanner = new Scanner(System.in);
		
		//Leituras
		System.out.println("Digite um número");
		num1 = scanner.nextInt();
		System.out.println("Digite outro número");
		num2 = scanner.nextInt();
		
		//Somar
		soma = num1 + num2;
		
		//Mostrar na tela
		System.out.println("Soma:" + soma);
	}
}
