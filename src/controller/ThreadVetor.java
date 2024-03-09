package controller;

import java.text.DecimalFormat;

public class ThreadVetor extends Thread{
	int num;
	int[] vetor;

	public ThreadVetor(int num, int[] vetor) {
		this.num = num;
		this.vetor = vetor;
	}
	@Override
	public void run() {
		calcDesemp();
	}
	private void calcDesemp() {
		if(num % 2 == 0) {
			int inicio = (int) System.nanoTime();
			for(int i = 0; i < vetor.length; i++) {
				vetor[i] = vetor[i];
			}
			int fim = (int) System.nanoTime();
			int tempo = (fim - inicio);
			System.out.println("Tempo com for tradicional => " + tempo + " nanosegundos");
		} else {
			int inicio = (int) System.nanoTime();
			for(int n:vetor) {
				n = n;
			}
			int fim = (int) System.nanoTime();
			int tempo = (fim - inicio);
			System.out.println("Tempo com for each => " + tempo + " nanosegundos");
		}
		
	}

}
