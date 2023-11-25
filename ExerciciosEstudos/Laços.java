package ExerciciosEstudos;

import java.util.Scanner;

public class Laços {
    public static void main(String[]  args) { 
		exercicio1();
		exercicio2();
		exercicio3();
		exercicio4();
	}

    private static void exercicio1() {
		
		int i = 10;
		while(i <= 100) {
			System.out.println(i);
			i++;
		}
			
		}

     private static void exercicio2() {
         int i = 3;
         while(i <= 30) {
        System.out.println(i);
         i = i + 3;
        }
     }

    private static void exercicio3() {
		Scanner entrada = new Scanner(System.in);
		int n; 
		
		System.out.print("Digite um número ");
		n = entrada.nextInt();
		
		int i = n;
		while(i <= 10*n ) {
			System.out.println(i);
			i = i + n;
				
	}
	}

    private static void exercicio4() {
		int i = 3, n = 0;
		while(i < 7) {	
			n = n + i;
			i++;
		}
		System.out.println(n);
		
	}
}
