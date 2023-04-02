package exercicio1;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int qtdNotas;
        double somaNotas = 0, media; 
        System.out.print("Informe a quantidade de notas: ");
        
        qtdNotas = texto.nextInt();
        
        for (int i = 1; i <= qtdNotas; i++) { 
            System.out.print("Informe a nota " + i + ": ");
            double nota = texto.nextDouble();
            somaNotas += nota;
        }
        media = somaNotas / qtdNotas;
        
        System.out.printf("Média das notas: %.2f\n", media); 
        if(media >= 6) { 
            System.out.println("Aluno aprovado!"); 
        }else{
            System.out.println("Aluno reprovado!"); 
        }

    }
}