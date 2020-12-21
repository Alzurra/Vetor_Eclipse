package Vetor;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product vect[] = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;

		System.out.printf("Average price = %.2f%n", avg);

		System.out.println("");
		System.out.println("Vetor[]");

		double a = sc.nextDouble();

		double vetor[] = new double[(int) a];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextDouble();
		}

		System.out.println(" ");

		double soma = 0;
		double media = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
			media = soma / vetor.length;
			System.out.print("[" + vetor[i] + "]" + " ");
		}

		System.out.println(" ");
		System.out.println("A soma dos valores dentro do vetor é = " + soma);
		System.out.printf("A média dos valores da soma do vetor é = %.2f%n", media);
		System.out.println();

		int vet[] = new int[3];

		for (int x : vet) {
			System.out.println("Por gentileza digite um número: ");
			x = sc.nextInt();
			System.out.print("[" + x + "]" + " ");

		}
	}
}
