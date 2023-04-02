package exercicio1;

import java.util.Scanner;
public class exercicio1 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		
		System.out.println("digite um numero byte:");
		byte numByte = texto.nextByte();
		System.out.println("Numero byte: " + numByte);
		
		System.out.println("digite um numero short:");
		short numShort = texto.nextShort();
		System.out.println("Numero short: " + numShort);
		
		System.out.println("digite um numero int:");
		int numInt = texto.nextInt();
		System.out.println("Numero int: " + numInt);
		
		System.out.println("digite um numero long:");
		long numLong = texto.nextLong();
		System.out.println("Numero long: " + numLong);
		
		System.out.println("digite um numero boolean:");
		boolean numBoolean = texto.nextBoolean();
		System.out.println("Numero boolean: " + numBoolean);
		
		System.out.println("digite um numero char:");
		char numChar = texto.next().charAt(0);
		System.out.println("Numero char: " + numChar);
		
		System.out.println("digite um numero float:");
		float numFloat = texto.nextFloat();
		System.out.println("Numero float:" + numFloat);
		
		System.out.println("digite um numero double:");
		double numDouble = texto.nextDouble();
		System.out.println("Numero double:" + numDouble);
		
	}
}
