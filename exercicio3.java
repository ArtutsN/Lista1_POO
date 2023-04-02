package exercicio1;

import java.util.Scanner;
public class exercicio3 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		System.out.println("Digite o nome do estudante: ");
		String nome = texto.nextLine();

		System.out.println("digite a nota 1: ");
		double n1 = texto.nextDouble();
		
		System.out.println("digite a nota 2: ");
		double n2 = texto.nextDouble();
		
		System.out.println("digite a nota 3: ");
		double n3 = texto.nextDouble();
		
		System.out.println("digite a nota 4: ");
		double n4 = texto.nextDouble();
		
		double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
		System.out.println("Media do(a) aluno(a): " + media);
		
		if(media >= 7.0) {
			System.out.println("Aluno aprovado!!!");
		}else if(media < 5.0) {
			System.out.println("Aluno reprovado");
		}else{
			System.out.println("Aluno em exame");
			
            System.out.print("Digite a nota do exame: ");
            double notaExame = texto.nextDouble();

            double novaMedia = (media + notaExame) / 2.0;
            System.out.printf("Nota do exame: %.1f\n", notaExame);

            if (novaMedia >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", novaMedia);
        }

    }
		
}	

