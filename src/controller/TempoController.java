package controller;

import algoritmo.Ordenadores;

public class TempoController {
	public TempoController () {
		super(); 
	}
	
	public void bubblemet (int [] vetor) {
		Ordenadores ode = new Ordenadores(); 
		double TempoInicial = System.nanoTime();
		ode.funcaoBub(vetor);
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
		TempoTotal= TempoTotal / Math.pow(10, 9); 
		System.out.println("Tempo total com BubbleSort: " + TempoTotal);
		
	}
	
	public void mergemet (int [] vetor) {
		Ordenadores ode = new Ordenadores(); 
		double TempoInicial = System.nanoTime();
		ode.funcaoMerge(vetor, 0, vetor.length -1);
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
		TempoTotal= TempoTotal / Math.pow(10, 9); 
		System.out.println("Tempo total com MergeSort: " + TempoTotal);
		
	}
	
	public void quickmet (int [] vetor) {
		Ordenadores ode = new Ordenadores(); 
		double TempoInicial = System.nanoTime();
		ode.quick(vetor, 0, vetor.length -1); 
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
		TempoTotal= TempoTotal / Math.pow(10, 9); 
		System.out.println("Tempo total com QuickSort: " + TempoTotal);
	}
	

}
