package view;

import controller.TempoController;

public class Principal {
	public static void main(String[] args) {
		TempoController tp = new TempoController(); 
		
        int[] vetor = new int[1500];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor.length - i - 1;
        }
        
        tp.bubblemet(vetor);
        tp.mergemet(vetor);
        tp.quickmet(vetor);
 	
	}

}
