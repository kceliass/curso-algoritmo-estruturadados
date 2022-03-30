package com.curso.estruturadados.vetor;

import java.util.Iterator;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
	}

	//	public void adicionar(String elemento) {
	//		for (int i=0; i<this.elementos.length; i++) {
	//			if(this.elementos[i] == null) {
	//				this.elementos[i] = elemento;
	//				break;
	//			}
	//		}
	//	}

	//	public void adicionar(String elemento)throws Exception{
	//		
	//		if (this.tamanho < this.elementos.length) {
	//			this.elementos[this.tamanho] = elemento;
	//			this.tamanho++;
	//		} else {
	//			throw new Exception("Vetor ja está cheio, não é possível adicionar mais elementos");
	//		}
	//	}

	public boolean adicionar(String elemento){

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}

	public void printar(){
		for (int i=0; i < this.elementos.length; i++) {
			System.out.println(this.elementos[i]);

		}
	}

}
