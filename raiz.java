package calculador_raiz;

import java.util.Scanner;

public class raiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int v1 = sc.nextInt();
		Object A = Math.sqrt(v1);
		System.out.println("O valor da raiz quadrada de " + v1 + " é: " + A);
		
		sc.close();

	}

}
