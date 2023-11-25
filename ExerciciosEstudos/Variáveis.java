package ExerciciosEstudos;
import java.util.Scanner;

public class Variáveis {

	public static void main(String[]  args) { 
		exercicio1();
		exercicio2();
		exercicio4();
		exercicio5();
		exercicio6();
		exercicio7();
	}

    private static void exercicio1() {
		
		try (Scanner entrada = new Scanner(System.in)) {
			int valor1, valor2, valor3;
			
			System.out.print("Digite um número");
			valor1 = entrada.nextInt();
			
			System.out.print("Digite outro número");
			valor2 = entrada.nextInt();
			
			System.out.print("Digite mais um número");
			valor3 = entrada.nextInt();
			
			int Soma = valor1 + valor2 + valor3;
			
			System.out.println("Soma é " + Soma);
		}
	}

    private static void exercicio2() {
		
		Scanner entrada = new Scanner(System.in);
		
		int mes;
		System.out.print("Digite um mes");
		mes = entrada.nextInt();
		
		if(mes == 1) {
		 System.out.println("Janeiro");
		}
			
		else if (mes == 2) {
		 System.out.println("Fevereiro");
		}
		else if(mes == 3) {
		System.out.println("Março");
		}		
		else if (mes == 4) {
		System.out.println("Abril");
		}		
		else if (mes == 5) {
		System.out.println("Maio");
		}
		else {
			System.out.println("MÊS INVALIDO");
		}
	}
	
    private static void exercicio4() {
		
		Scanner entrada = new Scanner(System.in);
		int l1, l2, l3;
		
		System.out.print("Digite um lado ");
		l1 = entrada.nextInt();
		
		System.out.print("Digite um lado ");
		l2 = entrada.nextInt();
		
		System.out.print("Digite um lado ");
		l3 = entrada.nextInt();
		
		if (l1 == l2 && l1 == l3) {
			System.out.println("Ele é um triângulo equilátero");
		}
		else {
			System.out.println("Não é um triângulo equilátero");
		}
			
	}

    private static void exercicio5() {
		
		Scanner entrada = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.print("Digite um número ");
		valor1 = entrada.nextInt();
		
		System.out.print("Digite um número ");
		valor2 = entrada.nextInt();
		
		if (valor1 > valor2) {
			System.out.print(valor1);
		}
		
		else if (valor1 < valor2) {
			System.out.print(valor2);
		}

		else {
			System.out.print("Eles são iguais");
		}
	
		
    }

    private static void exercicio6() {
		
		Scanner entrada = new Scanner(System.in);
		int valor1, valor2 , valor3, total = 0;
		
		System.out.print("Digite um número ");
		valor1 = entrada.nextInt();
		
		System.out.print("Digite um número ");
		valor2 = entrada.nextInt();
		
		System.out.print("Digite um número ");
		valor3 = entrada.nextInt();
		
		if(valor1 < 0) {
			total++;
		}
		
		if(valor2 < 0) {
			total++;
		}
		
		if(valor3 < 0) {
			total++;
		}
		
		System.out.println("Tem "  + total + " negativos");
		
    }

    private static void exercicio7() {
		
		Scanner entrada = new Scanner(System.in);
		int Idade;
		
		System.out.print("Digite sua idade ");
		Idade = entrada.nextInt();
		
		if (Idade < 16) {
			System.out.print(" Você não pode votar");
		}
		
		else if (Idade == 16 || Idade == 17 || Idade > 70) {
			System.out.print(" O voto é facutativo");
		}

		else {
			System.out.print(" O voto é obrigatório");
		}
		
    }
}
