import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		if (parametroUm > parametroDois) {
			System.out.println("o segundo parametro deve ser maior que o primeiro");
			
		}
		for (parametroUm = 1 ; parametroUm <=18 ; parametroUm++);
		for ( parametroDois = 1 ; parametroDois <=18 ; parametroDois++);
	 
		terminal.close();
	
	}
}